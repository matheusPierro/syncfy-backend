package br.com.system.syncfy.model.entity;

import jakarta.persistence.*;

@Table(name = "SEGMENTO")
@Entity
public class Segmento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_SEGMENTO")
    @SequenceGenerator(name = "SQ_SEGMENTO", sequenceName = "SQ_SEGMENTO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_SEGMENTO")
    private Long codSegmento;
    @Column(name = "NOME_SEGMENTO", nullable = false)
    private String nome;

    public Segmento() {
    }

    public Segmento(Long codSegmento, String nome) {
        this.codSegmento = codSegmento;
        this.nome = nome;
    }

    public Long getCodSegmento() {
        return codSegmento;
    }

    public Segmento setCodSegmento(Long codSegmento) {
        this.codSegmento = codSegmento;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Segmento setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return "Segmento{" +
                "codSegmento=" + codSegmento +
                ", nome='" + nome + '\'' +
                '}';
    }
}
