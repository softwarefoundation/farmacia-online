package br.com.devchampions.farmaciaonline.entity;

import br.com.devchampions.farmaciaonline.enums.TipoPagamentoEnum;
import br.com.devchampions.farmaciaonline.enums.StatusPedidoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_pagamento")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pagamento")
    private Long idPagamento;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pedido", nullable = false)
    private Pedido pedido;

    @Column(name = "tp_pagamento", nullable = false, length = 30)
    private TipoPagamentoEnum tpPagamento;

    @Column(name = "vl_pago", nullable = false)
    private BigDecimal vlPago;

    @Column(name = "ds_status", nullable = false, length = 20)
    private StatusPedidoEnum dsStatus;

    @Column(name = "dt_pagamento")
    private LocalDateTime dtPagamento;
}
