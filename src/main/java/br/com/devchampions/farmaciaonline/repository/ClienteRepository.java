package br.com.devchampions.farmaciaonline.repository;

import br.com.devchampions.farmaciaonline.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}