package br.com.system.syncfy.model.entity;

import br.com.system.syncfy.model.dto.DadosSegmento;
import jakarta.persistence.*;

@Table(name = "SEGMENTO")
@Entity(name = "Segmento")
public class Segmento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_SEGMENTO")
    private Long cod;
    private String segmento;

    public Segmento() {
    }

    public Segmento(Long cod, String segmento) {
        this.cod = cod;
        this.segmento = segmento;
    }

    public Segmento(DadosSegmento dadosSegmento) {
        this.segmento = dadosSegmento.segmento();
    }

    public Long getCod() {
        return cod;
    }

    public Segmento setCod(Long cod) {
        this.cod = cod;
        return this;
    }

    public String getSegmento() {
        return segmento;
    }

    public Segmento setSegmento(String segmento) {
        this.segmento = segmento;
        return this;
    }

    @Override
    public String toString() {
        return "Segmento{" +
                "cod=" + cod +
                ", segmento='" + segmento + '\'' +
                '}';
    }
}
