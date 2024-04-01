package br.com.system.syncfy.controller;

import br.com.system.syncfy.model.dto.produto.NewProdutoDTO;
import br.com.system.syncfy.model.dto.produto.ProdutoDTO;
import br.com.system.syncfy.model.entity.Produto;
import br.com.system.syncfy.model.repository.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/all")
    public Page<ProdutoDTO> listar(@PageableDefault() Pageable paginacao) {
        return produtoRepository.findAll(paginacao).map(ProdutoDTO :: new);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Void> cadastrar(@RequestBody @Valid NewProdutoDTO dados) {
        Produto produto = new Produto(dados);
        produtoRepository.save(produto);
        System.out.println(produto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
