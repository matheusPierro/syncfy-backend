package br.com.system.syncfy.model.entity.pessoa;

import br.com.system.syncfy.model.dto.DadosCadastroPessoaJuridica;
import br.com.system.syncfy.model.entity.endereco.Endereco;
import br.com.system.syncfy.model.entity.Segmento;
import br.com.system.syncfy.model.entity.Usuario;
import jakarta.persistence.*;

@Table(name = "PESSOA_JURIDICA")//, @UniqueConstraint()
@Entity(name = "PessoaJuridica")
@DiscriminatorValue(value = "PJ")
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String tipo;

    // FKS
    @OneToOne
    @JoinColumn(name = "cod")
    private Segmento segmento;

    public PessoaJuridica() {
    }

    public PessoaJuridica(Long codPessoa, String nome, String email, boolean softDelete, Usuario usuario, String cnpj, String tipo, Segmento segmento) {
        super(codPessoa, nome, email, softDelete, usuario);
        this.cnpj = cnpj;
        this.tipo = tipo;
        this.segmento = segmento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public PessoaJuridica setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public PessoaJuridica setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public Segmento getSegmento() {
        return segmento;
    }

    public PessoaJuridica setSegmento(Segmento segmento) {
        this.segmento = segmento;
        return this;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", tipo='" + tipo + '\'' +
                ", segmento=" + segmento +
                "} " + super.toString();
    }
}
