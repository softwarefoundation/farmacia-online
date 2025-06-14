package br.com.devchampions.farmaciaonline.mapper;

import br.com.devchampions.farmaciaonline.dto.PagamentoDto;
import br.com.devchampions.farmaciaonline.entity.Pagamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PagamentoMapper {
    PagamentoMapper INSTANCE = Mappers.getMapper(PagamentoMapper.class);

    @Mapping(source = "idPagamento", target = "idPagamento")
    PagamentoDto toDto(Pagamento pagamento);

    @Mapping(source = "idPagamento", target = "idPagamento")
    Pagamento toEntity(PagamentoDto pagamentoDto);
}
