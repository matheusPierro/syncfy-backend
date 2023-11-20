package br.com.system.syncfy.model.entity;

import jakarta.persistence.*;

@Table(name = "CATEGORIA")
@Entity(name = "Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CATEGORIA")
    @SequenceGenerator(name = "SQ_CATEGORIA", sequenceName = "SQ_CATEGORIA", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_CATEGORIA")
    private Long cod;
    private String categoria;

    public Categoria() {
    }

    public Categoria(Long cod, String categoria) {
        this.cod = cod;
        this.categoria = categoria;
    }

    public Long getCod() {
        return cod;
    }

    public Categoria setCod(Long cod) {
        this.cod = cod;
        return this;
    }

    public String getCategoria() {
        return categoria;
    }

    public Categoria setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "cod=" + cod +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
