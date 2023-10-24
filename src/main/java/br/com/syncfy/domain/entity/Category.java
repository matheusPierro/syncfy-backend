package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CATEGORY")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CATEGORY")
    @SequenceGenerator(name = "SQ_CATEGORY", sequenceName = "SQ_CATEGORY")
    @Column(name = "ID_CATEGORY")
    private Long id;
    @Column(name = "CATEGORY")
    private String category;

    @OneToOne
    @JoinColumn(name = "ID_MATERIAL")
    private Material materialId;

    @OneToOne
    @JoinColumn(name = "PRODUCT_CODE")
    private Material materialProductCode;

    public Category() {
    }

    public Category(Long id, String category, Material materialId, Material materialProductCode) {
        this.id = id;
        this.category = category;
        this.materialId = materialId;
        this.materialProductCode = materialProductCode;
    }

    public Long getId() {
        return id;
    }

    public Category setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Category setCategory(String category) {
        this.category = category;
        return this;
    }

    public Material getMaterialId() {
        return materialId;
    }

    public Category setMaterialId(Material materialId) {
        this.materialId = materialId;
        return this;
    }

    public Material getMaterialProductCode() {
        return materialProductCode;
    }

    public Category setMaterialProductCode(Material materialProductCode) {
        this.materialProductCode = materialProductCode;
        return this;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", materialId=" + materialId +
                ", materialProductCode=" + materialProductCode +
                '}';
    }
}
