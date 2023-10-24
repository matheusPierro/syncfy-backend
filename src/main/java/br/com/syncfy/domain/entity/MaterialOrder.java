package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "MATERIAL_ORDER")
public class MaterialOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_MATERIAL_ORDER")
    @SequenceGenerator(name = "SQ_MATERIAL_ORDER", sequenceName = "SQ_MATERIAL_ORDER")
    @Column(name = "ID_MATERIAL_ORDER")
    private Long id;

    @Column(name = "QUANTITY", nullable = false)
    private int quantity;

    @OneToOne
    @JoinColumn(name = "ID_ORDER")
    private Order order;

    public MaterialOrder() {
    }

    public MaterialOrder(Long id, int quantity, Order order) {
        this.id = id;
        this.quantity = quantity;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public MaterialOrder setId(Long id) {
        this.id = id;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public MaterialOrder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public Order getOrder() {
        return order;
    }

    public MaterialOrder setOrder(Order order) {
        this.order = order;
        return this;
    }

    @Override
    public String toString() {
        return "MaterialOrder{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", order=" + order +
                '}';
    }
}
