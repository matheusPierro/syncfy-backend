package br.com.system.syncfy.model.entity;

import br.com.system.syncfy.model.entity.pessoa.PessoaJuridica;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "PEDIDO")
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PEDIDO")
    @SequenceGenerator(name = "SQ_PEDIDO", sequenceName = "SQ_PEDIDO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_PEDIDO")
    private Long codPedido;
    private LocalDate dataCriacao;
    private LocalDate dataAtualizacao;
    private BigDecimal precoTotal;
    private LocalDate dataEntrega;
    private Long numeroPedido;
    private String descricao;

    // FKS
    @OneToOne
    @JoinColumn(name = "COD_FRETE")
    private Frete frete;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "PESSOA_JURIDICA",
            referencedColumnName = "COD_PESSOA",
            foreignKey = @ForeignKey(name = "FK_PEDIDO_PESSOA_JURIDICA")
    )
    private PessoaJuridica pessoaJuridica;

    //many to manny com produtos

    public Pedido() {
    }

    public Pedido(Long codPedido, LocalDate dataCriacao, LocalDate dataAtualizacao, BigDecimal precoTotal, LocalDate dataEntrega, Long numeroPedido, String descricao, Frete frete, PessoaJuridica pessoaJuridica) {
        this.codPedido = codPedido;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataAtualizacao;
        this.precoTotal = precoTotal;
        this.dataEntrega = dataEntrega;
        this.numeroPedido = numeroPedido;
        this.descricao = descricao;
        this.frete = frete;
        this.pessoaJuridica = pessoaJuridica;
    }

    public Long getCodPedido() {
        return codPedido;
    }

    public Pedido setCodPedido(Long codPedido) {
        this.codPedido = codPedido;
        return this;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public Pedido setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
        return this;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public Pedido setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
        return this;
    }

    public BigDecimal getPrecoTotal() {
        return precoTotal;
    }

    public Pedido setPrecoTotal(BigDecimal precoTotal) {
        this.precoTotal = precoTotal;
        return this;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public Pedido setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
        return this;
    }

    public Long getNumeroPedido() {
        return numeroPedido;
    }

    public Pedido setNumeroPedido(Long numeroPedido) {
        this.numeroPedido = numeroPedido;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Pedido setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Frete getFrete() {
        return frete;
    }

    public Pedido setFrete(Frete frete) {
        this.frete = frete;
        return this;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public Pedido setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
        return this;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codPedido=" + codPedido +
                ", dataCriacao=" + dataCriacao +
                ", dataAtualizacao=" + dataAtualizacao +
                ", precoTotal=" + precoTotal +
                ", dataEntrega=" + dataEntrega +
                ", numeroPedido=" + numeroPedido +
                ", descricao='" + descricao + '\'' +
                ", frete=" + frete +
                ", pessoaJuridica=" + pessoaJuridica +
                '}';
    }
}
