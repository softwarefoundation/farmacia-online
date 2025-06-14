package br.com.devchampions.farmaciaonline.entity;

import br.com.devchampions.farmaciaonline.enums.TipoUsuarioEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "nm_usuario", nullable = false)
    private String nmUsuario;

    @Column(name = "ds_email", nullable = false, unique = true)
    private String dsEmail;

    @Column(name = "ds_senha", nullable = false)
    private String dsSenha;

    @Column(name = "nr_cpf", nullable = false, unique = true)
    private String nrCpf;

    @Column(name = "dt_nascimento", nullable = false)
    private LocalDate dtNascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "fl_tipo", nullable = false, length = 1)
    private TipoUsuarioEnum flTipo;

    @Column(name = "dt_cadastro", updatable = false)
    private LocalDateTime dtCadastro;
}
