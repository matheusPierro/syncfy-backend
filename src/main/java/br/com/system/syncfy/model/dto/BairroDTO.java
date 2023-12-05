package br.com.system.syncfy.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record BairroDTO(
        @NotBlank(message = "O bairro não pode estar em branco.")
        @Pattern(regexp = "[a-zA-Z]+")
        String bairro
) {
}