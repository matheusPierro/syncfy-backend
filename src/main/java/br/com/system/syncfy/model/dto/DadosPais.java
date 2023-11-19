package br.com.system.syncfy.model.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosPais(
        @NotBlank(message = "O pais não pode estar em branco.")
        String pais
) {
}
