package br.com.system.syncfy.model.repository;

import br.com.system.syncfy.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
