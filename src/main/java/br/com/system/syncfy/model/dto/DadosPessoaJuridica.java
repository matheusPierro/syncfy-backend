package br.com.system.syncfy.model.dto;

import br.com.system.syncfy.model.entity.Segmento;
import br.com.system.syncfy.model.entity.Usuario;
import br.com.system.syncfy.model.entity.pessoa.PessoaJuridica;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosPessoaJuridica(
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
//    public DadosPessoaJuridica(PessoaJuridica pessoaJuridica){
//        this(
//                pessoaJuridica.getCnpj(),
//                pessoaJuridica.getEmail(),
//                pessoaJuridica.getNome(),
//                pessoaJuridica.getUsuario(),
//                pessoaJuridica.getSegmento()
//        );
//    }

//    public DadosPessoaJuridica(String cnpj, String email, String nome, Usuario usuario, Segmento segmento) {
//
//    }
}
