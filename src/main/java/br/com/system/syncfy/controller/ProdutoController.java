package br.com.system.syncfy.controller;

import br.com.system.syncfy.model.dto.ProdutoDTO;
import br.com.system.syncfy.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/all")
    public Page<ProdutoDTO> listar(@PageableDefault() Pageable paginacao) {
        return produtoRepository.findAll(paginacao).map(ProdutoDTO :: new);
    }
}
