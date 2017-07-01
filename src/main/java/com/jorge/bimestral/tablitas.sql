/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  T-
 * Created: 30/05/2017
 */

create table direccion(id integer primary key auto_increment,numero integer, calle varchar(40), cp integer, municipio varchar(40));

drop table direccion;

select * from direccion;
create table SalaCine(id_sala integer primary key ,tituloPelicula varchar(80), clasificacion varchar(20), num_asientos integer);
create table Tarjetas(id_tarjetas integer primary key auto_increment,id_cliente integer, Tipo varchar(80),saldo float, fecha_corte date, foreign key(id_cliente) references Cliente(id_cliente));
describe SalaCine;

create table Cliente(id_cliente integer primary key, nombre varchar(80), tarjetas integer);
create table Tarjetas(id_tarjetas integer primary key,id_cliente integer, tipo varchar(80), saldo float, fecha_corte date, foreign key(id_cliente) references Cliente(id_cliente));

drop table Tarjetas;