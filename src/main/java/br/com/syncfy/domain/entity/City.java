package br.com.syncfy.domain.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "CITY")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CITY")
    @SequenceGenerator(name = "SQ_CITY", sequenceName = "SQ_CITY")
    @Column(name = "ID_CITY")
    private Long id;

    @Column(name = "CITY", nullable = false)
    private String city;

    @OneToOne
    @JoinColumn(name = "ID_ADDRESS")
    private Address address;

    public City() {
    }

    public City(Long id, String city, Address address) {
        this.id = id;
        this.city = city;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public City setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCity() {
        return city;
    }

    public City setCity(String city) {
        this.city = city;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public City setAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", address=" + address +
                '}';
    }
}