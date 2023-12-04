package br.com.system.syncfy.model.repository;

import br.com.system.syncfy.model.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
