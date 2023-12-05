package br.com.system.syncfy.model.dto.pessoa;

import br.com.system.syncfy.model.dto.endereco.EnderecoDTO;
import br.com.system.syncfy.model.dto.SegmentoDTO;
import br.com.system.syncfy.model.dto.UsuarioDTO;
import br.com.system.syncfy.model.entity.Segmento;
import br.com.system.syncfy.model.entity.Usuario;
import br.com.system.syncfy.model.entity.pessoa.PessoaJuridica;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record PessoaJuridicaDTO(
        Long codPessoa,
        String nome,
        @NotNull String email,
        boolean softDelete,

        Usuario usuario,

        String cnpj,

        String tipo,

        Segmento segmento

) {
        public PessoaJuridicaDTO(PessoaJuridica pessoaJuridica){
                this(
                        pessoaJuridica.getCodPessoa(),
                        pessoaJuridica.getNome(),
                        pessoaJuridica.getEmail(),
                        pessoaJuridica.isSoftDelete(),
                        pessoaJuridica.getUsuario(),
                        pessoaJuridica.getCnpj(),
                        pessoaJuridica.getTipo(),
                        pessoaJuridica.getSegmento()
                );
        }
}
