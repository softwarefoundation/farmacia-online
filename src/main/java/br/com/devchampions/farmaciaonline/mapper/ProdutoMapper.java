package br.com.devchampions.farmaciaonline.mapper;

import br.com.devchampions.farmaciaonline.dto.ProdutoDto;
import br.com.devchampions.farmaciaonline.entity.Produto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProdutoMapper {
    ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);
    
    ProdutoDto toDto(Produto produto);

    Produto toEntity(ProdutoDto produtoDto);
}
