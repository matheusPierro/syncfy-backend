package br.com.system.syncfy.model.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosEndereco(
        @NotBlank(message = "O CEP não pode estar em branco.")
        String cep,

        @NotBlank(message = "O logradouro não pode estar em branco.")
        String logradouro,

        String numero,
        String complemento,

        DadosBairro bairro
) {
}
