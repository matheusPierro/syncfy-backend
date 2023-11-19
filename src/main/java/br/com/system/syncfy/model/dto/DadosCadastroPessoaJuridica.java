package br.com.system.syncfy.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPessoaJuridica(
        @NotBlank(message = "O CNPJ não pode estar em branco.")
        String cnpj,

        @NotBlank(message = "O e-mail não pode estar em branco.")
        String email,

        @NotNull(message = "O endereço não pode ser nulo.")
        DadosEndereco endereco,

        @NotBlank(message = "O nome não pode estar em branco.")
        String nome,

        boolean softDelete,

        @NotNull(message = "O usuário não pode ser nulo.")
        DadosUsuario usuario,

        @NotNull(message = "O segmento não pode ser nulo.")
        DadosSegmento segmento
) {
}
