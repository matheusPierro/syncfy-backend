package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "SHIPPING_COST")
public class ShippingCost {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_SHIPPING_COST")
    @SequenceGenerator(name = "SQ_SHIPPING_COST", sequenceName = "SQ_SHIPPING_COST")
    @Column(name = "ID_SHIPPING_COST")
    private Long id;
    @Column(name = "COST", nullable = false)
    private BigDecimal cost;

    @OneToOne
    @JoinColumn(name = "ID_ORDER")
    private Order order;

    public ShippingCost() {
    }

    public ShippingCost(Long id, BigDecimal cost, Order order) {
        this.id = id;
        this.cost = cost;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public ShippingCost setId(Long id) {
        this.id = id;
        return this;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public ShippingCost setCost(BigDecimal cost) {
        this.cost = cost;
        return this;
    }

    public Order getOrder() {
        return order;
    }

    public ShippingCost setOrder(Order order) {
        this.order = order;
        return this;
    }

    @Override
    public String toString() {
        return "ShippingCost{" +
                "id=" + id +
                ", cost=" + cost +
                ", order=" + order +
                '}';
    }
}

