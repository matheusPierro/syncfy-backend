package br.com.system.syncfy.model.entity;

import br.com.system.syncfy.model.entity.pessoa.Pessoa;
import jakarta.persistence.*;

@Table(name = "TELEFONE")
@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TELEFONE")
    @SequenceGenerator(name = "SQ_TELEFONE", sequenceName = "SQ_TELEFONE", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_TELEFONE")
    private Long codTelefone;
    @Column(name = "NR_TELEFONE", nullable = false)
    private String numero;
    @Column(name = "DDD", nullable = false)
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

    public Telefone(Long codTelefone, String numero, int ddd, Pessoa pessoa) {
        this.codTelefone = codTelefone;
        this.numero = numero;
        this.ddd = ddd;
        this.pessoa = pessoa;
    }

    public Long getCodTelefone() {
        return codTelefone;
    }

    public Telefone setCodTelefone(Long codTelefone) {
        this.codTelefone = codTelefone;
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
                "codTelefone=" + codTelefone +
                ", numero='" + numero + '\'' +
                ", ddd=" + ddd +
                ", pessoa=" + pessoa +
                '}';
    }
}
