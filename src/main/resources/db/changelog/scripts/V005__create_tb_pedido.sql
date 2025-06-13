--liquibase formatted sql
--changeset dherkyan.silva:5

CREATE TABLE tb_pedido
(
    id_pedido  INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT NOT NULL,
    dt_pedido  DATETIME       DEFAULT CURRENT_TIMESTAMP,
    vl_total   DECIMAL(10, 2) DEFAULT 0.00,
    ds_status  VARCHAR(50)    DEFAULT 'pendente',
    FOREIGN KEY (id_cliente) REFERENCES tb_cliente (id_cliente)
);