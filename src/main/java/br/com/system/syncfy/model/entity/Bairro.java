package br.com.system.syncfy.model.entity;

import jakarta.persistence.*;

@Table(name = "BAIRRO")
@Entity(name = "Bairro")
public class Bairro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_BAIRRO")
    private Long cod;
    private String bairro;

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

    public Bairro(Long cod, String bairro, Cidade cidade) {
        this.cod = cod;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Long getCod() {
        return cod;
    }

    public Bairro setCod(Long cod) {
        this.cod = cod;
        return this;
    }

    public String getBairro() {
        return bairro;
    }

    public Bairro setBairro(String bairro) {
        this.bairro = bairro;
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
                "cod=" + cod +
                ", bairro='" + bairro + '\'' +
                ", cidade=" + cidade +
                '}';
    }
}