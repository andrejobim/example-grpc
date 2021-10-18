package br.com.soulcodesoft.service;

import br.com.soulcodesoft.protoentity.ContactMessage;
import br.com.soulcodesoft.protoentity.TelephoneMessage;
import br.com.soulcodesoft.protoservice.PhoneBookServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class ClientPhoneBookServiceImpl implements ClientPhoneBookService {

    private final static Logger LOGGER = LoggerFactory.getLogger(ClientPhoneBookServiceImpl.class);

    private static ContactMessage contactMessage;
    private static PhoneBookServiceGrpc.PhoneBookServiceStub bookServiceStub;
    private static PhoneBookServiceGrpc.PhoneBookServiceBlockingStub blockStub;
    private GrpcClientService grpcClientService;

    @Autowired
    public ClientPhoneBookServiceImpl(GrpcClientService grpcClientService) {
        this.grpcClientService = grpcClientService;
    }

    @PostConstruct
    public void callAllMethods(){
        bookServiceStub = grpcClientService.getBookStub();
        contactMessage = ContactMessage.newBuilder()
                .setName("Andre")
                .setType(ContactMessage.TypeContact.AMIGO)
                .addTelephones(TelephoneMessage.newBuilder()
                        .setNumber("(48) 0000-0000").setType(TelephoneMessage.TypeNumber.CELULAR).build())
                .build();
       shouldCallRecordContactBidirecionalStream();
       souldCallRecordContactClientStream(contactMessage);
       shouldCallRecordContactServerStream(contactMessage);

    }

    // rpc recordContactBidirecionalStream(stream contact.ContactMessage) returns(stream contact.ContactMessage){};
    @Override
    public void shouldCallRecordContactBidirecionalStream() {
        StreamObserver<ContactMessage> streamObserver = bookServiceStub.recordContactBidirecionalStream(new StreamObserver<ContactMessage>() {
            @Override
            public void onNext(ContactMessage contactMessage) {
                LOGGER.info("11) Resposta do contato após consulta/gravacao ser finalizada "+ contactMessage.getName());
            }
            @Override
            public void onError(Throwable throwable) {
                LOGGER.info("11) Ocorreu um erro na consulta", throwable);
            }
            @Override
            public void onCompleted() {
                LOGGER.info("12) Finalizando o metodo e encerrando a stream no lado do cliente!");
            }
        });
        LOGGER.info("1) Abrindo conexão Stream com o servidor ");

        LOGGER.info("2) Criando contato Pedro para envio ");
        ContactMessage pedro = ContactMessage.newBuilder()
                .setName("Andre")
                .setType(ContactMessage.TypeContact.AMIGO)
                .addTelephones(TelephoneMessage.newBuilder()
                        .setNumber("(48) 0000-0000").setType(TelephoneMessage.TypeNumber.CELULAR).build())
                .build();
        LOGGER.info("3) Criando contato Ricardo para envio ");
        ContactMessage ricardo = ContactMessage.newBuilder()
                .setName("Ricardo")
                .setType(ContactMessage.TypeContact.AMIGO)
                .addTelephones(TelephoneMessage.newBuilder()
                        .setNumber("(48) 9999-4444").setType(TelephoneMessage.TypeNumber.CELULAR).build())
                .build();
        LOGGER.info("4) Enviando contato Pedro para gravar ");
        streamObserver.onNext(pedro);
        LOGGER.info("5) Enviando contato Ricardo para gravar ");
        streamObserver.onNext(ricardo);
        LOGGER.info("6) Finalizando a conexao Stream com servidor.");
        streamObserver.onCompleted();
    }

    // rpc recordContactServerStream(contact.ContactMessage) returns(stream contact.ContactMessage){};
    @Override
    public void shouldCallRecordContactServerStream(ContactMessage contactMessage) {
        StreamObserver<ContactMessage> streamObserver = new StreamObserver<ContactMessage>() {
            @Override
            public void onNext(ContactMessage contactMessage) {
                LOGGER.info("7) Resposta do contato após a consulta ser finalizada "+ contactMessage.getName());
            }
            @Override
            public void onError(Throwable throwable) {
                LOGGER.info("7) Ocorreu um erro na consulta", throwable);
            }
            @Override
            public void onCompleted() {
                LOGGER.info("8) Consulta realizada com sucesso! ");
            }
        };

        LOGGER.info("1) Chamando metodos para buscar telefones: "+ contactMessage.getName());
        bookServiceStub.recordContactServerStream(contactMessage, streamObserver);
    }

    // rpc recordContactClientStream(stream contact.ContactMessage) returns(contact.ContactMessage){};
    @Override
    public void souldCallRecordContactClientStream(ContactMessage contactMessage){
        StreamObserver<ContactMessage> streamObserver = new StreamObserver<ContactMessage>() {
            @Override
            public void onNext(ContactMessage contactMessage) {
                LOGGER.info("10) Resposta do contato após a consulta ser finalizada "+ contactMessage.getName());
            }
            @Override
            public void onError(Throwable throwable) {
                LOGGER.info("11) Ocorreu um erro na consulta", throwable);
            }
            @Override
            public void onCompleted() {
                LOGGER.info("11) Consulta realizada com sucesso! ");
            }
        };
        LOGGER.info("1) Chamando metodos para buscar telefones: "+ contactMessage.getName());
        StreamObserver<ContactMessage> recordContactClientStream = bookServiceStub.recordContactClientStream(streamObserver);
        LOGGER.info("2) Envia o contato como parametro.");
        recordContactClientStream.onNext(contactMessage);
        LOGGER.info("3) Finalizado a requisição Stream.");
        recordContactClientStream.onCompleted();
    }


}
