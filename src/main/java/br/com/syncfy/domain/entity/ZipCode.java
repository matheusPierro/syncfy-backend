package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ZIP_CODE")
public class ZipCode {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ZIP_CODE")
    @SequenceGenerator(name = "SQ_ZIP_CODE", sequenceName = "SQ_ZIP_CODE")
    @Column(name = "ID_ZIP_CODE")
    private Long id;

    @Column(name = "ZIP_CODE", nullable = false)
    private int zipCode;

    @OneToOne
    @JoinColumn(name = "ID_ADDRESS")
    private Address address;

    public ZipCode() {
    }

    public ZipCode(Long id, int zipCode, Address address) {
        this.id = id;
        this.zipCode = zipCode;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public ZipCode setId(Long id) {
        this.id = id;
        return this;
    }

    public int getZipCode() {
        return zipCode;
    }

    public ZipCode setZipCode(int zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public ZipCode setAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "ZipCode{" +
                "id=" + id +
                ", zipCode=" + zipCode +
                ", address=" + address +
                '}';
    }
}
