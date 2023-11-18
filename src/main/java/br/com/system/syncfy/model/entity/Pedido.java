package br.com.system.syncfy.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "PEDIDO")
@Entity(name = "Pedido")
public class Pedido {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_PEDIDO")
    private Long cod;
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
            name = "PESSOA_FISICA",
            referencedColumnName = "COD_PESSOA",
            foreignKey = @ForeignKey(name = "FK_PEDIDO_PESSOA_FISICA")
    )
    private PessoaFisica pessoaFisica;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "PESSOA_JURIDICA",
            referencedColumnName = "COD_PESSOA",
            foreignKey = @ForeignKey(name = "FK_PEDIDO_PESSOA_JURIDICA")
    )
    private PessoaJuridica pessoaJuridica;

    public Pedido() {
    }

    public Pedido(Long cod, LocalDate dataCriacao, LocalDate dataAtualizacao, BigDecimal precoTotal, LocalDate dataEntrega, Long numeroPedido, String descricao, Frete frete, PessoaFisica pessoaFisica, PessoaJuridica pessoaJuridica) {
        this.cod = cod;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataAtualizacao;
        this.precoTotal = precoTotal;
        this.dataEntrega = dataEntrega;
        this.numeroPedido = numeroPedido;
        this.descricao = descricao;
        this.frete = frete;
        this.pessoaFisica = pessoaFisica;
        this.pessoaJuridica = pessoaJuridica;
    }

    public Long getCod() {
        return cod;
    }

    public Pedido setCod(Long cod) {
        this.cod = cod;
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

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public Pedido setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
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
                "cod=" + cod +
                ", dataCriacao=" + dataCriacao +
                ", dataAtualizacao=" + dataAtualizacao +
                ", precoTotal=" + precoTotal +
                ", dataEntrega=" + dataEntrega +
                ", numeroPedido=" + numeroPedido +
                ", descricao='" + descricao + '\'' +
                ", frete=" + frete +
                ", pessoaFisica=" + pessoaFisica +
                ", pessoaJuridica=" + pessoaJuridica +
                '}';
    }
}
