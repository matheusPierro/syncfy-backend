package br.com.system.syncfy.model.repository;

import br.com.system.syncfy.model.entity.endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
