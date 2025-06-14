package br.com.devchampions.farmaciaonline.service;

import br.com.devchampions.farmaciaonline.dto.PedidoDto;
import br.com.devchampions.farmaciaonline.entity.Pedido;
import br.com.devchampions.farmaciaonline.mapper.PedidoMapper;
import br.com.devchampions.farmaciaonline.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<PedidoDto> findAll() {
        return pedidoRepository.findAll().stream()
                .map(PedidoMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }

    public PedidoDto findById(Long id) {
        return pedidoRepository.findById(id)
                .map(PedidoMapper.INSTANCE::toDto)
                .orElse(null);
    }

    public PedidoDto save(PedidoDto pedidoDto) {
        Pedido pedido = PedidoMapper.INSTANCE.toEntity(pedidoDto);
        return PedidoMapper.INSTANCE.toDto(pedidoRepository.save(pedido));
    }

    public void deleteById(Long id) {
        pedidoRepository.deleteById(id);
    }
}
