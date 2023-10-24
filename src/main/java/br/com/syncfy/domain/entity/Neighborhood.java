package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "NEIGHBORHOOD")
public class Neighborhood {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_NEIGHBORHOOD")
    @SequenceGenerator(name = "SQ_NEIGHBORHOOD", sequenceName = "SQ_NEIGHBORHOOD")
    @Column(name = "ID_NEIGHBORHOOD")
    private Long id;

    @Column(name = "NEIGHBORHOOD", nullable = false)
    private String neighborhood;

    @OneToOne
    @JoinColumn(name = "ID_ADDRESS")
    private Address address;

    public Neighborhood() {
    }

    public Neighborhood(Long id, String neighborhood, Address address) {
        this.id = id;
        this.neighborhood = neighborhood;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public Neighborhood setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public Neighborhood setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Neighborhood setAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Neighborhood{" +
                "id=" + id +
                ", neighborhood='" + neighborhood + '\'' +
                ", address=" + address +
                '}';
    }
}
