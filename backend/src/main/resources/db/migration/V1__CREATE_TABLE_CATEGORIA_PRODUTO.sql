CREATE EXTENSION IF NOT EXISTS unaccent;

CREATE SCHEMA IF NOT EXISTS restaurante;

CREATE TABLE IF NOT EXISTS restaurante.categoria_produto
(
    ID   BIGSERIAL NOT NULL,
    NOME VARCHAR(128),
    CONSTRAINT pk_categoria primary key (ID)
);
