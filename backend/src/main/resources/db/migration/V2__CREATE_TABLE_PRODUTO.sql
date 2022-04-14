CREATE TABLE IF NOT EXISTS restaurante.produto
(
    ID           BIGSERIAL    NOT NULL,
    NOME         VARCHAR(128) NOT NULL,
    DESCRICAO    VARCHAR(128) NOT NULL,
    PRECO        FLOAT(2)     NOT NULL,
    ID_CATEGORIA BIGSERIAL    NOT NULL,
    CONSTRAINT pk_produto primary key (ID),
    CONSTRAINT fk_categoria_produto foreign key (ID_CATEGORIA)
        REFERENCES restaurante.categoria_produto (ID)
);
