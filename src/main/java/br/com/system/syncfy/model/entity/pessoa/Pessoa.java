package br.com.system.syncfy.model.entity.pessoa;

import br.com.system.syncfy.model.entity.Endereco;
import br.com.system.syncfy.model.entity.Usuario;
import jakarta.persistence.*;

@Table(name = "PESSOA")
@Entity(name = "Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TIPO")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PESSOA")
    @SequenceGenerator(name = "SQ_PESSOA", sequenceName = "SQ_PESSOA", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_PESSOA")
    private Long cod;

    private String nome;
    private boolean softDelete;
    private String email;

    // FKS
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ENDERECO",
            referencedColumnName = "COD_ENDERECO",
            foreignKey = @ForeignKey(name = "FK_PESSOA_ENDERECO")
    )
    private Endereco endereco;

    @OneToOne
    @JoinColumn(name = "COD_USER")
    private Usuario usuario;

    public Pessoa() {
    }

    public Pessoa(Long cod, String nome, boolean softDelete, String email, Endereco endereco, Usuario usuario) {
        this.cod = cod;
        this.nome = nome;
        this.softDelete = softDelete;
        this.email = email;
        this.endereco = endereco;
        this.usuario = usuario;
    }

    public Pessoa(
            String nome,
            boolean softDelete,
            String email,
            Endereco endereco,
            Usuario usuario
    ) {
        this.nome = nome;
        this.softDelete = softDelete;
        this.email = email;
        this.endereco = endereco;
        this.usuario = usuario;
    }

    public Long getCod() {
        return cod;
    }

    public Pessoa setCod(Long cod) {
        this.cod = cod;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public boolean isSoftDelete() {
        return softDelete;
    }

    public Pessoa setSoftDelete(boolean softDelete) {
        this.softDelete = softDelete;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Pessoa setEmail(String email) {
        this.email = email;
        return this;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Pessoa setEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Pessoa setUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                ", softDelete=" + softDelete +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                ", usuario=" + usuario +
                '}';
    }
}
