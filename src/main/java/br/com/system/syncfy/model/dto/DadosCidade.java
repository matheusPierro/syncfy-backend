package br.com.system.syncfy.model.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosCidade(
        @NotBlank(message = "O cidade não pode estar em branco.")
        String cidade
) {
}
