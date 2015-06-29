CREATE TABLE academic_year (
  id                 INTEGER                     NOT NULL,
  active             BOOLEAN                     NOT NULL,
  end_year           INTEGER                     NOT NULL,
  monitoring_end     TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  monitoring_start   TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  payment_period     BOOLEAN                     NOT NULL,
  registration_end   TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  registration_start TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  remark             CHARACTER VARYING(255)      NOT NULL,
  start_year         INTEGER                     NOT NULL
);

CREATE TABLE address_status (
  id       CHARACTER VARYING(255) NOT NULL,
  name     CHARACTER VARYING(255) NOT NULL,
  name_eng CHARACTER VARYING(255) NOT NULL
);


CREATE TABLE discipline (
  id       CHARACTER VARYING(255) NOT NULL,
  name     CHARACTER VARYING(255) NOT NULL,
  name_eng CHARACTER VARYING(255) NOT NULL
);


CREATE TABLE education_level (
  id       CHARACTER VARYING(255) NOT NULL,
  name     CHARACTER VARYING(255) NOT NULL,
  name_eng CHARACTER VARYING(255) NOT NULL
);


CREATE TABLE fund_source (
  id       CHARACTER VARYING(255) NOT NULL,
  name     CHARACTER VARYING(255) NOT NULL,
  name_eng CHARACTER VARYING(255) NOT NULL
);


CREATE SEQUENCE hibernate_sequence
START WITH 1
INCREMENT BY 1
NO MINVALUE
NO MAXVALUE
CACHE 1;

CREATE TABLE income_range (
  id          CHARACTER VARYING(255) NOT NULL,
  description CHARACTER VARYING(255) NOT NULL,
  start       INTEGER                NOT NULL,
  util        INTEGER                NOT NULL
);

CREATE TABLE institution (
  id       CHARACTER VARYING(255) NOT NULL,
  active   BOOLEAN                NOT NULL,
  address  CHARACTER VARYING(255) NOT NULL,
  name     CHARACTER VARYING(255) NOT NULL,
  name_eng CHARACTER VARYING(255) NOT NULL,
  website  CHARACTER VARYING(255) NOT NULL,
  province CHARACTER VARYING(255) NOT NULL
);


CREATE TABLE occupation (
  id       CHARACTER VARYING(255) NOT NULL,
  name     CHARACTER VARYING(255) NOT NULL,
  name_eng CHARACTER VARYING(255) NOT NULL
);


CREATE TABLE province (
  id   CHARACTER VARYING(255) NOT NULL,
  name CHARACTER VARYING(255) NOT NULL
);

CREATE TABLE property (
  id    CHARACTER VARYING(255) NOT NULL,
  value CHARACTER VARYING(255) NOT NULL,
  type  CHARACTER VARYING(255) NOT NULL
);


CREATE TABLE student (
  username                 CHARACTER VARYING(255)      NOT NULL,
  activities               CHARACTER VARYING(2200)     NOT NULL,
  address                  CHARACTER VARYING(1500)     NOT NULL,
  alternative_phone_number CHARACTER VARYING(550),
  bank_account_name        CHARACTER VARYING(255),
  bank_account_number      CHARACTER VARYING(255),
  bank_name                CHARACTER VARYING(255),
  birth_date               TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  birth_place              CHARACTER VARYING(255)      NOT NULL,
  both_parent_working      BOOLEAN                     NOT NULL,
  city                     CHARACTER VARYING(255)      NOT NULL,
  dependent_of_parent      INTEGER                     NOT NULL,
  email                    CHARACTER VARYING(255)      NOT NULL,
  faculty                  CHARACTER VARYING(255)      NOT NULL,
  gender                   INTEGER                     NOT NULL,
  gpa                      DOUBLE PRECISION            NOT NULL,
  graduation_target        TIMESTAMP WITHOUT TIME ZONE,
  major                    CHARACTER VARYING(255)      NOT NULL,
  name                     CHARACTER VARYING(255)      NOT NULL,
  occupation               CHARACTER VARYING(255)      NOT NULL,
  parent_address           CHARACTER VARYING(2500)     NOT NULL,
  phone                    CHARACTER VARYING(255)      NOT NULL,
  post_code                CHARACTER VARYING(255)      NOT NULL,
  school_entry_year        INTEGER                     NOT NULL,
  status                   INTEGER                     NOT NULL,
  student_id_number        CHARACTER VARYING(255)      NOT NULL,
  toefl_score              INTEGER                     NOT NULL,
  vdms_entry_year          INTEGER                     NOT NULL,
  address_status           CHARACTER VARYING(255)      NOT NULL,
  discipline               CHARACTER VARYING(255)      NOT NULL,
  high_school_province     CHARACTER VARYING(255)      NOT NULL,
  income_range             CHARACTER VARYING(255)      NOT NULL,
  institution              CHARACTER VARYING(255)      NOT NULL,
  level                    CHARACTER VARYING(255)      NOT NULL,
  parent_education_level   CHARACTER VARYING(255)      NOT NULL,
  parent_income_range      CHARACTER VARYING(255)      NOT NULL,
  parent_occupation        CHARACTER VARYING(1200)     NOT NULL,
  source_of_fund           CHARACTER VARYING(255)      NOT NULL,
  working_status           CHARACTER VARYING(255)      NOT NULL
);


