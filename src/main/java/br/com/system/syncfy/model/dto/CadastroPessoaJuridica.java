package br.com.system.syncfy.model.dto;

import br.com.system.syncfy.model.entity.Segmento;
import jakarta.validation.constraints.NotNull;

public record CadastroPessoaJuridica(
        @NotNull
        String cnpj,
        Segmento segmento
) {
}
