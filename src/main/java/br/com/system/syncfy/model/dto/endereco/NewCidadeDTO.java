package br.com.system.syncfy.model.dto.endereco;

import jakarta.validation.constraints.Pattern;

public record NewCidadeDTO(
        //        @NotBlank(message = "O nome da cidade não pode estar em branco.")
        @Pattern(regexp = "[a-zA-Z]+")
        String nome,

        Long codIbge,

//        @Valid
//        @NotBlank
        NewEstadoDTO estado
) {
}
