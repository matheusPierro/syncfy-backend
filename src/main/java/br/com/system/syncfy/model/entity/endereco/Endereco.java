package br.com.system.syncfy.model.entity.endereco;

import br.com.system.syncfy.model.entity.pessoa.Pessoa;
import jakarta.persistence.*;

@Table(name = "ENDERECO")
@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ENDERECO")
    @SequenceGenerator(name = "SQ_ENDERECO", sequenceName = "SQ_ENDERECO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_ENDERECO")
    private Long codEndereco;
    @Column(name = "CEP", nullable = false)
    private String cep;
    @Column(name = "LOGRADOURO", nullable = false)
    private String logradouro;
    @Column(name = "NR_ENDERECO")
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

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "PESSOA",
            referencedColumnName = "COD_PESSOA",
            foreignKey = @ForeignKey(name = "FK_ENDERECO_PESSOA")
    )
    private Pessoa pessoa;

    public Endereco() {
    }

    public Endereco(Long codEndereco, String cep, String logradouro, String numero, String complemento, Bairro bairro, Pessoa pessoa) {
        this.codEndereco = codEndereco;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.pessoa = pessoa;
    }

    public Long getCodEndereco() {
        return codEndereco;
    }

    public Endereco setCodEndereco(Long codEndereco) {
        this.codEndereco = codEndereco;
        return this;
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Endereco setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        return this;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "codEndereco=" + codEndereco +
                ", cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro=" + bairro +
                ", pessoa=" + pessoa +
                '}';
    }
}