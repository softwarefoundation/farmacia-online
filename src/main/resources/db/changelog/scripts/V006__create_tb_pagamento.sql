--liquibase formatted sql
--changeset dherkyan.silva:6

CREATE TABLE tb_pagamento
(
    id_pagamento INT AUTO_INCREMENT PRIMARY KEY,
    id_pedido    INT            NOT NULL,
    tp_pagamento VARCHAR(50)    NOT NULL,
    vl_pago      DECIMAL(10, 2) NOT NULL,
    ds_status    VARCHAR(50) DEFAULT 'pendente',
    dt_pagamento DATETIME    DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_pedido) REFERENCES tb_pedido (id_pedido)
);