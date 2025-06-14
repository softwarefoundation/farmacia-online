package br.com.devchampions.farmaciaonline.controller;

import br.com.devchampions.farmaciaonline.dto.ItemPedidoDto;
import br.com.devchampions.farmaciaonline.service.ItemPedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/item-pedidos")
public class ItemPedidoController {

    private final ItemPedidoService itemPedidoService;

    public ItemPedidoController(ItemPedidoService itemPedidoService) {
        this.itemPedidoService = itemPedidoService;
    }

    @GetMapping
    public ResponseEntity<List<ItemPedidoDto>> findAll() {
        return ResponseEntity.ok(itemPedidoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemPedidoDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(itemPedidoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<ItemPedidoDto> save(@RequestBody ItemPedidoDto itemPedidoDto) {
        return ResponseEntity.ok(itemPedidoService.save(itemPedidoDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemPedidoDto> update(@PathVariable Long id, @RequestBody ItemPedidoDto itemPedidoDto) {
        return ResponseEntity.ok(itemPedidoService.save(itemPedidoDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        itemPedidoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
