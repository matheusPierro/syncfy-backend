package br.com.system.syncfy.model.entity.pessoa;

import br.com.system.syncfy.model.entity.Endereco;
import br.com.system.syncfy.model.entity.Usuario;
import jakarta.persistence.*;
import java.time.LocalDate;

@Table(name = "PESSOA_FISICA")
@Entity(name = "PessoaFisica")
@DiscriminatorValue(value = "PF")
public class PessoaFisica extends Pessoa{
    private LocalDate dataNasc;

    public PessoaFisica() {
    }

    public PessoaFisica(Long cod, String nome, boolean softDelete, String email, Endereco endereco, Usuario usuario, LocalDate dataNasc) {
        super(cod, nome, softDelete, email, endereco, usuario);
        this.dataNasc = dataNasc;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public PessoaFisica setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
        return this;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "dataNasc=" + dataNasc +
                "} " + super.toString();
    }
}
