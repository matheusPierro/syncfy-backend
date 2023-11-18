package br.com.system.syncfy.model.entity;

import jakarta.persistence.*;

@Table(name = "TELEFONE")
@Entity(name = "Telefone")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_TELEFONE")
    private Long cod;
    private String numero;
    private int ddd;

    // FKS
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "PESSOA",
            referencedColumnName = "COD_PESSOA",
            foreignKey = @ForeignKey(name = "FK_TELEFONE_PESSOA")
    )
    private Pessoa pessoa;

    public Telefone() {
    }

    public Telefone(Long cod, String numero, int ddd, Pessoa pessoa) {
        this.cod = cod;
        this.numero = numero;
        this.ddd = ddd;
        this.pessoa = pessoa;
    }

    public Long getCod() {
        return cod;
    }

    public Telefone setCod(Long cod) {
        this.cod = cod;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public Telefone setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public int getDdd() {
        return ddd;
    }

    public Telefone setDdd(int ddd) {
        this.ddd = ddd;
        return this;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Telefone setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        return this;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "cod=" + cod +
                ", numero='" + numero + '\'' +
                ", ddd=" + ddd +
                ", pessoa=" + pessoa +
                '}';
    }
}
