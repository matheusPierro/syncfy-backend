package br.com.system.syncfy.model.dto.endereco;

import jakarta.validation.constraints.Pattern;

public record CidadeDTO(
//        @NotBlank(message = "O nome da cidade não pode estar em branco.")
        @Pattern(regexp = "[a-zA-Z]+")
        String cidade,

//        @Valid
//        @NotBlank
        EstadoDTO estado
) {
}
