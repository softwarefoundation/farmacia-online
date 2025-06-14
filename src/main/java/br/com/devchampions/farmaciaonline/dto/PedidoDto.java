package br.com.devchampions.farmaciaonline.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PedidoDto {

    private Long idPedido;
    private LocalDateTime dtPedido;
    private BigDecimal vlTotal;
}
