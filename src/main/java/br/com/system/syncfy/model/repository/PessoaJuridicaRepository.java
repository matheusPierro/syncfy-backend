package br.com.system.syncfy.model.repository;

import br.com.system.syncfy.model.entity.pessoa.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
//    Page<PessoaJuridica> findAll(Pageable paginacao);
}
