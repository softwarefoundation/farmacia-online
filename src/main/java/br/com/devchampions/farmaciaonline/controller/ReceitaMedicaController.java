package br.com.devchampions.farmaciaonline.controller;

import br.com.devchampions.farmaciaonline.dto.ReceitaMedicaDto;
import br.com.devchampions.farmaciaonline.service.ReceitaMedicaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/receitas")
public class ReceitaMedicaController {

    private final ReceitaMedicaService receitaMedicaService;

    public ReceitaMedicaController(ReceitaMedicaService receitaMedicaService) {
        this.receitaMedicaService = receitaMedicaService;
    }

    @GetMapping
    public ResponseEntity<List<ReceitaMedicaDto>> findAll() {
        return ResponseEntity.ok(receitaMedicaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReceitaMedicaDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(receitaMedicaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<ReceitaMedicaDto> save(@RequestBody ReceitaMedicaDto receitaMedicaDto) {
        return ResponseEntity.ok(receitaMedicaService.save(receitaMedicaDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReceitaMedicaDto> update(@PathVariable Long id, @RequestBody ReceitaMedicaDto receitaMedicaDto) {
        return ResponseEntity.ok(receitaMedicaService.save(receitaMedicaDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        receitaMedicaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}