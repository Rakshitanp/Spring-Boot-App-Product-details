create database product;
use product;
create table product_details(prod_id varchar(10) primary key,prod_name varchar(20) not null,prod_code varchar(10) unique,prod_type varchar(20) not null);