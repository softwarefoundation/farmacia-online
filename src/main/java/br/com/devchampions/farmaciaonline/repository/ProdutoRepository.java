package br.com.devchampions.farmaciaonline.repository;

import br.com.devchampions.farmaciaonline.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}