Schema SQL 

create table conta (
  
  	numero int,
  	agencia int,
  	titular varchar(100),
  	saldo float,
  	primary key (numero)
  )

 Query SQL

insert into conta
(agencia,numero,titular,saldo)
values (1,2456,'beatriz',20000);

insert into conta
(agencia,numero,titular,saldo)
values (1,3512,'Pedro',534);

insert into conta
(agencia,numero,titular,saldo)
values (2,4554,'gustavo',83463);


select titular,saldo from conta where agencia = 1;