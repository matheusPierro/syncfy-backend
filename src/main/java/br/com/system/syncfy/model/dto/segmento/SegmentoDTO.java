package br.com.system.syncfy.model.dto.segmento;

import br.com.system.syncfy.model.entity.Segmento;
import br.com.system.syncfy.model.entity.pessoa.PessoaJuridica;
import jakarta.validation.constraints.*;

public record SegmentoDTO(
        @NotBlank(message = "O segmento não pode estar em branco.")
        @Pattern(regexp = "[a-zA-Z]+")
        String nome
)

{
        public SegmentoDTO(Segmento segmento){
                this(
                       segmento.getNome()
                );
}
}
