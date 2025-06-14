package br.com.devchampions.farmaciaonline.repository;

import br.com.devchampions.farmaciaonline.entity.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}