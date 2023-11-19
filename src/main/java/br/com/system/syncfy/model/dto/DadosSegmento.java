package br.com.system.syncfy.model.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosSegmento(
        @NotBlank(message = "O segmento não pode estar em branco.")
        String segmento
) {
}