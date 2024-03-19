package br.com.system.syncfy.model.entity;

import br.com.system.syncfy.model.dto.produto.NewProdutoDTO;
import br.com.system.syncfy.model.dto.produto.ProdutoDTO;
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
    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "CATEGORIA", referencedColumnName = "COD_CATEGORIA", foreignKey = @ForeignKey(name = "fk_produto_categoria"))
    private Categoria categoria;

    public Produto() {
    }

    public Produto(NewProdutoDTO dados) {
        this.valorUnitario = dados.valorUnitario();
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.sku = dados.sku();
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

    public Long getCodProduto() {
        return codProduto;
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

    public void atualizar(ProdutoDTO dados) {
        this.setCodProduto(dados.codProduto());
        this.setCategoria(dados.categoria());
        this.setDescricao(dados.descricao());
        this.setNome(dados.nome());
        this.setSku(dados.sku());
        this.setValorUnitario(dados.valorUnitario());
    }

}
