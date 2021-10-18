package br.com.soulcodesoft.dao;

import br.com.soulcodesoft.entity.Contact;
import br.com.soulcodesoft.entity.TypeContact;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ContactDAOImpl extends AbstractDAO<Contact> implements ContactDAO {

    @Override
    public void persist(Contact c) {
        super.persist(c);
    }

    @Override
    public List<Contact> findByAttribute(String field, Object value) {
        return super.findByAttribute(field, value);
    }

    @Override
    public List<Contact> findByName(String name){
        final CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        final CriteriaQuery<Contact> criteriaQuery = criteriaBuilder.createQuery(Contact.class);
        Root<Contact> root = criteriaQuery.from(Contact.class);
        root.fetch("telephones");

        final List<Predicate> predicates = new ArrayList<>();
        predicates.add(criteriaBuilder.equal(root.get("nome"), name));
        criteriaQuery.where(predicates.toArray(new Predicate[]{}));
        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public List<Contact> findByType(TypeContact typeContact){
        final CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        final CriteriaQuery<Contact> criteriaQuery = criteriaBuilder.createQuery(Contact.class);
        Root<Contact> root = criteriaQuery.from(Contact.class);
        root.fetch("telephones");

        final List<Predicate> predicates = new ArrayList<>();
        predicates.add(criteriaBuilder.equal(root.get("type"), typeContact.name()));
        criteriaQuery.where(predicates.toArray(new Predicate[]{}));
        return entityManager.createQuery(criteriaQuery).getResultList();
    }
}
