package br.com.system.syncfy.model.dto.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record NewUsuarioDTO(
//        @NotBlank(message = "O nome de usuário não pode estar em branco.")
        String nome,

//        @NotBlank(message = "A senha não pode estar em branco.")
//        @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")
        String senha
) {
}