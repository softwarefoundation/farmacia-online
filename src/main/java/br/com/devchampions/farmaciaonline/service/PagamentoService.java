package br.com.devchampions.farmaciaonline.service;

import br.com.devchampions.farmaciaonline.dto.PagamentoDto;
import br.com.devchampions.farmaciaonline.entity.Pagamento;
import br.com.devchampions.farmaciaonline.mapper.PagamentoMapper;
import br.com.devchampions.farmaciaonline.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PagamentoService {

    private final PagamentoRepository pagamentoRepository;

    public PagamentoService(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    public List<PagamentoDto> findAll() {
        return pagamentoRepository.findAll().stream()
                .map(PagamentoMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }

    public PagamentoDto findById(Long id) {
        return pagamentoRepository.findById(id)
                .map(PagamentoMapper.INSTANCE::toDto)
                .orElse(null);
    }

    public PagamentoDto save(PagamentoDto pagamentoDto) {
        Pagamento pagamento = PagamentoMapper.INSTANCE.toEntity(pagamentoDto);
        return PagamentoMapper.INSTANCE.toDto(pagamentoRepository.save(pagamento));
    }

    public void deleteById(Long id) {
        pagamentoRepository.deleteById(id);
    }
}
