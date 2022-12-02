--liquibase formatted sql
--changeset Vlad_Piatnitsa:v.0.02
create type ticket_status as enum('INITIALIZED', 'APPROVED', 'REJECTED');
create type ticket_type as enum ('CONSULTATION', 'PROCEDURE');

create table patient_ticket(
    id                  bigserial       not null primary key,
    created_at          timestamptz     not null,
    description         text            not null,
    appointment_time    timestamptz     not null,
    assigned_doctor_id  bigint          not null,
    status              ticket_status   not null default 'INITIALIZED',
    type                ticket_type     not null,
    flow_id             bigint          not null
                          references tickets_flow(id)
);