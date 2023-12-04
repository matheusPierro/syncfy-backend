package br.com.system.syncfy.model.entity;

import jakarta.persistence.*;

@Table(name = "PEDIDO_PRODUTO")
@Entity
public class PedidoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PEDIDO_PRODUTO")
    @SequenceGenerator(name = "SQ_PEDIDO_PRODUTO", sequenceName = "SQ_PEDIDO_PRODUTO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_PEDIDO_PRODUTO")
    private Long codPedidoProduto;
    private int quantidade;

    // FKS
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "PEDIDO",
            referencedColumnName = "COD_PEDIDO",
            foreignKey = @ForeignKey(name = "FK_PEDIDO")
    )
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "PRODUTO",
            referencedColumnName = "COD_PRODUTO",
            foreignKey = @ForeignKey(name = "FK_PRODUTO")
    )
    private Produto produto;

    public PedidoProduto() {
    }

    public PedidoProduto(Long codPedidoProduto, int quantidade, Pedido pedido, Produto produto) {
        this.codPedidoProduto = codPedidoProduto;
        this.quantidade = quantidade;
        this.pedido = pedido;
        this.produto = produto;
    }

    public Long getCodPedidoProduto() {
        return codPedidoProduto;
    }

    public PedidoProduto setCodPedidoProduto(Long codPedidoProduto) {
        this.codPedidoProduto = codPedidoProduto;
        return this;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public PedidoProduto setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public PedidoProduto setPedido(Pedido pedido) {
        this.pedido = pedido;
        return this;
    }

    public Produto getProduto() {
        return produto;
    }

    public PedidoProduto setProduto(Produto produto) {
        this.produto = produto;
        return this;
    }

    @Override
    public String toString() {
        return "PedidoProduto{" +
                "codPedidoProduto=" + codPedidoProduto +
                ", quantidade=" + quantidade +
                ", pedido=" + pedido +
                ", produto=" + produto +
                '}';
    }
}
