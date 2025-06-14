package br.com.devchampions.farmaciaonline.mapper;

import br.com.devchampions.farmaciaonline.dto.FuncionarioDto;
import br.com.devchampions.farmaciaonline.entity.Funcionario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FuncionarioMapper {
    FuncionarioMapper INSTANCE = Mappers.getMapper(FuncionarioMapper.class);

    @Mapping(source = "idFuncionario", target = "idFuncionario")
    FuncionarioDto toDto(Funcionario funcionario);

    @Mapping(source = "idFuncionario", target = "idFuncionario")
    Funcionario toEntity(FuncionarioDto funcionarioDto);
}