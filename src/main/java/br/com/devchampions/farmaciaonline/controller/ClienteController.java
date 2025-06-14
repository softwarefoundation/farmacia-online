package br.com.devchampions.farmaciaonline.controller;

import br.com.devchampions.farmaciaonline.dto.ClienteDto;
import br.com.devchampions.farmaciaonline.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<ClienteDto>> findAll() {
        return ResponseEntity.ok(clienteService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(clienteService.findById(id));
    }

    @PostMapping
    public ResponseEntity<ClienteDto> save(@RequestBody ClienteDto clienteDto) {
        return ResponseEntity.ok(clienteService.save(clienteDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteDto> update(@PathVariable Long id, @RequestBody ClienteDto clienteDto) {
        return ResponseEntity.ok(clienteService.save(clienteDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        clienteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
