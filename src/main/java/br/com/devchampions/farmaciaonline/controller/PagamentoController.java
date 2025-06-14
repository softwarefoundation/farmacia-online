package br.com.devchampions.farmaciaonline.controller;

import br.com.devchampions.farmaciaonline.dto.PagamentoDto;
import br.com.devchampions.farmaciaonline.service.PagamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagamentos")
public class PagamentoController {

    private final PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @GetMapping
    public ResponseEntity<List<PagamentoDto>> findAll() {
        return ResponseEntity.ok(pagamentoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PagamentoDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(pagamentoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<PagamentoDto> save(@RequestBody PagamentoDto pagamentoDto) {
        return ResponseEntity.ok(pagamentoService.save(pagamentoDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PagamentoDto> update(@PathVariable Long id, @RequestBody PagamentoDto pagamentoDto) {
        return ResponseEntity.ok(pagamentoService.save(pagamentoDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        pagamentoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
