package br.com.devchampions.farmaciaonline.service;

import br.com.devchampions.farmaciaonline.dto.ReceitaMedicaDto;
import br.com.devchampions.farmaciaonline.entity.ReceitaMedica;
import br.com.devchampions.farmaciaonline.mapper.ReceitaMedicaMapper;
import br.com.devchampions.farmaciaonline.repository.ReceitaMedicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReceitaMedicaService {

    private final ReceitaMedicaRepository receitaMedicaRepository;

    public ReceitaMedicaService(ReceitaMedicaRepository receitaMedicaRepository) {
        this.receitaMedicaRepository = receitaMedicaRepository;
    }

    public List<ReceitaMedicaDto> findAll() {
        return receitaMedicaRepository.findAll().stream()
                .map(ReceitaMedicaMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }

    public ReceitaMedicaDto findById(Long id) {
        return receitaMedicaRepository.findById(id)
                .map(ReceitaMedicaMapper.INSTANCE::toDto)
                .orElse(null);
    }

    public ReceitaMedicaDto save(ReceitaMedicaDto receitaMedicaDto) {
        ReceitaMedica receitaMedica = ReceitaMedicaMapper.INSTANCE.toEntity(receitaMedicaDto);
        return ReceitaMedicaMapper.INSTANCE.toDto(receitaMedicaRepository.save(receitaMedica));
    }

    public void deleteById(Long id) {
        receitaMedicaRepository.deleteById(id);
    }
}
