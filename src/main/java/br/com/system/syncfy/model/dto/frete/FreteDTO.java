package br.com.system.syncfy.model.dto.frete;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public record FreteDTO(
        @NotNull(message = "O custo não pode ser nulo.")
        BigDecimal custo
) {
}
