package br.com.devchampions.farmaciaonline.enums;

import lombok.Getter;

@Getter
public enum TipoPagamentoEnum {
    CARTAO_CREDITO("CARTAO_CREDITO"),
    CARTAO_DEBITO("CARTAO_DEBITO"),
    PIX("PIX"),
    BOLETO_BANCARIO("BOLETO_BANCARIO"),
    DINHEIRO("DINHEIRO");

    private final String descricao;

    TipoPagamentoEnum(String descricao) {
        this.descricao = descricao;
    }
}