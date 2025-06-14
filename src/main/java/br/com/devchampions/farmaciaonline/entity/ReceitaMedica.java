package br.com.devchampions.farmaciaonline.entity;

import br.com.devchampions.farmaciaonline.enums.StatusReceitaMedicaEnum;
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
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_receita_medica")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReceitaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_receita")
    private Long idReceita;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pedido", nullable = false)
    private Pedido pedido;

    @Column(name = "ds_imagem")
    private String dsImagem;

    @Column(name = "dt_envio")
    private LocalDateTime dtEnvio;

    @Column(name = "ds_status", nullable = false, length = 20)
    private StatusReceitaMedicaEnum dsStatus;
}