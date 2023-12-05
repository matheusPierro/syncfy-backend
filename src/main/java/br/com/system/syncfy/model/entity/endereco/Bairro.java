package br.com.system.syncfy.model.entity.endereco;

import br.com.system.syncfy.model.dto.DadosBairro;
import jakarta.persistence.*;

@Table(name = "BAIRRO")
@Entity
public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_BAIRRO")
    @SequenceGenerator(name = "SQ_BAIRRO", sequenceName = "SQ_BAIRRO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_BAIRRO")
    private Long codBairro;

    @Column(name = "NOME_BAIRRO", nullable = false)
    private String nome;

    // FKS
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "CIDADE",
            referencedColumnName = "COD_CIDADE",
            foreignKey = @ForeignKey(name = "FK_BAIRRO_CIDADE")
    )
    private Cidade cidade;

    public Bairro() {
    }

    public Bairro(Long codBairro, String nome, Cidade cidade) {
        this.codBairro = codBairro;
        this.nome = nome;
        this.cidade = cidade;
    }

    public Long getCodBairro() {
        return codBairro;
    }

    public Bairro setCodBairro(Long codBairro) {
        this.codBairro = codBairro;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Bairro setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public Bairro setCidade(Cidade cidade) {
        this.cidade = cidade;
        return this;
    }

    @Override
    public String toString() {
        return "Bairro{" +
                "codBairro=" + codBairro +
                ", nome='" + nome + '\'' +
                ", cidade=" + cidade +
                '}';
    }
}