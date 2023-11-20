package br.com.system.syncfy.model.entity.pessoa;

import br.com.system.syncfy.model.dto.DadosCadastroPessoaJuridica;
import br.com.system.syncfy.model.entity.Endereco;
import br.com.system.syncfy.model.entity.Segmento;
import br.com.system.syncfy.model.entity.Usuario;
import jakarta.persistence.*;

@Table(name = "PESSOA_JURIDICA")//, @UniqueConstraint()
@Entity(name = "PessoaJuridica")
@DiscriminatorValue(value = "PJ")
public class PessoaJuridica extends Pessoa {
    private String cnpj;

    // FKS
    @OneToOne
    @JoinColumn(name = "cod")
    private Segmento segmento;

    public PessoaJuridica() {
    }

    public PessoaJuridica(Long cod, String nome, boolean softDelete, String email, Endereco endereco, Usuario usuario, String cnpj, Segmento segmento) {
        super(cod, nome, softDelete, email, endereco, usuario);
        this.cnpj = cnpj;
        this.segmento = segmento;
    }

    public PessoaJuridica(DadosCadastroPessoaJuridica dados) {
        super(
                dados.nome(),
                false,
                dados.email(),
                new Endereco(dados.endereco()),
                new Usuario(dados.usuario())
        );
        this.cnpj = dados.cnpj();
        this.segmento = new Segmento(dados.segmento());
    }

    public String getCnpj() {
        return cnpj;
    }

    public PessoaJuridica setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
                ", segmento=" + segmento +
                "} " + super.toString();
    }
}
