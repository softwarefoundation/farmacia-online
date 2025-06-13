--liquibase formatted sql
--changeset dherkyan.silva:1

CREATE TABLE tb_usuario
(
    id_usuario    INT AUTO_INCREMENT PRIMARY KEY,
    nm_usuario    VARCHAR(255) NOT NULL,
    ds_email      VARCHAR(255) NOT NULL UNIQUE,
    ds_senha      VARCHAR(255) NOT NULL,
    nr_cpf        VARCHAR(14)  NOT NULL UNIQUE,
    dt_nascimento DATE         NOT NULL,
    fl_tipo       CHAR(1)      NOT NULL COMMENT 'C: Cliente, F: Funcionário',
    dt_cadastro   DATETIME DEFAULT CURRENT_TIMESTAMP
);