package br.com.system.syncfy.model.entity;

import jakarta.persistence.*;

@Table(name = "PAIS")
@Entity(name = "Pais")
public class Pais {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_PAIS")
    private Long cod;
    private String pais;

    public Pais() {
    }

    public Pais(Long cod, String pais) {
        this.cod = cod;
        this.pais = pais;
    }

    public Long getCod() {
        return cod;
    }

    public Pais setCod(Long cod) {
        this.cod = cod;
        return this;
    }

    public String getPais() {
        return pais;
    }

    public Pais setPais(String pais) {
        this.pais = pais;
        return this;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "cod=" + cod +
                ", pais='" + pais + '\'' +
                '}';
    }
}

