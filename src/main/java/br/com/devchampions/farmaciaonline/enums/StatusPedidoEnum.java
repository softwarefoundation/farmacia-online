package br.com.devchampions.farmaciaonline.enums;

import lombok.Getter;

@Getter
public enum StatusPedidoEnum {
    PENDENTE("PENDENTE"),
    PROCESSANDO("PROCESSANDO"),
    PAGO("PAGO"),
    ENVIADO("ENVIADO"),
    ENTREGUE("ENTREGUE"),
    CANCELADO("CANCELADO");

    private final String descricao;

    StatusPedidoEnum(String descricao) {
        this.descricao = descricao;
    }
}
