package br.com.system.syncfy.model.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosUsuario(
        @NotBlank(message = "O nome de usuário não pode estar em branco.")
        String usuario,

        @NotBlank(message = "A senha não pode estar em branco.")
        String senha
) {
}
