package br.com.system.syncfy.model.dto.categoria;

import br.com.system.syncfy.model.entity.Categoria;
import jakarta.validation.constraints.NotBlank;

public record CategoriaDTO(
        Long codCategoria,
        @NotBlank(message = "O nome da categoria não pode estar em branco.")
        String nome
) {
    public CategoriaDTO(Categoria categoria) {
        this(
                categoria.getCodCategoria(),
                categoria.getNome()
        );
    }
}
