--liquibase formatted sql
--changeset Vlad_Piatnitsa:v.0.01
create table address(
    id          bigserial   primary key not null ,
    city        varchar(20) not null,
    street      varchar(30) not null,
    house       integer     not null,
    apartment   integer     not null
);