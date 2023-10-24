package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "IBGE_CODE")
public class IBGECode {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_IBGE_CODE")
    @SequenceGenerator(name = "SQ_IBGE_CODE", sequenceName = "SQ_IBGE_CODE")
    @Column(name = "ID_IBGE_CODE")
    private Long id;

    @Column(name = "IBGE_CODE")
    private int ibgeCode;

    @OneToOne
    @JoinColumn(name = "ID_ADDRESS")
    private Address address;

    public IBGECode() {
    }

    public IBGECode(Long id, int ibgeCode, Address address) {
        this.id = id;
        this.ibgeCode = ibgeCode;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public IBGECode setId(Long id) {
        this.id = id;
        return this;
    }

    public int getIbgeCode() {
        return ibgeCode;
    }

    public IBGECode setIbgeCode(int ibgeCode) {
        this.ibgeCode = ibgeCode;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public IBGECode setAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "IBGECode{" +
                "id=" + id +
                ", ibgeCode=" + ibgeCode +
                ", address=" + address +
                '}';
    }
}
