package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "COUNTRY")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_COUNTRY")
    @SequenceGenerator(name = "SQ_COUNTRY", sequenceName = "SQ_COUNTRY")
    @Column(name = "ID_COUNTRY")
    private Long id;

    @Column(name = "COUNTRY", nullable = false)
    private String country;

    @OneToOne
    @JoinColumn(name = "ID_ADDRESS")
    private Address address;

    public Country() {
    }

    public Country(Long id, String country, Address address) {
        this.id = id;
        this.country = country;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public Country setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Country setCountry(String country) {
        this.country = country;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Country setAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", address=" + address +
                '}';
    }
}
