package br.com.devchampions.farmaciaonline.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import br.com.devchampions.farmaciaonline.enums.TipoPagamentoEnum;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagamentoDto {

    private Long idPagamento;
    private TipoPagamentoEnum tpPagamento;
    private BigDecimal vlPago;
    private LocalDateTime dtPagamento;
}
