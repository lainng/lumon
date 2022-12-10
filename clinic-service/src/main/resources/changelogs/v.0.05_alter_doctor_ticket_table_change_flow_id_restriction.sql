--liquibase formatted sql
--changeset Vlad_Piatnitsa:v.0.05
alter table doctor_ticket
alter column flow_id set not null;
