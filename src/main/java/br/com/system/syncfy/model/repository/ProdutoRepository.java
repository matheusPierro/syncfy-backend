package br.com.system.syncfy.model.repository;

import br.com.system.syncfy.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
