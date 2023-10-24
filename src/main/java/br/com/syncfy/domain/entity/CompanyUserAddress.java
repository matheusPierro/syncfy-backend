package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "COMPANY_USER_ADDRESS")
public class CompanyUserAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_COMPANY_USER_ADDRESS")
    @SequenceGenerator(name = "SQ_COMPANY_USER_ADDRESS", sequenceName = "SQ_COMPANY_USER_ADDRESS")
    @Column(name = "SQ_COMPANY_USER_ADDRESS")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_COMPANY_USER",
            referencedColumnName = "ID_COMPANY_USER",
            foreignKey = @ForeignKey(name = "FK_COMPANY_USER_ID_COMPANY_USER_ADDRESS"),
            nullable = false
    )
    private CompanyUser companyUserId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "CNPJ_COMPANY_USER",
            referencedColumnName = "CNPJ",
            foreignKey = @ForeignKey(name = "FK_COMPANY_USER_CNPJ_COMPANY_USER_ADDRESS"),
            nullable = false
    )
    private CompanyUser companyUserCnpj;

    @OneToOne
    @JoinColumn(name = "ID_SHIPPING_COST")
    private ShippingCost shippingCost;

    public CompanyUserAddress() {
    }

    public CompanyUserAddress(Long id, CompanyUser companyUserId, CompanyUser companyUserCnpj, ShippingCost shippingCost) {
        this.id = id;
        this.companyUserId = companyUserId;
        this.companyUserCnpj = companyUserCnpj;
        this.shippingCost = shippingCost;
    }

    public Long getId() {
        return id;
    }

    public CompanyUserAddress setId(Long id) {
        this.id = id;
        return this;
    }

    public CompanyUser getCompanyUserId() {
        return companyUserId;
    }

    public CompanyUserAddress setCompanyUserId(CompanyUser companyUserId) {
        this.companyUserId = companyUserId;
        return this;
    }

    public CompanyUser getCompanyUserCnpj() {
        return companyUserCnpj;
    }

    public CompanyUserAddress setCompanyUserCnpj(CompanyUser companyUserCnpj) {
        this.companyUserCnpj = companyUserCnpj;
        return this;
    }

    public ShippingCost getShippingCost() {
        return shippingCost;
    }

    public CompanyUserAddress setShippingCost(ShippingCost shippingCost) {
        this.shippingCost = shippingCost;
        return this;
    }

    @Override
    public String toString() {
        return "CompanyUserAddress{" +
                "id=" + id +
                ", companyUserId=" + companyUserId +
                ", companyUserCnpj=" + companyUserCnpj +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
