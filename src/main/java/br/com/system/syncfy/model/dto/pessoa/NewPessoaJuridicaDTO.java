package br.com.system.syncfy.model.dto.pessoa;

import br.com.system.syncfy.model.dto.SegmentoDTO;
import br.com.system.syncfy.model.dto.UsuarioDTO;
import br.com.system.syncfy.model.dto.endereco.EnderecoDTO;
import br.com.system.syncfy.model.entity.Segmento;
import br.com.system.syncfy.model.entity.Usuario;
import jakarta.validation.constraints.NotNull;

public record NewPessoaJuridicaDTO(
         String nome,
         @NotNull String email,
         boolean softDelete,

         Usuario usuario,

         String cnpj,

         String tipo,

         Segmento segmento,

         EnderecoDTO endereco
) {
}
