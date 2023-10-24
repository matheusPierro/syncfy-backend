package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PHONE")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PHONE")
    @SequenceGenerator(name = "SQ_PHONE", sequenceName = "SQ_PHONE")
    @Column(name = "ID_SQ_PHONE")
    private Long id;

    @Column(name = "NUMBER", nullable = false)
    private int number;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_VENDOR",
            referencedColumnName = "ID_VENDOR",
            foreignKey = @ForeignKey(name = "FK_VENDOR_ID_PHONE"),
            nullable = false
    )
    private Vendor vendorId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "CNPJ_VENDOR",
            referencedColumnName = "CNPJ",
            foreignKey = @ForeignKey(name = "FK_VENDOR_CNPJ_PHONE"),
            nullable = false
    )
    private Vendor vendorCnpj;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_COMPANY_USER",
            referencedColumnName = "ID_COMPANY_USER",
            foreignKey = @ForeignKey(name = "FK_COMPANY_USER_ID_PHONE"),
            nullable = false
    )
    private CompanyUser companyUserId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "CNPJ_COMPANY_USER",
            referencedColumnName = "CNPJ",
            foreignKey = @ForeignKey(name = "FK_COMPANY_USER_CNPJ_PHONE"),
            nullable = false
    )
    private CompanyUser companyUserCnpj;

    public Phone() {
    }

    public Phone(Long id, int number, CompanyUser companyUserId, CompanyUser companyUserCnpj, Vendor vendorId, Vendor vendorCnpj) {
        this.id = id;
        this.number = number;
        this.companyUserId = companyUserId;
        this.companyUserCnpj = companyUserCnpj;
        this.vendorId = vendorId;
        this.vendorCnpj = vendorCnpj;
    }

    public Long getId() {
        return id;
    }

    public Phone setId(Long id) {
        this.id = id;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public Phone setNumber(int number) {
        this.number = number;
        return this;
    }

    public CompanyUser getCompanyUserId() {
        return companyUserId;
    }

    public Phone setCompanyUserId(CompanyUser companyUserId) {
        this.companyUserId = companyUserId;
        return this;
    }

    public CompanyUser getCompanyUserCnpj() {
        return companyUserCnpj;
    }

    public Phone setCompanyUserCnpj(CompanyUser companyUserCnpj) {
        this.companyUserCnpj = companyUserCnpj;
        return this;
    }

    public Vendor getVendorId() {
        return vendorId;
    }

    public Phone setVendorId(Vendor vendorId) {
        this.vendorId = vendorId;
        return this;
    }

    public Vendor getVendorCnpj() {
        return vendorCnpj;
    }

    public Phone setVendorCnpj(Vendor vendorCnpj) {
        this.vendorCnpj = vendorCnpj;
        return this;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", number=" + number +
                ", companyUserId=" + companyUserId +
                ", companyUserCnpj=" + companyUserCnpj +
                ", vendorId=" + vendorId +
                ", vendorCnpj=" + vendorCnpj +
                '}';
    }
}
