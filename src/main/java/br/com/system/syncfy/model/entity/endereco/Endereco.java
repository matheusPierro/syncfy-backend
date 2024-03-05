package br.com.system.syncfy.model.entity.endereco;

import br.com.system.syncfy.model.entity.pessoa.Pessoa;
import jakarta.persistence.*;

@Entity
@Table(name = "ENDERECO", uniqueConstraints = {
        @UniqueConstraint(name = "UK_END_PESSOA", columnNames = {"PESSOA", "CEP"})
})
public class Endereco {

    @Id
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "PESSOA",
            referencedColumnName = "COD_PESSOA",
            foreignKey = @ForeignKey(name = "FK_ENDERECO_PESSOA")
    )
    private Pessoa pessoa;
    @Column(name = "CEP", nullable = false)
    private String cep;
    @Column(name = "LOGRADOURO", nullable = false)
    private String logradouro;
    @Column(name = "NUMERO_ENDERECO")
    private String numero;
    @Column(name = "COMPLEMENTO_ENDERECO")
    private String complemento;

    // FKS
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "BAIRRO",
            referencedColumnName = "COD_BAIRRO",
            foreignKey = @ForeignKey(name = "FK_ENDERECO_BAIRRO")
    )
    private Bairro bairro;

    public Endereco() {
    }

    public Endereco(Pessoa pessoa, String cep, String logradouro, String numero, String complemento, Bairro bairro) {
        this.pessoa = pessoa;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public Endereco setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Endereco setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public Endereco setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String getComplemento() {
        return complemento;
    }

    public Endereco setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public Endereco setBairro(Bairro bairro) {
        this.bairro = bairro;
        return this;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "pessoa=" + pessoa +
                ", cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro=" + bairro +
                '}';
    }
}