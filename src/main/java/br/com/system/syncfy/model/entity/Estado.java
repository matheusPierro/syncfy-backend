package br.com.system.syncfy.model.entity;

import jakarta.persistence.*;

@Table(name = "ESTADO")
@Entity(name = "Estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_ESTADO")
    private Long cod;
    private String estado;

    // FKS
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "PAIS",
            referencedColumnName = "COD_PAIS",
            foreignKey = @ForeignKey(name = "FK_ESTADO_PAIS")
    )
    private Pais pais;

    public Estado() {
    }

    public Estado(Long cod, String estado, Pais pais) {
        this.cod = cod;
        this.estado = estado;
        this.pais = pais;
    }

    public Long getCod() {
        return cod;
    }

    public Estado setCod(Long cod) {
        this.cod = cod;
        return this;
    }

    public String getEstado() {
        return estado;
    }

    public Estado setEstado(String estado) {
        this.estado = estado;
        return this;
    }

    public Pais getPais() {
        return pais;
    }

    public Estado setPais(Pais pais) {
        this.pais = pais;
        return this;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "cod=" + cod +
                ", estado='" + estado + '\'' +
                ", pais=" + pais +
                '}';
    }
}