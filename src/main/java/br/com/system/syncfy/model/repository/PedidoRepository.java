package br.com.system.syncfy.model.repository;

import br.com.system.syncfy.model.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
