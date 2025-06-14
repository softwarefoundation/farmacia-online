package br.com.devchampions.farmaciaonline.enums;

import lombok.Getter;

@Getter
public enum TipoUsuarioEnum {
    CLIENTE("Cliente"),
    FUNCIONARIO("Funcionário");

    private final String descricao;

    TipoUsuarioEnum(String codigo) {
        this.descricao = codigo;
    }

    public static TipoUsuarioEnum fromCodigo(String codigo) {
        for (TipoUsuarioEnum tipo : TipoUsuarioEnum.values()) {
            if (tipo.getDescricao().equals(codigo) ) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código inválido para TipoUsuarioEnum: " + codigo);
    }
}
