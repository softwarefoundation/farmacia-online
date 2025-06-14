package br.com.devchampions.farmaciaonline.mapper;

import br.com.devchampions.farmaciaonline.dto.PedidoDto;
import br.com.devchampions.farmaciaonline.entity.Pedido;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PedidoMapper {
    PedidoMapper INSTANCE = Mappers.getMapper(PedidoMapper.class);

    @Mapping(source = "idPedido", target = "idPedido")
    PedidoDto toDto(Pedido pedido);

    @Mapping(source = "idPedido", target = "idPedido")
    Pedido toEntity(PedidoDto pedidoDto);
}
