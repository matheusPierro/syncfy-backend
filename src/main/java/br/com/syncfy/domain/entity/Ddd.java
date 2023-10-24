package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "DDD")
public class Ddd {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DDD")
    @SequenceGenerator(name = "SQ_DDD", sequenceName = "SQ_DDD")
    @Column(name = "ID_DDD")
    private Long id;

    @Column(name = "DDD", nullable = false)
    private int ddd;

    @OneToMany
    @JoinColumn(name = "ID_PHONE")
    private List<Phone> phones;

    public Ddd() {
    }

    public Ddd(Long id, int ddd, List<Phone> phones) {
        this.id = id;
        this.ddd = ddd;
        this.phones = phones;
    }

    public Long getId() {
        return id;
    }

    public Ddd setId(Long id) {
        this.id = id;
        return this;
    }

    public int getDdd() {
        return ddd;
    }

    public Ddd setDdd(int ddd) {
        this.ddd = ddd;
        return this;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public Ddd setPhones(List<Phone> phones) {
        this.phones = phones;
        return this;
    }

    @Override
    public String toString() {
        return "Ddd{" +
                "id=" + id +
                ", ddd=" + ddd +
                ", phones=" + phones +
                '}';
    }
}
