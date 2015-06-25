CREATE TABLE academic_year (
    id integer NOT NULL,
    active boolean NOT NULL,
    end_year integer NOT NULL,
    monitoring_end timestamp without time zone NOT NULL,
    monitoring_start timestamp without time zone NOT NULL,
    payment_period boolean NOT NULL,
    registration_end timestamp without time zone NOT NULL,
    registration_start timestamp without time zone NOT NULL,
    remark character varying(255) NOT NULL,
    start_year integer NOT NULL
);

CREATE TABLE address_status (
    id character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    name_eng character varying(255) NOT NULL
);


CREATE TABLE discipline (
    id character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    name_eng character varying(255) NOT NULL
);


CREATE TABLE education_level (
    id character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    name_eng character varying(255) NOT NULL
);


CREATE TABLE fund_source (
    id character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    name_eng character varying(255) NOT NULL
);


CREATE SEQUENCE hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE income_range (
    id character varying(255) NOT NULL,
    description character varying(255) NOT NULL,
    start integer NOT NULL,
    util integer NOT NULL
);

CREATE TABLE institution (
    id character varying(255) NOT NULL,
    active boolean NOT NULL,
    address character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    name_eng character varying(255) NOT NULL,
    website character varying(255) NOT NULL,
    province character varying(255) NOT NULL
);


CREATE TABLE occupation (
    id character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    name_eng character varying(255) NOT NULL
);


CREATE TABLE province (
    id character varying(255) NOT NULL,
    name character varying(255) NOT NULL
);


CREATE TABLE student (
    username character varying(255) NOT NULL,
    activities character varying(255) NOT NULL,
    address character varying(255) NOT NULL,
    alternative_phone_number character varying(255),
    bank_account_name character varying(255),
    bank_account_number character varying(255),
    bank_name character varying(255),
    birth_date timestamp without time zone NOT NULL,
    birth_place character varying(255) NOT NULL,
    both_parent_working boolean NOT NULL,
    city character varying(255) NOT NULL,
    dependent_of_parent integer NOT NULL,
    email character varying(255) NOT NULL,
    faculty character varying(255) NOT NULL,
    gender integer NOT NULL,
    gpa double precision NOT NULL,
    graduation_target timestamp without time zone,
    major character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    occupation character varying(255) NOT NULL,
    parent_address character varying(255) NOT NULL,
    phone character varying(255) NOT NULL,
    post_code character varying(255) NOT NULL,
    school_entry_year integer NOT NULL,
    status integer NOT NULL,
    student_id_number character varying(255) NOT NULL,
    toefl_score integer NOT NULL,
    vdms_entry_year integer NOT NULL,
    address_status character varying(255) NOT NULL,
    discipline character varying(255) NOT NULL,
    high_school_province character varying(255) NOT NULL,
    income_range character varying(255) NOT NULL,
    institution character varying(255) NOT NULL,
    level character varying(255) NOT NULL,
    parent_education_level character varying(255) NOT NULL,
    parent_income_range character varying(255) NOT NULL,
    parent_occupation character varying(255) NOT NULL,
    source_of_fund character varying(255) NOT NULL,
    working_status character varying(255) NOT NULL
);


CREATE TABLE working_status (
    id character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    name_eng character varying(255) NOT NULL
);


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


ALTER TABLE ONLY student
    ADD CONSTRAINT student_pkey PRIMARY KEY (username);


ALTER TABLE ONLY student
    ADD CONSTRAINT uk_fe0i52si7ybu0wjedj6motiim UNIQUE (email);


ALTER TABLE ONLY working_status
    ADD CONSTRAINT working_status_pkey PRIMARY KEY (id);


ALTER TABLE ONLY student
    ADD CONSTRAINT fk_2poqbpwcxhtw8tmtl1tatu0mo FOREIGN KEY (level) REFERENCES education_level(id);


ALTER TABLE ONLY student
    ADD CONSTRAINT fk_4fw0cet60o52dyu17450dybqx FOREIGN KEY (income_range) REFERENCES income_range(id);


ALTER TABLE ONLY institution
    ADD CONSTRAINT fk_5cl187ceg0u2gswbepqwh9wrs FOREIGN KEY (province) REFERENCES province(id);


ALTER TABLE ONLY student
    ADD CONSTRAINT fk_5opjsal4t68cypvkifx6y5bhb FOREIGN KEY (address_status) REFERENCES address_status(id);


ALTER TABLE ONLY student
    ADD CONSTRAINT fk_alwno1lud2dqyj1web47040ix FOREIGN KEY (working_status) REFERENCES working_status(id);


ALTER TABLE ONLY student
    ADD CONSTRAINT fk_cxv31xvicrdgpw3vuvlus03pw FOREIGN KEY (high_school_province) REFERENCES province(id);


ALTER TABLE ONLY student
    ADD CONSTRAINT fk_gtmqyt7ho2bkoqmot4g653qx4 FOREIGN KEY (parent_income_range) REFERENCES income_range(id);


ALTER TABLE ONLY student
    ADD CONSTRAINT fk_gwei8l0s6ejsjmyo1cvxkcncl FOREIGN KEY (source_of_fund) REFERENCES fund_source(id);


ALTER TABLE ONLY student
    ADD CONSTRAINT fk_iexta0f825336l2jst89uupvp FOREIGN KEY (institution) REFERENCES institution(id);


ALTER TABLE ONLY student
    ADD CONSTRAINT fk_inoj5nkdkgxm9a6o4tecxtl87 FOREIGN KEY (discipline) REFERENCES discipline(id);


ALTER TABLE ONLY student
    ADD CONSTRAINT fk_l4wy96rui8d4rxqifwp3bm970 FOREIGN KEY (parent_occupation) REFERENCES occupation(id);


ALTER TABLE ONLY student
    ADD CONSTRAINT fk_pai1up3mexgl5ujxb8s1jkbpd FOREIGN KEY (parent_education_level) REFERENCES education_level(id);

