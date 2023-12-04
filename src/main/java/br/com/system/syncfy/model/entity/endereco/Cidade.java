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
    private Long codCidade;
    private String nome;
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

    public Cidade(Long codCidade, String nome, Long codIbge, Estado estado) {
        this.codCidade = codCidade;
        this.nome = nome;
        this.codIbge = codIbge;
        this.estado = estado;
    }

    public Long getCodCidade() {
        return codCidade;
    }

    public Cidade setCodCidade(Long codCidade) {
        this.codCidade = codCidade;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Cidade setNome(String nome) {
        this.nome = nome;
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
                "codCidade=" + codCidade +
                ", nome='" + nome + '\'' +
                ", codIbge=" + codIbge +
                ", estado=" + estado +
                '}';
    }
}
