--liquibase formatted sql
--changeset Vlad_Piatnitsa:v.0.03
create table department(
    id      bigserial primary key not null ,
    name    varchar(20) not null
)