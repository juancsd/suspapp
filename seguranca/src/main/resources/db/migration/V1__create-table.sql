-- Criação da sequência SEQ_INCIDENTE
CREATE SEQUENCE SEQ_INCIDENTE
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    CACHE 50;

-- Criação da tabela tbl_incidente
CREATE TABLE tbl_incidente (
    incidente_id BIGINT PRIMARY KEY,
    cep VARCHAR(20),
    rua VARCHAR(255),
    bairro VARCHAR(100),
    cidade VARCHAR(100),
    estado VARCHAR(2),
    observacao TEXT,
    tp_incidente VARCHAR(50)
);
