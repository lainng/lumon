--liquibase formatted sql
--changeset Vlad_Piatnitsa:v.0.04
alter table doctor_ticket
add flow_id bigint;