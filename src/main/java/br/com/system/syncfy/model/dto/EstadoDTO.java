package br.com.system.syncfy.model.dto;

import jakarta.validation.constraints.NotBlank;

public record EstadoDTO(
        @NotBlank(message = "O estado não pode estar em branco.")
        String estado
){
}
