package br.com.devchampions.farmaciaonline.controller;

import br.com.devchampions.farmaciaonline.dto.PedidoDto;
import br.com.devchampions.farmaciaonline.service.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping
    public ResponseEntity<List<PedidoDto>> findAll() {
        return ResponseEntity.ok(pedidoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(pedidoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<PedidoDto> save(@RequestBody PedidoDto pedidoDto) {
        return ResponseEntity.ok(pedidoService.save(pedidoDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PedidoDto> update(@PathVariable Long id, @RequestBody PedidoDto pedidoDto) {
        return ResponseEntity.ok(pedidoService.save(pedidoDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        pedidoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
