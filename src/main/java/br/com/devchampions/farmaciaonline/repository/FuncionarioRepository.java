package br.com.devchampions.farmaciaonline.repository;

import br.com.devchampions.farmaciaonline.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}