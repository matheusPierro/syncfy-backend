package br.com.system.syncfy.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Table(name = "FRETE")
@Entity(name = "Frete")
public class Frete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_FRETE")
    private Long cod;
    private BigDecimal custo;

    public Frete() {
    }

    public Frete(Long cod, BigDecimal custo) {
        this.cod = cod;
        this.custo = custo;
    }

    public Long getCod() {
        return cod;
    }

    public Frete setCod(Long cod) {
        this.cod = cod;
        return this;
    }

    public BigDecimal getCusto() {
        return custo;
    }

    public Frete setCusto(BigDecimal custo) {
        this.custo = custo;
        return this;
    }

    @Override
    public String toString() {
        return "Frete{" +
                "cod=" + cod +
                ", custo=" + custo +
                '}';
    }
}
