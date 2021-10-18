package br.com.soulcodesoft.entity;

import javax.persistence.*;

@Entity
@Table(name = "telephone", schema = "public")
public class Telephone {

    private Long idTelephone;
    private String number;
    private String type;
    private Contact contact;

    public Telephone() {
    }

    public Telephone(Long idTelephone, String number, String type, Contact contact) {
        this.idTelephone = idTelephone;
        this.number = number;
        this.type = type;
        this.contact = contact;
    }

    public Telephone(String number, TypeNumber valueOf, Contact contact) {
        this.number = number;
        this.type = valueOf.name();
        this.contact = contact;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_telephone", unique = true, nullable = false)
    public Long getIdTelephone() {
        return idTelephone;
    }

    public void setIdTelephone(Long idTelephone) {
        this.idTelephone = idTelephone;
    }

    @Column(name = "number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contact")
    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
