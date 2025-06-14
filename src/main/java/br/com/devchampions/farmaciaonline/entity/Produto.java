package br.com.devchampions.farmaciaonline.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tb_produto")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Long idProduto;

    @Column(name = "nm_produto", nullable = false)
    private String nmProduto;

    @Column(name = "ds_produto")
    private String dsProduto;

    @Column(name = "vl_preco", nullable = false)
    private BigDecimal vlPreco;

    @Column(name = "qt_estoque", nullable = false)
    private Integer qtEstoque;

    @Column(name = "ds_categoria")
    private String dsCategoria;

    @Column(name = "dt_validade")
    private LocalDate dtValidade;

    @Column(name = "fl_receita", nullable = false)
    private Boolean flReceita;
}
