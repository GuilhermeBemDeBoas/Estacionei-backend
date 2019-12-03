INSERT INTO endereco (id_endereco, cep, numero, logradouro) VALUES
(0, '03320001', '787', 'RUA EMILIO MALLET'),
(1, '03320002', '789', 'RUA CANTAGALO'),
(2, '03320003', '788', 'RUA CARNEIRO DA CUNHA'),
(3, '03320001', '781', 'RUA EMILIO MALLET'),
(4, '03320001', '782', 'RUA EMILIO MALLET'),
(5, '03320001', '783', 'RUA EMILIO MALLET'),
(6, '03320001', '784', 'RUA EMILIO MALLET'),
(7, '03320001', '785', 'RUA EMILIO MALLET'),
(8, '03320001', '786', 'RUA EMILIO MALLET'),
(9, '03320001', '787', 'RUA EMILIO MALLET');

INSERT INTO cliente (id_cliente, cpf, nome, email, senha, id_endereco) VALUES
(0, '00000000000', 'Gabriel', 'gamarote@hotmail.com', '1234abc!', 0),
(1, '00000000000', 'Paulo', 'paulo@hotmail.com', '1234abc!', 1),
(2, '00000000000', 'Lucas', 'lucas@hotmail.com', '1234abc!', 2),
(3, '00000000000', 'Guilherme', 'guilherme@hotmail.com', '1234abc!', 3),
(4, '00000000000', 'Daniel', 'daniel@hotmail.com', '1234abc!', 4);

INSERT INTO cartao (id_cartao, num_cartao, cvv, nome_cartao, id_cliente) VALUES
(0, '9839483', '378', 'Gabriel', 0),
(1, '9302032', '784', 'Gabriel', 0),
(2, '3983928', '890', 'Lucas', 1);

INSERT INTO estacionamento (id_estacionamento, nome, id_endereco) VALUES
(0, 'ESTACIONAMENTO 1', 5),
(1, 'ESTACIONAMENTO 2', 6),
(2, 'ESTACIONAMENTO 3', 7),
(3, 'ESTACIONAMENTO 4', 8),
(4, 'ESTACIONAMENTO 5', 9);

INSERT INTO vaga (id_vaga, status, preco_hora, localizacao, id_estacionamento) VALUES
(0, 'LIVRE', '20', '30,30', 0),
(1, 'LIVRE', '20', '30,30', 0),
(2, 'LIVRE', '20', '30,30', 0),
(3, 'LIVRE', '20', '30,30', 1),
(4, 'LIVRE', '20', '30,30', 1);

INSERT INTO veiculo (id_veiculo, placa, marca, modelo, id_cliente) VALUES
(0, 'ABC1234', 'TESLA', 'MODEL S', 0),
(1, 'ABC1235', 'TESLA', 'MODEL 3', 1),
(2, 'ABC1236', 'TESLA', 'MODEL X', 2),
(3, 'ABC1237', 'TESLA', 'MODEL Y', 3),
(4, 'ABC1238', 'TESLA', 'CYBERTRUCK', 4);