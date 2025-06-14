package br.com.devchampions.farmaciaonline.mapper;

import br.com.devchampions.farmaciaonline.dto.ReceitaMedicaDto;
import br.com.devchampions.farmaciaonline.entity.ReceitaMedica;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReceitaMedicaMapper {
    ReceitaMedicaMapper INSTANCE = Mappers.getMapper(ReceitaMedicaMapper.class);

    @Mapping(source = "idReceita", target = "idReceita")
    ReceitaMedicaDto toDto(ReceitaMedica receitaMedica);

    @Mapping(source = "idReceita", target = "idReceita")
    ReceitaMedica toEntity(ReceitaMedicaDto receitaMedicaDto);
}
