package br.com.system.syncfy.model.entity;

import br.com.system.syncfy.model.dto.DadosUsuario;
import jakarta.persistence.*;

@Table(name = "USUARIO")
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USER")
    @SequenceGenerator(name = "SQ_USER", sequenceName = "SQ_USER", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_USER")
    private Long codUser;
    @Column(name = "NM_USUARIO", nullable = false)
    private String nome;
    @Column(name = "SENHA_USUARIO", nullable = false)
    private String senha;

    public Usuario() {
    }

    public Usuario(Long codUser, String nome, String senha) {
        this.codUser = codUser;
        this.nome = nome;
        this.senha = senha;
    }

    public Long getCodUser() {
        return codUser;
    }

    public Usuario setCodUser(Long codUser) {
        this.codUser = codUser;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Usuario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Usuario setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "codUser=" + codUser +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
