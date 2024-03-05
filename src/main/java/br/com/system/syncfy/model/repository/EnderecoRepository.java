package br.com.system.syncfy.model.repository;

import br.com.system.syncfy.model.entity.endereco.Endereco;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.concurrent.atomic.AtomicReference;

public class EnderecoRepository {
    private static final AtomicReference<EnderecoRepository> instance = new AtomicReference<>();
    private final EntityManager manager;
    private EnderecoRepository(EntityManager manager) {
        this.manager = manager;
    }
    public static EnderecoRepository build(EntityManager manager) {
        instance.compareAndSet(null, new EnderecoRepository(manager));
        return instance.get();
    }

    public Endereco save(Endereco endereco) {
        manager.getTransaction().begin();
        manager.persist(endereco);
        manager.getTransaction().commit();
        return endereco;
    }
}
