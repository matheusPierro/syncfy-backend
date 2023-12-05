package br.com.system.syncfy.model.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record PessoaJuridicaDTO(
        @NotBlank(message = "O CNPJ não pode estar em branco.")
        @Pattern(regexp = "\\d{14}", message = "O CNPJ deve conter apenas dígitos e ter 14 caracteres.")
        String cnpj,

        @NotBlank(message = "O e-mail não pode estar em branco.")
        String email,

        @NotNull
        @Valid
        EnderecoDTO endereco,

        @NotBlank(message = "O nome não pode estar em branco.")
        String nome,

        boolean softDelete,

        @NotNull
        @Valid
        UsuarioDTO usuario,

        @NotNull
        @Valid
        SegmentoDTO segmento
) {
}
