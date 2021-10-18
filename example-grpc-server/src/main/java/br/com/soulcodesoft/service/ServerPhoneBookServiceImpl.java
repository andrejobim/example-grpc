package br.com.soulcodesoft.service;


import br.com.soulcodesoft.entity.Contact;
import br.com.soulcodesoft.entity.Telephone;
import br.com.soulcodesoft.entity.TypeNumber;
import br.com.soulcodesoft.protoentity.ContactMessage;
import br.com.soulcodesoft.protoentity.TelephoneMessage;
import br.com.soulcodesoft.protoservice.PhoneBookServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class ServerPhoneBookServiceImpl extends PhoneBookServiceGrpc.PhoneBookServiceImplBase {

    private static Logger LOGGER = LoggerFactory.getLogger(ServerPhoneBookServiceImpl.class.getName());

    @Autowired
    private ContactService contactService;

    @Override
    public void recordContactSimpleRpc(ContactMessage request, StreamObserver<ContactMessage> responseObserver) {
        super.recordContactSimpleRpc(request, responseObserver);
    }

    @Override
    public StreamObserver<ContactMessage> recordContactClientStream(StreamObserver<ContactMessage> responseObserver) {
        return new StreamObserver<ContactMessage>() {

            private List<Contact> contacts;
            private ContactMessage contactMessageTemp;

            @Override
            public void onNext(ContactMessage contactMessage) {
                LOGGER.info("4) Procurar telefones cadastrados do contato: "+contactMessage.getName());
                ContactMessage.Builder builderContact = ContactMessage.newBuilder(contactMessage);
                LOGGER.info("5) Buscando contatos ... ");
                contacts = contactService.findByName(contactMessage.getName());
                LOGGER.info("6) Total de contatos encontrados com o nome: "+contacts.size());
                for (Contact contact: contacts){
                    Set<Telephone> telephones = contact.getTelephones();
                    for (Telephone telephone : telephones){
                        LOGGER.info("Montando objeto TelefoneMensagem ... ");
                        TelephoneMessage telephoneMessage = TelephoneMessage.newBuilder()
                                .setNumber(telephone.getNumber())
                                .setType(TelephoneMessage.TypeNumber.valueOf(telephone.getType()))
                                .build();
                        LOGGER.info("Verificando se o contato já possui o telefone em sua lista. ");
                        if (!builderContact.getTelephonesList().contains(telephoneMessage)){
                            LOGGER.info("Incluindo novo telefone na lista do contato: "+contactMessage.getName());
                            builderContact.addTelephones(telephoneMessage);
                        }
                    }
                }
                if (contacts.isEmpty()){
                    LOGGER.info("7) Nenhum contato encontrado com nome: "+contactMessage.getName());
                    contactMessageTemp = contactMessage;
                } else {
                    LOGGER.info("7) Criando Contato para o retorno da consulta.");
                    contactMessageTemp = builderContact.build();
                }
            }
            @Override
            public void onError(Throwable throwable) {
                LOGGER.error("6) Ocorreu um erro ao buscar informações adicionais", throwable);
            }
            @Override
            public void onCompleted() {
                LOGGER.info("8) Colocando no stream para devolver o contato.");
                responseObserver.onNext(contactMessageTemp);
                LOGGER.info("9) Finalizando o metodo e encerrando a stream!");
                responseObserver.onCompleted();
            }
        };
    }


    @Override
    public void recordContactServerStream(ContactMessage request, StreamObserver<ContactMessage> responseObserver) {
        LOGGER.info("2) Procurar telefones cadastrados do contato: "+request.getName());
        LOGGER.info("3) Buscando contatos ... ");
        List<Contact> contacts  = contactService.findByName(request.getName());
        LOGGER.info("4) Total de contatos encontrados com o nome: "+contacts.size());
        for (Contact contact: contacts){
            LOGGER.info("Montando objeto ContatoMessage ... ");

            Set<Telephone> telephones = contact.getTelephones();
            for (Telephone telephone : telephones){
                LOGGER.info("Incluindo novo telefone na lista do contato: "+request.getName());
                contact.getTelephones().add(telephone);
            }
            LOGGER.info("Retornando contato: "+request.getName());
            responseObserver.onNext(request);
        }
        if (contacts.isEmpty()){
            LOGGER.info("5) Nenhum contato encontrado com nome: "+request.getName());
        } else {
            LOGGER.info("5) Criando Contato para o retorno da consulta.");
        }
        LOGGER.info("6) Finalizando o metodo e encerrando a stream!");
        responseObserver.onCompleted();

    }

    @Override
    public StreamObserver<ContactMessage> recordContactBidirecionalStream(StreamObserver<ContactMessage> responseObserver) {
        return new StreamObserver<ContactMessage>() {
            @Override
            public void onNext(ContactMessage contactMessage) {
                LOGGER.info("7) Procurar telefones cadastrados do contato: "+contactMessage.getName());
                LOGGER.info("8) Buscando contatos ... ");
                List<Contact> contacts  = contactService.findByName(contactMessage.getName());
                LOGGER.info("9) Total de contatos encontrados com o nome: "+contacts.size());
                for (Contact contact: contacts){
                    LOGGER.info("Montando objeto TelefoneMensagem ... ");
                    ContactMessage contactMessageResponse = ContactMessage.newBuilder()
                            .setName(contact.getNome())
                            .setType(ContactMessage.TypeContact.valueOf(contact.getType()))
                            .build();
                    LOGGER.info("Incluindo novo telefone na lista do contato: "+contact.getNome());
                    populateTelefoneMessage(contactMessageResponse, contact);
                    LOGGER.info("Retornando telefones do contato: "+contact.getNome());
                    responseObserver.onNext(contactMessageResponse);
                }
                Contact contact = new Contact(contactMessage.getName(), contactMessage.getType().name());
                List<TelephoneMessage> telephonesMessages = contactMessage.getTelephonesList();
                if (!telephonesMessages.isEmpty()){
                    for (TelephoneMessage telephoneMessage: telephonesMessages){
                        contact.getTelephones().add(new Telephone(telephoneMessage.getNumber(), TypeNumber.valueOf(telephoneMessage.getType().name()), contact));
                    }
                }
                LOGGER.info("Gravando contato: "+contact.getNome());
                contactService.persist(contact);
                responseObserver.onNext(contactMessage);
            }
            @Override
            public void onError(Throwable throwable) {
                LOGGER.error("10) Ocorreu um erro ao buscar/gravar contato", throwable);
            }
            @Override
            public void onCompleted() {
                LOGGER.info("10) Finalizando o metodo e encerrando a stream no lado do servidor!");
                responseObserver.onCompleted();
            }
        };
    }

    private void populateTelefoneMessage(ContactMessage contactMessageResponse, Contact contact) {
        for (Telephone telephone: contact.getTelephones()){
            TelephoneMessage telephoneMessage = TelephoneMessage.newBuilder()
                    .setNumber(telephone.getNumber())
                    .setType(TelephoneMessage.TypeNumber.valueOf(telephone.getType()))
                    .build();
            if (!contactMessageResponse.getTelephonesList().contains(telephoneMessage)){
                contactMessageResponse.getTelephonesList().add(telephoneMessage);
            }
        }
    }
}
