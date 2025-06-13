--liquibase formatted sql
--changeset dherkyan.silva:4

CREATE TABLE tb_produto
(
    id_produto   INT AUTO_INCREMENT PRIMARY KEY,
    nm_produto   VARCHAR(255)   NOT NULL,
    ds_produto   TEXT,
    vl_preco     DECIMAL(10, 2) NOT NULL,
    qt_estoque   INT            NOT NULL,
    ds_categoria VARCHAR(100),
    dt_validade  DATE,
    fl_receita   BOOLEAN DEFAULT FALSE
);