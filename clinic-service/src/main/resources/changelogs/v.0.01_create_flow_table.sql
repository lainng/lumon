--liquibase formatted sql
--changeset Vlad_Piatnitsa:v.0.01
create type flow_status as enum('OPEN', 'CLOSE');

create table tickets_flow(
    id          bigserial   not null primary key,
    clinic_id   bigint      not null,
    patient_id  bigint      not null,
    status      flow_status not null default 'OPEN',
    created_at  timestamptz not null
);