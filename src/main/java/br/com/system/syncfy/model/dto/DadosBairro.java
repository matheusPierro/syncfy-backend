package br.com.system.syncfy.model.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosBairro(
        @NotBlank(message = "O bairro não pode estar em branco.")
        String bairro
) {
}
