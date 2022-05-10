CREATE TABLE IF NOT EXISTS restaurante.rel_produto_pedido
(
    ID_PRODUTO   BIGSERIAL    NOT NULL,
    ID_PEDIDO    BIGSERIAL    NOT NULL,
    CONSTRAINT fk_rel_produto foreign key (ID_PRODUTO)
        REFERENCES restaurante.produto (ID),
    CONSTRAINT fk_rel_pedido foreign key (ID_PEDIDO)
        REFERENCES restaurante.pedido (ID)
);
