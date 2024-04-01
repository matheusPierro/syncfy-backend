package br.com.system.syncfy.model.dto.produto;

import java.math.BigDecimal;

public record NewProdutoDTO (

        long codProduto,
        BigDecimal valorUnitario,
        String nome,
        String descricao,
        String sku,
        Long categoria
)  {}




