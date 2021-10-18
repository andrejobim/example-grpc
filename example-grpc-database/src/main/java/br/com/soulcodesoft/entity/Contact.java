package br.com.soulcodesoft.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "contact", schema = "public")
public class Contact {

    private Long idContact;
    private String nome;
    private String type;
    private Set<Telephone> telephones = new HashSet<Telephone>(0);

    public Contact() {
    }

    public Contact(String nome, String type) {
        this.nome = nome;
        this.type = type;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_contact", unique = true, nullable = false)
    public Long getIdContact() {
        return idContact;
    }

    public void setIdContact(Long idContact) {
        this.idContact = idContact;
    }

    @Column(name = "nome", length = 200)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "tipo", length = 100)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "contact")
    public Set<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(Set<Telephone> telephones) {
        this.telephones = telephones;
    }
}
