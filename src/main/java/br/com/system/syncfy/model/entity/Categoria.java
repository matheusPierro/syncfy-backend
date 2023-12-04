package br.com.system.syncfy.model.entity;

import jakarta.persistence.*;

@Table(name = "CATEGORIA")
@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CATEGORIA")
    @SequenceGenerator(name = "SQ_CATEGORIA", sequenceName = "SQ_CATEGORIA", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_CATEGORIA")
    private Long codCategoria;
    private String nome;

    public Categoria() {
    }

    public Categoria(Long codCategoria, String nome) {
        this.codCategoria = codCategoria;
        this.nome = nome;
    }

    public Long getCodCategoria() {
        return codCategoria;
    }

    public Categoria setCodCategoria(Long codCategoria) {
        this.codCategoria = codCategoria;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Categoria setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "codCategoria=" + codCategoria +
                ", nome='" + nome + '\'' +
                '}';
    }
}
