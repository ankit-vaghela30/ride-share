# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table driver (
  driver_id                     integer auto_increment not null,
  first_name                    varchar(255) not null,
  last_name                     varchar(255) not null,
  gender                        varchar(255) not null,
  driver_license                varchar(255) not null,
  password                      varchar(255) not null,
  email                         varchar(255) not null,
  phone_number                  varchar(255) not null,
  constraint pk_driver primary key (driver_id)
);

create table rating (
  rating_id                     integer auto_increment not null,
  rating                        integer,
  feedback                      varchar(255),
  ride_id_assoc_ride_id         integer not null,
  rider_id_assoc_rider_id       integer not null,
  constraint pk_rating primary key (rating_id)
);

create table ride (
  ride_id                       integer auto_increment not null,
  source                        varchar(255) not null,
  destination                   varchar(255) not null,
  cost                          integer not null,
  start_time                    datetime(6) not null,
  driver_ride_driver_id         integer not null,
  vehicle_vehicle_id            integer not null,
  constraint pk_ride primary key (ride_id)
);

create table rider (
  rider_id                      integer auto_increment not null,
  first_name                    varchar(255) not null,
  last_name                     varchar(255) not null,
  gender                        varchar(255) not null,
  password                      varchar(255) not null,
  email                         varchar(255) not null,
  phone_number                  varchar(255) not null,
  constraint pk_rider primary key (rider_id)
);

create table vehicle (
  vehicle_id                    integer auto_increment not null,
  capacity                      integer not null,
  vehicle_name                  varchar(255) not null,
  vehicle_type                  varchar(255) not null,
  driver_driver_id              integer not null,
  constraint pk_vehicle primary key (vehicle_id)
);

alter table rating add constraint fk_rating_ride_id_assoc_ride_id foreign key (ride_id_assoc_ride_id) references ride (ride_id) on delete restrict on update restrict;
create index ix_rating_ride_id_assoc_ride_id on rating (ride_id_assoc_ride_id);

alter table rating add constraint fk_rating_rider_id_assoc_rider_id foreign key (rider_id_assoc_rider_id) references rider (rider_id) on delete restrict on update restrict;
create index ix_rating_rider_id_assoc_rider_id on rating (rider_id_assoc_rider_id);

alter table ride add constraint fk_ride_driver_ride_driver_id foreign key (driver_ride_driver_id) references driver (driver_id) on delete restrict on update restrict;
create index ix_ride_driver_ride_driver_id on ride (driver_ride_driver_id);

alter table ride add constraint fk_ride_vehicle_vehicle_id foreign key (vehicle_vehicle_id) references vehicle (vehicle_id) on delete restrict on update restrict;
create index ix_ride_vehicle_vehicle_id on ride (vehicle_vehicle_id);

alter table vehicle add constraint fk_vehicle_driver_driver_id foreign key (driver_driver_id) references driver (driver_id) on delete restrict on update restrict;
create index ix_vehicle_driver_driver_id on vehicle (driver_driver_id);


# --- !Downs

alter table rating drop foreign key fk_rating_ride_id_assoc_ride_id;
drop index ix_rating_ride_id_assoc_ride_id on rating;

alter table rating drop foreign key fk_rating_rider_id_assoc_rider_id;
drop index ix_rating_rider_id_assoc_rider_id on rating;

alter table ride drop foreign key fk_ride_driver_ride_driver_id;
drop index ix_ride_driver_ride_driver_id on ride;

alter table ride drop foreign key fk_ride_vehicle_vehicle_id;
drop index ix_ride_vehicle_vehicle_id on ride;

alter table vehicle drop foreign key fk_vehicle_driver_driver_id;
drop index ix_vehicle_driver_driver_id on vehicle;

drop table if exists driver;

drop table if exists rating;

drop table if exists ride;

drop table if exists rider;

drop table if exists vehicle;

