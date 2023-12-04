package br.com.system.syncfy.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Table(name = "FRETE")
@Entity(name = "Frete")
public class Frete {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_FRETE")
    @SequenceGenerator(name = "SQ_FRETE", sequenceName = "SQ_FRETE", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_FRETE")
    private Long codFrete;
    private BigDecimal custo;

    public Frete() {
    }

    public Frete(Long codFrete, BigDecimal custo) {
        this.codFrete = codFrete;
        this.custo = custo;
    }

    public Long getCodFrete() {
        return codFrete;
    }

    public Frete setCodFrete(Long codFrete) {
        this.codFrete = codFrete;
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
                "codFrete=" + codFrete +
                ", custo=" + custo +
                '}';
    }
}
