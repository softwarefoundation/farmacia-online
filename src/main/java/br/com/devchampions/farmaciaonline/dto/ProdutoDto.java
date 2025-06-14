package br.com.devchampions.farmaciaonline.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProdutoDto {

    private Long idProduto;
    private String nmProduto;
    private String dsProduto;
    private BigDecimal vlPreco;
    private Integer qtEstoque;
    private String dsCategoria;
    private Boolean flReceita;
}