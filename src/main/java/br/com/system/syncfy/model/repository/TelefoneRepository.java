package br.com.system.syncfy.model.repository;

import br.com.system.syncfy.model.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
