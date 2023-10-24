package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "VENDOR_ADDRESS")
public class VendorAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_VENDOR_ADDRESS")
    @SequenceGenerator(name = "SQ_VENDOR_ADDRESS", sequenceName = "SQ_VENDOR_ADDRESS")
    @Column(name = "ID_VENDOR_ADDRESS")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_VENDOR",
            referencedColumnName = "ID_VENDOR",
            foreignKey = @ForeignKey(name = "FK_VENDOR_ID_VENDOR_ADDRESS"),
            nullable = false
    )
    private Vendor vendorId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "CNPJ_VENDOR",
            referencedColumnName = "CNPJ",
            foreignKey = @ForeignKey(name = "FK_VENDOR_CNPJ_VENDOR_ADDRESS"),
            nullable = false
    )
    private Vendor vendorCnpj;

    @OneToOne
    @JoinColumn(name = "ID_SHIPPING_COST")
    private ShippingCost shippingCost;

    public VendorAddress() {
    }

    public VendorAddress(Long id, Vendor vendorId, Vendor vendorCnpj, ShippingCost shippingCost) {
        this.id = id;
        this.vendorId = vendorId;
        this.vendorCnpj = vendorCnpj;
        this.shippingCost = shippingCost;
    }

    public Long getId() {
        return id;
    }

    public VendorAddress setId(Long id) {
        this.id = id;
        return this;
    }

    public Vendor getVendorId() {
        return vendorId;
    }

    public VendorAddress setVendorId(Vendor vendorId) {
        this.vendorId = vendorId;
        return this;
    }

    public Vendor getVendorCnpj() {
        return vendorCnpj;
    }

    public VendorAddress setVendorCnpj(Vendor vendorCnpj) {
        this.vendorCnpj = vendorCnpj;
        return this;
    }

    public ShippingCost getShippingCost() {
        return shippingCost;
    }

    public VendorAddress setShippingCost(ShippingCost shippingCost) {
        this.shippingCost = shippingCost;
        return this;
    }

    @Override
    public String toString() {
        return "VendorAddress{" +
                "id=" + id +
                ", vendorId=" + vendorId +
                ", vendorCnpj=" + vendorCnpj +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
