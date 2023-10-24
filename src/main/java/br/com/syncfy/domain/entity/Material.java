package br.com.syncfy.domain.entity;
import com.sun.jna.platform.unix.solaris.LibKstat;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "MATERIAL")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_MATERIAL")
    @SequenceGenerator(name = "SQ_MATERIAL", sequenceName = "SQ_MATERIAL")
    @Column(name = "ID_MATERIAL")
    private Long id;
    @Column(name = "UNIT_AMOUNT", nullable = false)
    private double unitAmount;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;
    @Column(name = "PRODUCT_CODE", nullable = false)
    private String productCode;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_VENDOR",
            referencedColumnName = "ID_VENDOR",
            foreignKey = @ForeignKey(name = "FK_VENDOR_ID_MATERIAL"),
            nullable = false
    )
    private Vendor vendorId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "CNPJ_VENDOR",
            referencedColumnName = "CNPJ",
            foreignKey = @ForeignKey(name = "FK_VENDOR_CNPJ_MATERIAL"),
            nullable = false
    )
    private Vendor vendorCnpj;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_MATERIAL_ORDER",
            referencedColumnName = "ID_MATERIAL_ORDER",
            foreignKey = @ForeignKey(name = "FK_MATERIAL_ORDER_MATERIAL"),
            nullable = false
    )
    private MaterialOrder materialOrder;

    public Material() {
    }

    public Material(Long id, double unitAmount, String name, String description, String productCode, Vendor vendorId, Vendor vendorCnpj, MaterialOrder materialOrder) {
        this.id = id;
        this.unitAmount = unitAmount;
        this.name = name;
        this.description = description;
        this.productCode = productCode;
        this.vendorId = vendorId;
        this.vendorCnpj = vendorCnpj;
        this.materialOrder = materialOrder;
    }

    public Long getId() {
        return id;
    }

    public Material setId(Long id) {
        this.id = id;
        return this;
    }

    public double getUnitAmount() {
        return unitAmount;
    }

    public Material setUnitAmount(double unitAmount) {
        this.unitAmount = unitAmount;
        return this;
    }

    public String getName() {
        return name;
    }

    public Material setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Material setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getProductCode() {
        return productCode;
    }

    public Material setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    public Vendor getVendorId() {
        return vendorId;
    }

    public Material setVendorId(Vendor vendorId) {
        this.vendorId = vendorId;
        return this;
    }

    public Vendor getVendorCnpj() {
        return vendorCnpj;
    }

    public Material setVendorCnpj(Vendor vendorCnpj) {
        this.vendorCnpj = vendorCnpj;
        return this;
    }

    public MaterialOrder getMaterialOrder() {
        return materialOrder;
    }

    public Material setMaterialOrder(MaterialOrder materialOrder) {
        this.materialOrder = materialOrder;
        return this;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", unitAmount=" + unitAmount +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", productCode='" + productCode + '\'' +
                ", vendorId=" + vendorId +
                ", vendorCnpj=" + vendorCnpj +
                ", materialOrder=" + materialOrder +
                '}';
    }
}
