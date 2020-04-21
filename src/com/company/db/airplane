CREATE TABLE cities (
  id   serial  PRIMARY KEY,
  name VARCHAR (50) not null,
   created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
   updated_at TIMESTAMP
);

INSERT INTO cities (name,updated_at) VALUES   ('Москва',NULL);
INSERT INTO cities (name,updated_at) VALUES   ('Лондон',NULL);
INSERT INTO cities (name,updated_at) VALUES   ('Берлин',NULL);


CREATE TABLE  airplanes (
  id   serial  PRIMARY KEY,
  model VARCHAR (50) not null,
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at TIMESTAMP
);

INSERT INTO airplanes (model,updated_at) VALUES   ('Boeing',NULL);
INSERT INTO airplanes (model,updated_at) VALUES   ('СУ-100',NULL);



CREATE TABLE flight (
   id serial primary key,
   day date not null,
   date_time time not null,
   citi_from_id SMALLINT REFERENCES cities (Id),
   citi_to_id SMALLINT references cities(id),
   airplane_id smallint references airplanes(id),
   created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
   updated_at TIMESTAMP
);

INSERT INTO flight (day,date_time,citi_from_id,citi_to_id,airplane_id ,updated_at) VALUES   ('2020/2/25','20:00:00',1,2,1,NULL);
INSERT INTO flight (day,date_time,citi_from_id,citi_to_id,airplane_id ,updated_at) VALUES   ('2020/2/25','20:30:00',1,1,2,NULL);
select * from flight f
   join cities c on f.citi_to_id=c.id
   join airplanes a on f.airplane_id=a.id
