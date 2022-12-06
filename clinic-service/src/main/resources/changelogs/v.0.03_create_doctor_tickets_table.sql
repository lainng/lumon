--liquibase formatted sql
--changeset Vlad_Piatnitsa:v.0.03
create table doctor_ticket(
    id                  bigserial   not null primary key ,
    assigning_doctor_id bigint      not null ,
    assigned_doctor_id  bigint      not null ,
    department_id       bigint      not null ,
    created_at          timestamptz not null ,
    appointment_time    timestamptz not null ,
    description         text,
    type                ticket_type not null ,
    status              ticket_status default 'INITIALIZED'
);