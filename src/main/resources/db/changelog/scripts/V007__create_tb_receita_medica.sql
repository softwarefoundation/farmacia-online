--liquibase formatted sql
--changeset dherkyan.silva:7

CREATE TABLE tb_receita_medica
(
    id_receita INT AUTO_INCREMENT PRIMARY KEY,
    id_pedido  INT NOT NULL,
    ds_imagem  TEXT,
    dt_envio   DATETIME    DEFAULT CURRENT_TIMESTAMP,
    ds_status  VARCHAR(50) DEFAULT 'pendente',
    FOREIGN KEY (id_pedido) REFERENCES tb_pedido (id_pedido)
);