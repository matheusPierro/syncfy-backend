package br.com.system.syncfy.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Table(name = "PRODUTO")
@Entity(name = "Produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PRODUTO")
    @SequenceGenerator(name = "SQ_PRODUTO", sequenceName = "SQ_PRODUTO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_PRODUTO")
    private Long cod;
    private BigDecimal qtdUnitaria;
    private String nome;
    private String descricao;
    private String sku;

    // FKS
    @OneToOne
    @JoinColumn(name = "cod")
    private Categoria categoria;

    public Produto() {
    }

    public Produto(Long cod, BigDecimal qtdUnitaria, String nome, String descricao, String sku, Categoria categoria) {
        this.cod = cod;
        this.qtdUnitaria = qtdUnitaria;
        this.nome = nome;
        this.descricao = descricao;
        this.sku = sku;
        this.categoria = categoria;
    }

    public Long getCod() {
        return cod;
    }

    public Produto setCod(Long cod) {
        this.cod = cod;
        return this;
    }

    public BigDecimal getQtdUnitaria() {
        return qtdUnitaria;
    }

    public Produto setQtdUnitaria(BigDecimal qtdUnitaria) {
        this.qtdUnitaria = qtdUnitaria;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public String getSku() {
        return sku;
    }

    public Produto setSku(String sku) {
        this.sku = sku;
        return this;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Produto setCategoria(Categoria categoria) {
        this.categoria = categoria;
        return this;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "cod=" + cod +
                ", qtdUnitaria=" + qtdUnitaria +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", sku='" + sku + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
