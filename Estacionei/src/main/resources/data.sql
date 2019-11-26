INSERT INTO cliente (id_cliente, cpf, nome, email, senha) VALUES
(0, "00000000000", "Gabriel", "gamarote@hotmail.com", "1234abc!"),
(2, "00000000000", "Lucas", "lucas@hotmail.com", "1234abc!"),
(1, "00000000000", "Paulo", "paulo@hotmail.com", "1234abc!"),
(4, "00000000000", "Guilherme", "guilherme@hotmail.com", "1234abc!"),
(3, "00000000000", "Daniel", "daniel@hotmail.com", "1234abc!");

INSERT INTO cartao (id_cartao, num_cartao, cvv, nome_cartao, id_cliente) VALUES
(0, "9839483", "378", "Gabriel", 0),
(1, "9302032", "784", "Gabriel", 0),
(2, "3983928", "890", "Lucas", 1);

INSERT INTO endereco (id_endereco, cep, numero, logradouro) VALUES
(0, "03320001", "787", "RUA EMILIO MALLET"),
(1, "03320002", "789", "RUA CANTAGALO"),
(2, "03320003", "788", "RUA CARNEIRO DA CUNHA");

INSERT INTO estacionamento (id_estacionamento, nome) VALUES
(0, "ESTACIONAMENTO 1"),
(1, "ESTACIONAMENTO 2"),
(2, "ESTACIONAMENTO 3"),
(3, "ESTACIONAMENTO 4"),
(4, "ESTACIONAMENTO 5");

INSERT INTO vaga (id_vaga, status, preco_hora, localizacao, id_estacionamento) VALUES
(0, "LIVRE", "20", "30,30", 0),
(1, "LIVRE", "20", "30,30", 0),
(2, "LIVRE", "20", "30,30", 0),
(3, "LIVRE", "20", "30,30", 1),
(4, "LIVRE", "20", "30,30", 1);

INSERT INTO ticket (id_ticket, data, status) VALUES
(0, "2019-01-01", "PENDENTE"),
(1, "2019-01-01", "PENDENTE"),
(2, "2019-01-01", "PENDENTE"),
(3, "2019-01-01", "PENDENTE"),
(4, "2019-01-01", "PENDENTE");

INSERT INTO veiculo (id_veiculo, placa, marca, modelo, id_cliente) VALUES
(0, "ABC1234", "VOLKWAGEN", "GOL", 1),
(1, "ABC1234", "VOLKWAGEN", "GOL", 2),
(2, "ABC1234", "VOLKWAGEN", "GOL", 3),
(3, "ABC1234", "VOLKWAGEN", "GOL", 4),
(4, "ABC1234", "VOLKWAGEN", "GOL", 5);
