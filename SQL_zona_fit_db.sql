create database zona_fit_db;
use zona_fit_db;

create table cliente(
id int primary key auto_increment,
nombre varchar(45),
apellido varchar(45),
membresia int
);