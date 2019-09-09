create database dbUsers;

use dbUsers;

create table usuario (
	id bigint primary key auto_increment,
	userName varchar (50) unique not null, 
	senha varchar (150),
	nome varchar (50));
	
drop function if exists criptografia;

delimiter $$
create function criptografia(vsenha varchar(30)) returns varchar(150)
begin 
	set @chave = concat ('stephanietavares@meuemail.com',
	'www.blablabla.com.br');
	set @chave2 = concat(vsenha, @chave);
	return md5(@chave2);	
end;

$$
delimiter;
 
