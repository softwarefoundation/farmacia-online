package br.com.devchampions.farmaciaonline.mapper;

import br.com.devchampions.farmaciaonline.dto.ClienteDto;
import br.com.devchampions.farmaciaonline.entity.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClienteMapper {
    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    @Mapping(source = "idCliente", target = "idCliente")
    ClienteDto toDto(Cliente cliente);

    @Mapping(source = "idCliente", target = "idCliente")
    Cliente toEntity(ClienteDto clienteDto);
}
