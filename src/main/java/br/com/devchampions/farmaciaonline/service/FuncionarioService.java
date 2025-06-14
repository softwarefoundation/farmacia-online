package br.com.devchampions.farmaciaonline.service;

import br.com.devchampions.farmaciaonline.dto.FuncionarioDto;
import br.com.devchampions.farmaciaonline.entity.Funcionario;
import br.com.devchampions.farmaciaonline.mapper.FuncionarioMapper;
import br.com.devchampions.farmaciaonline.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<FuncionarioDto> findAll() {
        return funcionarioRepository.findAll().stream()
                .map(FuncionarioMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }

    public FuncionarioDto findById(Long id) {
        return funcionarioRepository.findById(id)
                .map(FuncionarioMapper.INSTANCE::toDto)
                .orElse(null);
    }

    public FuncionarioDto save(FuncionarioDto funcionarioDto) {
        Funcionario funcionario = FuncionarioMapper.INSTANCE.toEntity(funcionarioDto);
        return FuncionarioMapper.INSTANCE.toDto(funcionarioRepository.save(funcionario));
    }

    public void deleteById(Long id) {
        funcionarioRepository.deleteById(id);
    }
}