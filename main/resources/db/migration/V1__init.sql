CREATE TABLE IF NOT EXISTS  doctor (
  id serial,
  name VARCHAR(45) NULL,
  lastname VARCHAR(45) NOT NULL,

  PRIMARY KEY (id),
  UNIQUE  (name)
  );

CREATE TABLE IF NOT EXISTS  patient (
  id serial,
  name VARCHAR(45) NULL,
  lastname VARCHAR(45) NOT NULL,

  PRIMARY KEY (id)

  );


