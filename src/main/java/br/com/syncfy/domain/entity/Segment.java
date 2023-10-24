package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "SEGMENT")
public class Segment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_SEGMENT")
    @SequenceGenerator(name = "SQ_SEGMENT", sequenceName = "SQ_SEGMENT")
    @Column(name = "ID_SEGMENT")
    private Long id;

    @Column(name = "SEGMENT")
    private String segment;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_VENDOR",
            referencedColumnName = "ID_VENDOR",
            foreignKey = @ForeignKey(name = "FK_VENDOR_ID_SEGMENT"),
            nullable = false
    )
    private Vendor vendorId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "CNPJ_VENDOR",
            referencedColumnName = "CNPJ",
            foreignKey = @ForeignKey(name = "FK_VENDOR_CNPJ_SEGMENT"),
            nullable = false
    )
    private Vendor vendorCnpj;

    public Segment() {
    }

    public Segment(Long id, String segment, Vendor vendorId, Vendor vendorCnpj) {
        this.id = id;
        this.segment = segment;
        this.vendorId = vendorId;
        this.vendorCnpj = vendorCnpj;
    }

    public Long getId() {
        return id;
    }

    public Segment setId(Long id) {
        this.id = id;
        return this;
    }

    public String getSegment() {
        return segment;
    }

    public Segment setSegment(String segment) {
        this.segment = segment;
        return this;
    }

    public Vendor getVendorId() {
        return vendorId;
    }

    public Segment setVendorId(Vendor vendorId) {
        this.vendorId = vendorId;
        return this;
    }

    public Vendor getVendorCnpj() {
        return vendorCnpj;
    }

    public Segment setVendorCnpj(Vendor vendorCnpj) {
        this.vendorCnpj = vendorCnpj;
        return this;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "id=" + id +
                ", segment='" + segment + '\'' +
                ", vendorId=" + vendorId +
                ", vendorCnpj=" + vendorCnpj +
                '}';
    }
}
