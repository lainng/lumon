--liquibase formatted sql
--changeset Vlad_Piatnitsa:v.0.03
create table patient
(
    id            bigserial primary key not null,
    first_name    varchar(30)           not null,
    last_name     varchar(30)           not null,
    mobile_number varchar(20)           not null,
    email         varchar(30)           not null,
    address_id    bigint                not null
        references address (id)
)