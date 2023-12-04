package br.com.system.syncfy.model.entity.endereco;

import br.com.system.syncfy.model.dto.DadosPais;
import jakarta.persistence.*;

@Table(name = "PAIS")
@Entity(name = "Pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PAIS")
    @SequenceGenerator(name = "SQ_PAIS", sequenceName = "SQ_PAIS", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_PAIS")
    private Long codPais;
    private String nome;

    public Pais() {
    }

    public Pais(Long codPais, String nome) {
        this.codPais = codPais;
        this.nome = nome;
    }

    public Long getCodPais() {
        return codPais;
    }

    public Pais setCodPais(Long codPais) {
        this.codPais = codPais;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Pais setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "codPais=" + codPais +
                ", nome='" + nome + '\'' +
                '}';
    }
}

