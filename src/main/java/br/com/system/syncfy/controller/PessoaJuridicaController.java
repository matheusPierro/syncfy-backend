package br.com.system.syncfy.controller;


import br.com.system.syncfy.model.dto.CadastroPessoaJuridica;
import br.com.system.syncfy.model.entity.PessoaJuridica;
import br.com.system.syncfy.model.repository.PessoaJuridicaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class PessoaJuridicaController {

    @Autowired
    private PessoaJuridicaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid CadastroPessoaJuridica dados) {
        repository.save(new PessoaJuridica(dados));
    }
}
