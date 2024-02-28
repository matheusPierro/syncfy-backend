package br.com.system.syncfy.model.dto;

import br.com.system.syncfy.model.dto.pessoa.PessoaJuridicaDTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

public record NewPedidoDTO(
        LocalDate dataCriacao,
        LocalDate dataAtualizacao,
        LocalDate dataEntrega,
        Long numeroPedido,
        String descricao,
        BigDecimal precoTotal,
        FreteDTO freteId,
        PessoaJuridicaDTO pessoaJuridicaId,
        Set<Long> produtoIds
) {}