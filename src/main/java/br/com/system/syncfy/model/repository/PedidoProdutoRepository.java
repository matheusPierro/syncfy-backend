package br.com.system.syncfy.model.repository;

import br.com.system.syncfy.model.entity.PedidoProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoProdutoRepository extends JpaRepository<PedidoProduto, Long> {
}
