package br.com.devchampions.farmaciaonline.repository;

import br.com.devchampions.farmaciaonline.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
