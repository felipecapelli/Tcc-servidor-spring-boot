INSERT INTO USUARIO(email, nome, senha, fotografia, avaliacao_media, telefone) VALUES('felipecapelli_uru@hotmail.com', 'Felipe Capelli', '$2a$10$G3unU/j/chg8BfK4pSIemeNF4JFLllSY7kkW/3iUGtVD5lmJxIe7C', 'localDaFoto', 5, '(16)99782-6732');
insert into usuario(email, nome, senha, fotografia, avaliacao_media, telefone) VALUES('fatima@yahoo.com.br', 'Fatima Capelli', '$2a$10$k34uJZ/WEYx0VHhclG8ShODAYQRHLNrPU3okoB.J1bxidL78LgqQi', 'localDaFotoFatima', 10, '(16)3337-4159');

insert into usuario(email, nome, senha, fotografia, avaliacao_media, telefone) VALUES('valentim@gmail.com', 'Valentim Capelli', '$2a$10$eE28cHi2v/h7r2H1iWDzO.LVSVIceXiM.Koj8XtXjlo3FElPDo2Pq', 'localDaFotoValentim', 9, '(16)99730-3040');
insert into produtor(email, nome_sitio, endereco, entidade_social) VALUES('valentim@gmail.com', 'Sítio São João', 'Estrada Uru à Pirajuí, km2, Uru-SP', 'AACD');
insert into usuario(email, nome, senha, fotografia, avaliacao_media, telefone) VALUES('josesilva@gmail.com', 'Jose da Silva', '$2a$10$6Znt6Fm80gmV3QCCodRMFuZSbLJhCHIwdM3AIckEHFj.2ZjXBnk8y', 'localDaFotoJose', 7, '(16)99722-3344');
insert into produtor(email, nome_sitio, endereco, entidade_social) VALUES('josesilva@gmail.com', 'Sítio Bom Jesus', 'Estrada Araraquara à Bueno De Andrada, km10, Araraquara-SP', 'Graac');
insert into usuario(email, nome, senha, fotografia, avaliacao_media, telefone) VALUES('carlossouza@gmail.com', 'Carlos Souza', '$2a$10$XH3wwWWF6jo1Za35MqjyCunUM3kUsVhwN01/4HSLSRkmAZRaplnTG', 'localDaFotoCarlos', 8, '(16)99730-2788');
insert into produtor(email, nome_sitio, endereco, entidade_social) VALUES('carlossouza@gmail.com', 'Sítio Nossa Senhora', 'Assentamento Monte Alegre I, Lote 10, Araraquara-SP', 'Lar dos idosos de Araraquara');
insert into usuario(email, nome, senha, fotografia, avaliacao_media, telefone) VALUES('manuel@gmail.com', 'Manuel Silva', '$2a$10$XH3wwWWF6jo1Za35MqjyCunUM3kUsVhwN01/4HSLSRkmAZRaplnTG', 'localDaFotoManuel', 8, '(16)99829-3232');
insert into produtor(email, nome_sitio, endereco, entidade_social) VALUES('manuel@gmail.com', 'Sítio Portugal', 'Fazenda São Manuel, Araraquara-SP', 'AACD');


insert into feira(id, nome, endereco, data) values (1, 'Feira Jardim América', 'Avenida Uchoa, 393, Araraquara-SP','2020-10-02');
insert into feira(id, nome, endereco, data) values (2, 'Feira Praça Brasil', 'Avenida Brasil, 433, Araraquara-SP','2020-09-15');
insert into feira(id, nome, endereco, data) values (3, 'Feira Terminal Integração','Avenida Portugal, 501, Araraquara-SP','2020-06-25');
insert into feira(id, nome, endereco, data) values (4, 'Feira da Praca','Avenida Batista de Carvalho, Bauru-SP','2020-10-03');
insert into feira(id, nome, endereco, data) values (5, 'Feira Vale do Sol','Avenida Mato Grosso, Araraquara-SP','2020-11-03');
insert into feira(id, nome, endereco, data) values (6, 'Feira Pinheirinho','Avenida Batista de Carvalho, Araraquara-SP','2020-09-03');
insert into feira(id, nome, endereco, data) values (7, 'Feira Centro','Avenida Praça central, Araraquara-SP','2020-07-03');
insert into feira(id, nome, endereco, data) values (8, 'Feira Morumbi','Avenida Italia, Araraquara-SP','2020-06-08');

insert into tipo(id_tipo, nome) values (1, 'verdura');
insert into tipo(id_tipo, nome) values (2, 'legume');
insert into tipo(id_tipo, nome) values (3, 'fruta');
insert into tipo(id_tipo, nome) values (4, 'anual');
insert into tipo(id_tipo, nome) values (5, 'florestal');
insert into tipo(id_tipo, nome) values (6, 'artesanato');
insert into tipo(id_tipo, nome) values (7, 'doces');
insert into tipo(id_tipo, nome) values (8, 'salgados');
insert into tipo(id_tipo, nome) values (9, 'bebidas');
insert into tipo(id_tipo, nome) values (10, 'origem animal');

insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (1, 1, 'alface', true, 'maço');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (2, 2, 'tomate', true, 'kg');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (3, 3, 'laranja', true, 'kg');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (4, 4, 'milho', true, 'saco');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (5, 5, 'lenha', true, 'saco');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (6, 6, 'balaio', true, 'unidade');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (7, 7, 'bolo', true, 'unidade');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (8, 8, 'coxinha', true, 'unidade');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (9, 9, 'garapa', true, 'litro');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (10, 10, 'leite', true, 'litro');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (11, 1, 'cheiro verde', true, 'maço');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (12, 2, 'abobrinha', true, 'kg');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (13, 3, 'goiaba', true, 'kg');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (14, 4, 'feijão', true, 'saco');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (15, 5, 'carvão', true, 'saco');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (16, 6, 'folha de bananeira', true, 'unidade');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (17, 7, 'doce de leite', true, 'unidade');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (18, 8, 'pastel', true, 'unidade');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (19, 9, 'cachaça', true, 'litro');
insert into produto(id_produto, tipo_id_tipo, nome, organico, unidade) values (20, 10, 'queijo', true, 'unidade');

insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 1, 1, 2.50);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 1, 3, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 2, 2, 2.50);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 3, 6, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 3, 2, 2.20);--teste
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 3, 5, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 3, 10, 1.99);--teste2
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 3, 11, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 3, 12, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 3, 13, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 3, 14, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 4, 10, 1.99);--teste3
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 4, 11, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 4, 12, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 4, 13, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 5, 10, 1.99);--teste3
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 5, 11, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 5, 12, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 5, 13, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 6, 10, 1.99);--teste3
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 6, 11, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 6, 12, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 6, 13, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 7, 10, 1.99);--teste3
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 7, 11, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 7, 12, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 7, 13, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 8, 10, 1.99);--teste3
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 8, 11, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 8, 12, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('valentim@gmail.com', 8, 13, 1.99);

insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('josesilva@gmail.com', 4, 10, 2.25);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('josesilva@gmail.com', 4, 20, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('josesilva@gmail.com', 4, 18, 2.50);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('josesilva@gmail.com', 4, 19, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('josesilva@gmail.com', 3, 16, 1.99);

insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('carlossouza@gmail.com', 2, 1, 2.50);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('carlossouza@gmail.com', 2, 3, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('carlossouza@gmail.com', 4, 10, 2.50);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('carlossouza@gmail.com', 3, 6, 1.99);
insert into produtor_produto_feira(produtor_email, feira_id, produto_id_produto, preco) values ('carlossouza@gmail.com', 3, 10, 1.99);


insert into compra_reserva(usuario_email, produtor_email, feira_id, avaliacao_cliente, avaliacao_produtor, data_reserva, data_venda) values ('felipecapelli_uru@hotmail.com', 'valentim@gmail.com', 4, 10, 10, '2020-03-20T00:00:00', '2020-10-03T00:00:00');
insert into compra_reserva(usuario_email, produtor_email, feira_id, avaliacao_cliente, avaliacao_produtor, data_reserva) values ('felipecapelli_uru@hotmail.com', 'valentim@gmail.com', 4, 10, 10, '2020-02-23T00:00:00');
insert into compra_reserva(usuario_email, produtor_email, feira_id, avaliacao_cliente, avaliacao_produtor, data_reserva, data_venda) values ('felipecapelli_uru@hotmail.com', 'carlossouza@gmail.com', 4, 10, 10, '2020-03-20T00:00:00', '2020-10-03T00:00:00');
insert into compra_reserva(usuario_email, produtor_email, feira_id, avaliacao_cliente, avaliacao_produtor, data_reserva) values ('felipecapelli_uru@hotmail.com', 'carlossouza@gmail.com', 4, 10, 10, '2020-02-23T00:00:00');
insert into compra_reserva(usuario_email, produtor_email, feira_id, avaliacao_cliente, avaliacao_produtor, data_reserva, data_venda) values ('fatima@yahoo.com.br', 'valentim@gmail.com', 4, 10, 10, '2020-03-20T00:00:00', '2020-10-03T00:00:00');
insert into compra_reserva(usuario_email, produtor_email, feira_id, avaliacao_cliente, avaliacao_produtor, data_reserva) values ('fatima@yahoo.com.br', 'valentim@gmail.com', 4, 10, 10, '2020-02-23T00:00:00');
insert into compra_reserva(usuario_email, produtor_email, feira_id, avaliacao_cliente, avaliacao_produtor, data_reserva, data_venda) values ('fatima@yahoo.com.br', 'carlossouza@gmail.com', 4, 10, 10, '2020-03-20T00:00:00', '2020-10-03T00:00:00');
insert into compra_reserva(usuario_email, produtor_email, feira_id, avaliacao_cliente, avaliacao_produtor, data_reserva) values ('fatima@yahoo.com.br', 'carlossouza@gmail.com', 4, 10, 10, '2020-02-23T00:00:00');

insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (1,10);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (1,11);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (1,12);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (2,11);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (2,13);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (2,10);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (3,10);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (3,11);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (3,12);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (4,10);

insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (5,10);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (5,11);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (5,12);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (6,11);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (6,13);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (6,10);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (7,10);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (7,11);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (7,12);
insert into lista_produtos(compra_reserva_id_compra_reserva, produto_id_produto) values (8,10);