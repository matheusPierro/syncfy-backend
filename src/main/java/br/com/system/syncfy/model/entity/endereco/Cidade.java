package br.com.system.syncfy.model.entity.endereco;

import br.com.system.syncfy.model.dto.DadosCidade;
import jakarta.persistence.*;

@Table(name = "CIDADE")
@Entity(name = "Cidade")
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CIDADE")
    @SequenceGenerator(name = "SQ_CIDADE", sequenceName = "SQ_CIDADE", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_CIDADE")
    private Long cod;
    private String cidade;
    private Long codIbge;

    // FKS
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ESTADO",
            referencedColumnName = "COD_ESTADO",
            foreignKey = @ForeignKey(name = "FK_CIDADE_ESTADO")
    )
    private Estado estado;

    public Cidade() {
    }

    public Cidade(Long cod, String cidade, Long codIbge, Estado estado) {
        this.cod = cod;
        this.cidade = cidade;
        this.codIbge = codIbge;
        this.estado = estado;
    }

    public Cidade(DadosCidade dadosCidade) {
        this.cidade = dadosCidade.cidade();
    }


    public Long getCod() {
        return cod;
    }

    public Cidade setCod(Long cod) {
        this.cod = cod;
        return this;
    }

    public String getCidade() {
        return cidade;
    }

    public Cidade setCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public Long getCodIbge() {
        return codIbge;
    }

    public Cidade setCodIbge(Long codIbge) {
        this.codIbge = codIbge;
        return this;
    }

    public Estado getEstado() {
        return estado;
    }

    public Cidade setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "cod=" + cod +
                ", cidade='" + cidade + '\'' +
                ", codIbge=" + codIbge +
                ", estado=" + estado +
                '}';
    }
}
