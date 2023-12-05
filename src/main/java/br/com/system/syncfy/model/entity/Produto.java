package br.com.system.syncfy.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Table(name = "PRODUTO", uniqueConstraints = {
        @UniqueConstraint(name = "UK_PRODUTO_SKU", columnNames = {"SKU_PRODUTO"})
})
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PRODUTO")
    @SequenceGenerator(name = "SQ_PRODUTO", sequenceName = "SQ_PRODUTO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_PRODUTO")
    private Long codProduto;
    @Column(name = "VALOR_UNITARIO_PRODUTO", nullable = false)
    private BigDecimal valorUnitario;
    @Column(name = "NOME_PRODUTO", nullable = false)
    private String nome;
    @Column(name = "DESCRICAO_PRODUTO")
    private String descricao;
    @Column(name = "SKU_PRODUTO", nullable = false)
    private String sku;

    // FKS
    @OneToOne
    @JoinColumn(name = "cod")
    private Categoria categoria;

    public Produto() {
    }

    public Produto(Long codProduto, BigDecimal valorUnitario, String nome, String descricao, String sku, Categoria categoria) {
        this.codProduto = codProduto;
        this.valorUnitario = valorUnitario;
        this.nome = nome;
        this.descricao = descricao;
        this.sku = sku;
        this.categoria = categoria;
    }

    public Long getCodProduto() {
        return codProduto;
    }

    public Produto setCodProduto(Long codProduto) {
        this.codProduto = codProduto;
        return this;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public Produto setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
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
                "codProduto=" + codProduto +
                ", valorUnitario=" + valorUnitario +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", sku='" + sku + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
