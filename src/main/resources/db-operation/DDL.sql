CREATE TABLE department
(
  id bigint NOT NULL,
  name character varying(1024),
  CONSTRAINT department_pkey PRIMARY KEY (id)
);

CREATE TABLE employee
(
  id bigint NOT NULL,
  fname character varying(255),
  lname character varying(255),
  gender character varying(255),
  date_created timestamp without time zone NOT NULL,
  dept_id bigint NOT NULL,
  CONSTRAINT employee_pkey PRIMARY KEY (id),
  CONSTRAINT fk_vfjofllbhhf65yupl4fj8fmk FOREIGN KEY (dept_id)
      REFERENCES department (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);