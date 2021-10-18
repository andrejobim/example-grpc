package br.com.soulcodesoft.service;

import br.com.soulcodesoft.dao.ContactDAO;
import br.com.soulcodesoft.entity.Contact;
import br.com.soulcodesoft.entity.TypeContact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = { ServiceException.class })
public class ContactServiceImpl implements ContactService {

    private static Logger LOGGER = LoggerFactory.getLogger(ContactServiceImpl.class.getName());

    private final ContactDAO contactDAO;

    @Autowired
    public ContactServiceImpl(ContactDAO contactDAO) {
        this.contactDAO = contactDAO;
    }

    @Override
    public void persist(Contact c) {
        contactDAO.persist(c);
    }

    @Override
    public List<Contact> findByAttribute(String field, Object value) {
        LOGGER.info("Parametro: "+field+ " - Valor: "+ value);
        return contactDAO.findByAttribute(field, value);
    }

    @Override
    public List<Contact> findByName(String name) {
        return contactDAO.findByName(name);
    }

    @Override
    public List<Contact> findByType(TypeContact typeContact) {
        return contactDAO.findByType(typeContact);
    }


}
