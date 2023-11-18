package br.com.system.syncfy.model.repository;

import br.com.system.syncfy.model.entity.Pais;
import br.com.system.syncfy.model.entity.PessoaJuridica;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
//    Page<PessoaJuridica> findAll(Pageable paginacao);
}