CREATE TABLE working_status (
  id       CHARACTER VARYING(255) NOT NULL,
  name     CHARACTER VARYING(255) NOT NULL,
  name_eng CHARACTER VARYING(255) NOT NULL
);

CREATE TABLE admin (
  email    CHARACTER VARYING(255) NOT NULL,
  enabled  BOOLEAN                NOT NULL,
  name     CHARACTER VARYING(255) NOT NULL,
  password CHARACTER VARYING(255) NOT NULL,
  roles    CHARACTER VARYING(255) NOT NULL
);

ALTER TABLE ONLY admin
ADD CONSTRAINT admin_pkey PRIMARY KEY (email);

ALTER TABLE ONLY academic_year
ADD CONSTRAINT academic_year_pkey PRIMARY KEY (id);


ALTER TABLE ONLY address_status
ADD CONSTRAINT address_status_pkey PRIMARY KEY (id);


ALTER TABLE ONLY discipline
ADD CONSTRAINT discipline_pkey PRIMARY KEY (id);


ALTER TABLE ONLY education_level
ADD CONSTRAINT education_level_pkey PRIMARY KEY (id);


ALTER TABLE ONLY fund_source
ADD CONSTRAINT fund_source_pkey PRIMARY KEY (id);


ALTER TABLE ONLY income_range
ADD CONSTRAINT income_range_pkey PRIMARY KEY (id);


ALTER TABLE ONLY institution
ADD CONSTRAINT institution_pkey PRIMARY KEY (id);


ALTER TABLE ONLY occupation
ADD CONSTRAINT occupation_pkey PRIMARY KEY (id);


ALTER TABLE ONLY province
ADD CONSTRAINT province_pkey PRIMARY KEY (id);


ALTER TABLE ONLY property
ADD CONSTRAINT property_pkey PRIMARY KEY (id);


ALTER TABLE ONLY student
ADD CONSTRAINT student_pkey PRIMARY KEY (username);


ALTER TABLE ONLY student
ADD CONSTRAINT uk_fe0i52si7ybu0wjedj6motiim UNIQUE (email);


ALTER TABLE ONLY working_status
ADD CONSTRAINT working_status_pkey PRIMARY KEY (id);


ALTER TABLE ONLY student
ADD CONSTRAINT fk_2poqbpwcxhtw8tmtl1tatu0mo FOREIGN KEY (level) REFERENCES education_level (id);


ALTER TABLE ONLY student
ADD CONSTRAINT fk_4fw0cet60o52dyu17450dybqx FOREIGN KEY (income_range) REFERENCES income_range (id);


ALTER TABLE ONLY institution
ADD CONSTRAINT fk_5cl187ceg0u2gswbepqwh9wrs FOREIGN KEY (province) REFERENCES province (id);


ALTER TABLE ONLY student
ADD CONSTRAINT fk_5opjsal4t68cypvkifx6y5bhb FOREIGN KEY (address_status) REFERENCES address_status (id);


ALTER TABLE ONLY student
ADD CONSTRAINT fk_alwno1lud2dqyj1web47040ix FOREIGN KEY (working_status) REFERENCES working_status (id);


ALTER TABLE ONLY student
ADD CONSTRAINT fk_cxv31xvicrdgpw3vuvlus03pw FOREIGN KEY (high_school_province) REFERENCES province (id);


ALTER TABLE ONLY student
ADD CONSTRAINT fk_gtmqyt7ho2bkoqmot4g653qx4 FOREIGN KEY (parent_income_range) REFERENCES income_range (id);


ALTER TABLE ONLY student
ADD CONSTRAINT fk_gwei8l0s6ejsjmyo1cvxkcncl FOREIGN KEY (source_of_fund) REFERENCES fund_source (id);


ALTER TABLE ONLY student
ADD CONSTRAINT fk_iexta0f825336l2jst89uupvp FOREIGN KEY (institution) REFERENCES institution (id);


ALTER TABLE ONLY student
ADD CONSTRAINT fk_inoj5nkdkgxm9a6o4tecxtl87 FOREIGN KEY (discipline) REFERENCES discipline (id);


ALTER TABLE ONLY student
ADD CONSTRAINT fk_l4wy96rui8d4rxqifwp3bm970 FOREIGN KEY (parent_occupation) REFERENCES occupation (id);


ALTER TABLE ONLY student
ADD CONSTRAINT fk_pai1up3mexgl5ujxb8s1jkbpd FOREIGN KEY (parent_education_level) REFERENCES education_level (id);

