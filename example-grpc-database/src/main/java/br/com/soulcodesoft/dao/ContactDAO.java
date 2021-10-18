package br.com.soulcodesoft.dao;

import br.com.soulcodesoft.entity.Contact;
import br.com.soulcodesoft.entity.TypeContact;

import java.util.List;

public interface ContactDAO {

    void persist(Contact c);

    List<Contact> findByAttribute(String field, Object value);

    List<Contact> findByName(String name);

    List<Contact> findByType(TypeContact typeContact);
}
