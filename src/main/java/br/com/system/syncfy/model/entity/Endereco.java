package br.com.system.syncfy.model.entity;

import br.com.system.syncfy.model.dto.DadosEndereco;
import jakarta.persistence.*;

@Table(name = "ENDERECO")
@Entity(name = "Endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_ENDERECO")
    private Long cod;
    private String cep;
    private String logradouro;
    private String numero;
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

    public Endereco(Long cod, String cep, String logradouro, String numero, String complemento, Bairro bairro) {
        this.cod = cod;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    public Endereco(DadosEndereco dadosEndereco) {
        this.cep = dadosEndereco.cep();
        this.logradouro = dadosEndereco.logradouro();
        this.numero = dadosEndereco.numero();
        this.complemento = dadosEndereco.complemento();
        this.bairro = new Bairro(dadosEndereco.bairro());
    }

    public Long getCod() {
        return cod;
    }

    public Endereco setCod(Long cod) {
        this.cod = cod;
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

    @Override
    public String toString() {
        return "Endereco{" +
                "cod=" + cod +
                ", cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro=" + bairro +
                '}';
    }
}