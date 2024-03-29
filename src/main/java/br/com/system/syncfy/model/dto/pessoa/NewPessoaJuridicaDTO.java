package br.com.system.syncfy.model.dto.pessoa;

import br.com.system.syncfy.model.dto.endereco.NewEnderecoDTO;
import br.com.system.syncfy.model.dto.segmento.NewSegmentoDTO;
import br.com.system.syncfy.model.dto.usuario.NewUsuarioDTO;
import br.com.system.syncfy.model.entity.Segmento;
import br.com.system.syncfy.model.entity.Usuario;
import br.com.system.syncfy.model.entity.endereco.*;
import br.com.system.syncfy.model.entity.pessoa.PessoaJuridica;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public record NewPessoaJuridicaDTO(

        Long codPessoa,
        @NotNull String nome,
        @NotNull String email,
        boolean softDelete,
        @Valid NewUsuarioDTO usuario,
        @NotNull String cnpj,
        @NotNull String tipo,
        @Valid NewSegmentoDTO segmento,
        @Valid NewEnderecoDTO enderecos
){
public static PessoaJuridica of(NewPessoaJuridicaDTO pj) {
    if (Objects.isNull(pj)) return null;

    PessoaJuridica pessoa = new PessoaJuridica();
    pessoa.setNome(pj.nome);
    pessoa.setEmail(pj.email);
    pessoa.setSoftDelete(pj.softDelete);

    if (Objects.nonNull(pj.usuario)) {
        Usuario usuario = new Usuario();
        usuario.setNome(pj.usuario.nome()).setSenha(pj.usuario.senha());
        pessoa.setUsuario(usuario);
    }

    pessoa.setCnpj(pj.cnpj);
    pessoa.setTipo(pj.tipo);

    if (Objects.nonNull(pj.segmento)) {
        Segmento segmento = new Segmento();
        segmento.setNome(pj.segmento.nome());
        pessoa.setSegmento(segmento);
    }

    return pessoa;
}
}
