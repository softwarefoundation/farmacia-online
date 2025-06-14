package br.com.devchampions.farmaciaonline.service;

import br.com.devchampions.farmaciaonline.dto.ClienteDto;
import br.com.devchampions.farmaciaonline.entity.Cliente;
import br.com.devchampions.farmaciaonline.mapper.ClienteMapper;
import br.com.devchampions.farmaciaonline.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteDto> findAll() {
        return clienteRepository.findAll().stream()
                .map(ClienteMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }

    public ClienteDto findById(Long id) {
        return clienteRepository.findById(id)
                .map(ClienteMapper.INSTANCE::toDto)
                .orElse(null);
    }

    public ClienteDto save(ClienteDto clienteDto) {
        Cliente cliente = ClienteMapper.INSTANCE.toEntity(clienteDto);
        return ClienteMapper.INSTANCE.toDto(clienteRepository.save(cliente));
    }

    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }
}
