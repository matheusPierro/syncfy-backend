package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_ORDER")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ORDER")
    @SequenceGenerator(name = "SQ_ORDER", sequenceName = "SQ_ORDER")
    @Column(name = "ID_ORDER")
    private Long id;

    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Column(name = "TOTAL_AMOUNT", nullable = false)
    private BigDecimal totalAmount;

    @Column(name = "DELIVERY_DATE")
    private LocalDateTime deliveryDate;

    @Column(name = "ORDER_NUMBER", nullable = false)
    private String orderNumber;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_VENDOR",
            referencedColumnName = "ID_VENDOR",
            foreignKey = @ForeignKey(name = "FK_VENDOR_ID_ORDER"),
            nullable = false
    )
    private Vendor vendorId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "CNPJ_VENDOR",
            referencedColumnName = "CNPJ",
            foreignKey = @ForeignKey(name = "FK_VENDOR_CNPJ_ORDER"),
            nullable = false
    )
    private Vendor vendorCnpj;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_COMPANY_USER",
            referencedColumnName = "ID_COMPANY_USER",
            foreignKey = @ForeignKey(name = "FK_COMPANY_USER_ID_ORDER"),
            nullable = false
    ) 
    private CompanyUser companyUserId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "CNPJ_COMPANY_USER",
            referencedColumnName = "CNPJ",
            foreignKey = @ForeignKey(name = "FK_COMPANY_USER_CNPJ_ORDER"),
            nullable = false
    )
    private CompanyUser companyUserCnpj;

    public Order() {
    }

    public Order(Long id, LocalDateTime createdAt, LocalDateTime updatedAt, BigDecimal totalAmount, LocalDateTime deliveryDate, String orderNumber, String description, Vendor vendorId, Vendor vendorCnpj, CompanyUser companyUserId, CompanyUser companyUserCnpj) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.totalAmount = totalAmount;
        this.deliveryDate = deliveryDate;
        this.orderNumber = orderNumber;
        this.description = description;
        this.vendorId = vendorId;
        this.vendorCnpj = vendorCnpj;
        this.companyUserId = companyUserId;
        this.companyUserCnpj = companyUserCnpj;
    }

    public Long getId() {
        return id;
    }

    public Order setId(Long id) {
        this.id = id;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Order setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Order setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public Order setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public Order setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
        return this;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Order setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Order setDescription(String description) {
        this.description = description;
        return this;
    }

    public Vendor getVendorId() {
        return vendorId;
    }

    public Order setVendorId(Vendor vendorId) {
        this.vendorId = vendorId;
        return this;
    }

    public Vendor getVendorCnpj() {
        return vendorCnpj;
    }

    public Order setVendorCnpj(Vendor vendorCnpj) {
        this.vendorCnpj = vendorCnpj;
        return this;
    }

    public CompanyUser getCompanyUserId() {
        return companyUserId;
    }

    public Order setCompanyUserId(CompanyUser companyUserId) {
        this.companyUserId = companyUserId;
        return this;
    }

    public CompanyUser getcompanyUserCnpj() {
        return companyUserCnpj;
    }

    public Order setCompanyUserC(CompanyUser companyUserCnpj) {
        this.companyUserCnpj = companyUserCnpj;
        return this;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", totalAmount=" + totalAmount +
                ", deliveryDate=" + deliveryDate +
                ", orderNumber='" + orderNumber + '\'' +
                ", description='" + description + '\'' +
                ", vendorId=" + vendorId +
                ", vendorCnpj=" + vendorCnpj +
                ", companyUserId=" + companyUserId +
                ", companyUserCnpj=" + companyUserCnpj +
                '}';
    }
}
