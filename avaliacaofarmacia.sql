create database avaliacaofarmacia;

use avaliacaofarmacia;

create table CONTROLE_ESTOQUE(
Medicamento varchar(99) not null,
DATA_PRODUCAO int not null,
DATA_VENCIMENTO int not null,
ESTOQUE varchar(99) not null,
PRECO varchar(99) not null
);