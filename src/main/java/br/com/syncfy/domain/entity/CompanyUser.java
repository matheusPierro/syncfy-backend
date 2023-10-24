package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "COMPANY_USER")
public class CompanyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_COMPANY_USER")
    @SequenceGenerator(name = "SQ_COMPANY_USER", sequenceName = "SQ_COMPANY_USER")
    @Column(name = "ID_COMPANY_USER")
    private Long id;

    @Column(name = "CNPJ", nullable = false)
    private String cnpj;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "STATUS", nullable = false)
    private boolean status;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    public CompanyUser() {
    }

    public CompanyUser(Long id, String cnpj, String name, boolean status, String email, String password) {
        this.id = id;
        this.cnpj = cnpj;
        this.name = name;
        this.status = status;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public CompanyUser setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCnpj() {
        return cnpj;
    }

    public CompanyUser setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public String getName() {
        return name;
    }

    public CompanyUser setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isStatus() {
        return status;
    }

    public CompanyUser setStatus(boolean status) {
        this.status = status;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CompanyUser setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public CompanyUser setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "CompanyUser{" +
                "id=" + id +
                ", cnpj='" + cnpj + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}