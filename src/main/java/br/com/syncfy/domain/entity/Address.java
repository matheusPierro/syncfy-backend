package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ADDRESS")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ADDRESS")
    @SequenceGenerator(name = "SQ_ADDRESS", sequenceName = "SQ_ADDRESS")
    @Column(name = "ID_ADDRESS")
    private Long id;

    @Column(name = "STREET")
    private String street;

    @Column(name = "NUMBER")
    private int number;

    @Column(name = "COMPLEMENT")
    private String complement;

    @OneToOne
    @JoinColumn(name = "ID_COMPANY_USER_ADDRESS")
    private CompanyUserAddress companyUserAddressId;

    @OneToOne
    @JoinColumn(name = "CNPJ")
    private CompanyUserAddress companyUserAddressCnpj;

    @OneToOne
    @JoinColumn(name = "ID_VENDOR_ADDRESS")
    private VendorAddress vendorAddressId;

    @OneToOne
//    @JoinColumn(name = "ID_VENDOR_ADDRESS")
    private VendorAddress vendorAddressVendorId;

    @OneToOne
//    @JoinColumn(name = "ID_ADDRESS")
    private VendorAddress vendorAddressVendorCnpj;

    public Address() {
    }

    public Address(Long id, String street, int number, String complement, CompanyUserAddress companyUserAddressId, CompanyUserAddress companyUserAddressCnpj, VendorAddress vendorAddressId, VendorAddress vendorAddressVendorId, VendorAddress vendorAddressVendorCnpj) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.companyUserAddressId = companyUserAddressId;
        this.companyUserAddressCnpj = companyUserAddressCnpj;
        this.vendorAddressId = vendorAddressId;
        this.vendorAddressVendorId = vendorAddressVendorId;
        this.vendorAddressVendorCnpj = vendorAddressVendorCnpj;
    }

    public Long getId() {
        return id;
    }

    public Address setId(Long id) {
        this.id = id;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public Address setNumber(int number) {
        this.number = number;
        return this;
    }

    public String getComplement() {
        return complement;
    }

    public Address setComplement(String complement) {
        this.complement = complement;
        return this;
    }

    public CompanyUserAddress getCompanyUserAddressId() {
        return companyUserAddressId;
    }

    public Address setCompanyUserAddressId(CompanyUserAddress companyUserAddressId) {
        this.companyUserAddressId = companyUserAddressId;
        return this;
    }

    public CompanyUserAddress getCompanyUserAddressCnpj() {
        return companyUserAddressCnpj;
    }

    public Address setCompanyUserAddressCnpj(CompanyUserAddress companyUserAddressCnpj) {
        this.companyUserAddressCnpj = companyUserAddressCnpj;
        return this;
    }

    public VendorAddress getVendorAddressId() {
        return vendorAddressId;
    }

    public Address setVendorAddressId(VendorAddress vendorAddressId) {
        this.vendorAddressId = vendorAddressId;
        return this;
    }

    public VendorAddress getVendorAddressVendorId() {
        return vendorAddressVendorId;
    }

    public Address setVendorAddressVendorId(VendorAddress vendorAddressVendorId) {
        this.vendorAddressVendorId = vendorAddressVendorId;
        return this;
    }

    public VendorAddress getVendorAddressVendorCnpj() {
        return vendorAddressVendorCnpj;
    }

    public Address setVendorAddressVendorCnpj(VendorAddress vendorAddressVendorCnpj) {
        this.vendorAddressVendorCnpj = vendorAddressVendorCnpj;
        return this;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", number=" + number +
                ", complement='" + complement + '\'' +
                ", companyUserAddressId=" + companyUserAddressId +
                ", companyUserAddressCnpj=" + companyUserAddressCnpj +
                ", vendorAddressId=" + vendorAddressId +
                ", vendorAddressVendorId=" + vendorAddressVendorId +
                ", vendorAddressVendorCnpj=" + vendorAddressVendorCnpj +
                '}';
    }
}
