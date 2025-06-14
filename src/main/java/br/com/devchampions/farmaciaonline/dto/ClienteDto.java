package br.com.devchampions.farmaciaonline.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteDto {

    private Long idCliente;
    private String dsEndereco;
    private String nrTelefone;
}
