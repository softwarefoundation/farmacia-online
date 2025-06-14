package br.com.devchampions.farmaciaonline.mapper;

import br.com.devchampions.farmaciaonline.dto.ItemPedidoDto;
import br.com.devchampions.farmaciaonline.entity.ItemPedido;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ItemPedidoMapper {
    ItemPedidoMapper INSTANCE = Mappers.getMapper(ItemPedidoMapper.class);

    @Mapping(source = "idItemPedido", target = "idItemPedido")
    ItemPedidoDto toDto(ItemPedido itemPedido);

    @Mapping(source = "idItemPedido", target = "idItemPedido")
    ItemPedido toEntity(ItemPedidoDto itemPedidoDto);
}
