package br.com.soulcodesoft.service;

import br.com.soulcodesoft.entity.Contact;
import br.com.soulcodesoft.entity.TypeContact;

import java.util.List;

public interface ContactService {

    void persist(Contact c);

    List<Contact> findByAttribute(String field, Object value);

    List<Contact> findByName(String name);

    List<Contact> findByType(TypeContact typeContact);
}
