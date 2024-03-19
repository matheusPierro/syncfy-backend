package br.com.system.syncfy.controller;

import br.com.system.syncfy.model.dto.categoria.CategoriaDTO;
import br.com.system.syncfy.model.dto.categoria.NewCategoriaDTO;
import br.com.system.syncfy.model.dto.produto.ProdutoDTO;
import br.com.system.syncfy.model.entity.Categoria;
import br.com.system.syncfy.model.repository.CategoriaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping("/all")
    public Page<CategoriaDTO> listar(@PageableDefault() Pageable paginacao) {
        return categoriaRepository.findAll(paginacao).map(CategoriaDTO:: new);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Void> cadastrar(@RequestBody @Valid NewCategoriaDTO dados) {
        Categoria categoria = new Categoria(dados);
        categoriaRepository.save(categoria);
        System.out.println(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
