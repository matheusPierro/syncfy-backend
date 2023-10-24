package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "UF")
public class Uf {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_UF")
    @SequenceGenerator(name = "SQ_UF", sequenceName = "SQ_UF")
    @Column(name = "ID_UF")
    private Long id;

    @Column(name = "UF", nullable = false)
    private String uf;

    @OneToOne
    @JoinColumn(name = "ID_ADDRESS")
    private Address address;

    public Uf() {
    }

    public Uf(Long id, String uf, Address address) {
        this.id = id;
        this.uf = uf;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public Uf setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUf() {
        return uf;
    }

    public Uf setUf(String uf) {
        this.uf = uf;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Uf setAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Uf{" +
                "id=" + id +
                ", uf='" + uf + '\'' +
                ", address=" + address +
                '}';
    }
}