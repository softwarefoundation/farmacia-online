package br.com.devchampions.farmaciaonline.enums;

import lombok.Getter;

@Getter
public enum StatusReceitaMedicaEnum {
    PENDENTE("PENDENTE"),
    APROVADA("APROVADA"),
    REJEITADA("REJEITADA");

    private final String descricao;

    StatusReceitaMedicaEnum(String descricao) {
        this.descricao = descricao;
    }
}
