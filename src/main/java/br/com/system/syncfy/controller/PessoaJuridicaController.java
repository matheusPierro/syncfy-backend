package br.com.system.syncfy.controller;


import br.com.system.syncfy.model.dto.DadosCadastroPessoaJuridica;
import br.com.system.syncfy.model.dto.DadosPessoaJuridica;
import br.com.system.syncfy.model.entity.pessoa.PessoaJuridica;
import br.com.system.syncfy.model.repository.PessoaJuridicaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/company")
public class PessoaJuridicaController {

    @Autowired
    private PessoaJuridicaRepository pessoaJuridicaRepository;


    @PostMapping
    @Transactional
    public ResponseEntity<Void> cadastrar(@RequestBody @Valid DadosCadastroPessoaJuridica dados) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica(dados);
         pessoaJuridicaRepository.save(pessoaJuridica);
        System.out.println(pessoaJuridica);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosPessoaJuridica> obterDadosPaciente(@PathVariable Long id) {
        Optional<PessoaJuridica> dadosPessoaJuridicaOptional = pessoaJuridicaRepository.findById(id);

        if (dadosPessoaJuridicaOptional.isPresent()) {
            PessoaJuridica dadosPessoajuridica = dadosPessoaJuridicaOptional.get();
            return ResponseEntity.ok(new DadosPessoaJuridica(dadosPessoajuridica));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

//    @PutMapping
//    @Transactional
//    public void atualizar(@RequestBody @Valid DadosAtualizacaoPessoaJuridica dados) {
//        PessoaJuridica pessoaJuridica = new PessoaJuridica();
//        pessoaJuridica = pessoaJuridicaRepository.getReferenceById(dados.codPessoa());
//        pessoaJuridica.atualizar(dados);
//    }

//    @DeleteMapping("/{id}")
//    @Transactional
//    public void excluir(@PathVariable Long id) {
//        PessoaJuridica pessoaJuridica = new PessoaJuridica();
//        pessoaJuridica = pessoaJuridicaRepository.getReferenceById(id);
//        pessoaJuridica.excluir();
//    }

}
