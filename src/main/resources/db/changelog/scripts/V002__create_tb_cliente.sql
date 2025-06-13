--liquibase formatted sql
--changeset dherkyan.silva:2

CREATE TABLE tb_cliente
(
    id_cliente  INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario  INT NOT NULL,
    ds_endereco TEXT,
    nr_telefone VARCHAR(20),
    FOREIGN KEY (id_usuario) REFERENCES tb_usuario (id_usuario)
);