package br.com.devchampions.farmaciaonline.controller;

import br.com.devchampions.farmaciaonline.dto.FuncionarioDto;
import br.com.devchampions.farmaciaonline.service.FuncionarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping
    public ResponseEntity<List<FuncionarioDto>> findAll() {
        return ResponseEntity.ok(funcionarioService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(funcionarioService.findById(id));
    }

    @PostMapping
    public ResponseEntity<FuncionarioDto> save(@RequestBody FuncionarioDto funcionarioDto) {
        return ResponseEntity.ok(funcionarioService.save(funcionarioDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FuncionarioDto> update(@PathVariable Long id, @RequestBody FuncionarioDto funcionarioDto) {
        return ResponseEntity.ok(funcionarioService.save(funcionarioDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        funcionarioService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
