package br.com.devchampions.farmaciaonline.controller;

import br.com.devchampions.farmaciaonline.dto.ProdutoDto;
import br.com.devchampions.farmaciaonline.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<ProdutoDto>> findAll() {
        return ResponseEntity.ok(produtoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDto> findById(@PathVariable Long id) {
        ProdutoDto dto = produtoService.findById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<ProdutoDto> create(@RequestBody ProdutoDto produtoDto) {
        return ResponseEntity.ok(produtoService.save(produtoDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoDto> update(@PathVariable Long id, @RequestBody ProdutoDto produtoDto) {
        ProdutoDto updated = produtoService.save(produtoDto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        produtoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}