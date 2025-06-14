package br.com.devchampions.farmaciaonline.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import br.com.devchampions.farmaciaonline.enums.StatusReceitaMedicaEnum;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReceitaMedicaDto {

    private Long idReceita;
    private String dsImagem;
    private LocalDateTime dtEnvio;
    private StatusReceitaMedicaEnum dsStatus;
}