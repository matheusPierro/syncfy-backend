package br.com.system.syncfy.model.entity;

import br.com.system.syncfy.model.dto.DadosUsuario;
import jakarta.persistence.*;

@Table(name = "USUARIO")
@Entity(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USER")
    @SequenceGenerator(name = "SQ_USER", sequenceName = "SQ_USER", allocationSize = 1, initialValue = 1)    @Column(name = "COD_USER")
    private Long cod;
    private String usuario;
    private String senha;

    public Usuario() {
    }

    public Usuario(Long cod, String usuario, String senha) {
        this.cod = cod;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario(DadosUsuario dadosUsuario) {
        this.usuario = dadosUsuario.usuario();
        this.senha = dadosUsuario.senha();
    }

    public Long getCod() {
        return cod;
    }

    public Usuario setCod(Long cod) {
        this.cod = cod;
        return this;
    }

    public String getUsuario() {
        return usuario;
    }

    public Usuario setUsuario(String usuario) {
        this.usuario = usuario;
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
                "cod=" + cod +
                ", usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
