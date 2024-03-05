package br.com.system.syncfy.model.dto.endereco;

public record NewEstadoDTO(
        //        @NotBlank(message = "O estado não pode estar em branco.")
        String nome,

//        @Valid
//        @NotBlank
        NewPaisDTO pais
) {
}
