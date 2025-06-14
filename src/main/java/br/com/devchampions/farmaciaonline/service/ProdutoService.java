package br.com.devchampions.farmaciaonline.service;

import br.com.devchampions.farmaciaonline.dto.ProdutoDto;
import br.com.devchampions.farmaciaonline.entity.Produto;
import br.com.devchampions.farmaciaonline.mapper.ProdutoMapper;
import br.com.devchampions.farmaciaonline.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<ProdutoDto> findAll() {
        return produtoRepository.findAll().stream()
                .map(ProdutoMapper.INSTANCE::toDto)
                .collect(Collectors.toList());
    }

    public ProdutoDto findById(Long id) {
        return produtoRepository.findById(id)
                .map(ProdutoMapper.INSTANCE::toDto)
                .orElse(null);
    }

    public ProdutoDto save(ProdutoDto produtoDto) {
        Produto produto = ProdutoMapper.INSTANCE.toEntity(produtoDto);
        return ProdutoMapper.INSTANCE.toDto(produtoRepository.save(produto));
    }

    public void deleteById(Long id) {
        produtoRepository.deleteById(id);
    }
}