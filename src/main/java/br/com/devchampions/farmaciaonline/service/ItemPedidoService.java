package br.com.devchampions.farmaciaonline.service;

import br.com.devchampions.farmaciaonline.dto.ItemPedidoDto;
import br.com.devchampions.farmaciaonline.entity.ItemPedido;
import br.com.devchampions.farmaciaonline.mapper.ItemPedidoMapper;
import br.com.devchampions.farmaciaonline.repository.ItemPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemPedidoService {

    private final ItemPedidoRepository itemPedidoRepository;

    public ItemPedidoService(ItemPedidoRepository itemPedidoRepository) {
        this.itemPedidoRepository = itemPedidoRepository;
    }

    public List<ItemPedidoDto> findAll() {
        return itemPedidoRepository.findAll().stream()
                .map(ItemPedidoMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }

    public ItemPedidoDto findById(Long id) {
        return itemPedidoRepository.findById(id)
                .map(ItemPedidoMapper.INSTANCE::toDto)
                .orElse(null);
    }

    public ItemPedidoDto save(ItemPedidoDto itemPedidoDto) {
        ItemPedido itemPedido = ItemPedidoMapper.INSTANCE.toEntity(itemPedidoDto);
        return ItemPedidoMapper.INSTANCE.toDto(itemPedidoRepository.save(itemPedido));
    }

    public void deleteById(Long id) {
        itemPedidoRepository.deleteById(id);
    }
}
