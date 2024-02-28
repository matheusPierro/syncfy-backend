package br.com.system.syncfy.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

public record NewPedidoDTO(
        LocalDate dataEntrega,
        Long numeroPedido,
        String descricao,
        BigDecimal precoTotal,
        Long freteId,
        Long pessoaJuridicaId, // Referência ao ID da Pessoa Jurídica
        Set<Long> produtoIds // IDs dos Produtos
) {}