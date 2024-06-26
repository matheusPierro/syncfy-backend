package br.com.system.syncfy.model.dto.endereco;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record NewCidadeDTO(
       @NotBlank(message = "O nome da cidade não pode estar em branco.")
        String nome,

        Long codIbge,

        @Valid
        @NotBlank
        NewEstadoDTO estado
) {
}
