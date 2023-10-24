package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "VENDOR")
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_VENDOR")
    @SequenceGenerator(name = "SQ_VENDOR", sequenceName = "SQ_VENDOR")
    @Column(name = "ID_VENDOR")
    private Long id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "CNPJ", nullable = false)
    private String cnpj;
    @Column(name = "EMAIL", nullable = false)
    private String email;

    public Vendor() {
    }

    public Vendor(Long id, String name, String cnpj, String email) {
        this.id = id;
        this.name = name;
        this.cnpj = cnpj;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public Vendor setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Vendor setName(String name) {
        this.name = name;
        return this;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Vendor setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Vendor setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
