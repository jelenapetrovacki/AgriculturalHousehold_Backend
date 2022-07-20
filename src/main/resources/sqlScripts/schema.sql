CREATE SCHEMA IF NOT EXISTS FarmaSvinja;

DROP TABLE IF EXISTS klijent CASCADE;
DROP TABLE IF EXISTS narudzbina CASCADE;
DROP TABLE IF EXISTS stavka CASCADE;
DROP TABLE IF EXISTS tip_proizvoda CASCADE;
DROP TABLE IF EXISTS faktura CASCADE;
DROP TABLE IF EXISTS svrha CASCADE;
DROP TABLE IF EXISTS uplata CASCADE;
DROP TABLE IF EXISTS nacin_uplate CASCADE;

DROP SEQUENCE IF EXISTS klijent_seq;
DROP SEQUENCE IF EXISTS narudzbina_seq;
DROP SEQUENCE IF EXISTS stavka_seq;
DROP SEQUENCE IF EXISTS tip_proizvoda_seq;
DROP SEQUENCE IF EXISTS faktura_seq;
DROP SEQUENCE IF EXISTS svrha_seq;
DROP SEQUENCE IF EXISTS uplata_seq;
DROP SEQUENCE IF EXISTS nacin_uplate_seq;


create table klijent
(
	id integer not null,
	pib integer not null,
	naziv varchar(20) not null,
	adresa varchar(30) not null,
	kontakt varchar(30) not null,
	mejl varchar(30),
	CONSTRAINT PK_klijent PRIMARY KEY (id)
);

create table narudzbina
(
	id integer not null,
    datum date,
	iznos numeric, --triger
	klijent integer not null,
	CONSTRAINT PK_narudzbina PRIMARY KEY (id),
	CONSTRAINT FK_narudzbina_klijent FOREIGN KEY (klijent) REFERENCES klijent(id)
);

create table svrha
(
	id integer not null,
	opis varchar(30) not null,
	CONSTRAINT PK_svrha PRIMARY KEY (id)
);

create table faktura
(
	id integer not null,
	iznos numeric not null,
	datum_izdavanja DATE not null,
	svrha integer not null,
	narudzbina integer not null,
	CONSTRAINT PK_faktura PRIMARY KEY (id),
	CONSTRAINT FK_faktura_svrha FOREIGN KEY (svrha) REFERENCES svrha(id),
	CONSTRAINT FK_faktura_narudzbina FOREIGN KEY (narudzbina) REFERENCES narudzbina(id)
);


create table nacin_uplate
(
	id integer not null,
	nacin_uplate varchar(15) not null,
	CONSTRAINT PK_nacin_uplate PRIMARY KEY (id)
);

create table uplata
(
	id integer not null,
	datum_uplate date not null,
	faktura integer not null,
	CONSTRAINT PK_uplata PRIMARY KEY (id),
	CONSTRAINT FK_uplata_faktura FOREIGN KEY (faktura) REFERENCES faktura(id)
);

create table tip_proizvoda
(
	id integer not null,
	naziv_tipa varchar(50) not null,
	jedinicna_cena numeric not null,
	aktuelan boolean not null default true,
	CONSTRAINT PK_tip_proizvoda PRIMARY KEY (id)
);

create table stavka
(
	id integer not null,
	kolicina integer not null,
	jedinica_mere varchar(10) not null,
	obracunata_cena numeric not null,
	narudzbina integer not null,
	tip_proizvoda integer not null,
	faktura integer,
	CONSTRAINT PK_stavka PRIMARY KEY (id),
	CONSTRAINT FK_stavka_narudzbina FOREIGN KEY (narudzbina) REFERENCES narudzbina(id),
	CONSTRAINT FK_stavka_tip_proizvoda FOREIGN KEY (tip_proizvoda) REFERENCES tip_proizvoda(id),
	CONSTRAINT FK_stavka_faktura FOREIGN KEY (faktura) REFERENCES faktura(id)
);



CREATE SEQUENCE IF NOT EXISTS  klijent_seq INCREMENT 1 START 1;  
CREATE SEQUENCE IF NOT EXISTS narudzbina_seq INCREMENT 1 START 1;   
CREATE SEQUENCE IF NOT EXISTS tip_proizvoda_seq INCREMENT 1 START 1;   
CREATE SEQUENCE IF NOT EXISTS faktura_seq INCREMENT 1 START 1;   
CREATE SEQUENCE IF NOT EXISTS uplata_seq INCREMENT 1 START 1;   
CREATE SEQUENCE IF NOT EXISTS svrha_seq INCREMENT 1 START 1;   
CREATE SEQUENCE IF NOT EXISTS nacin_uplate_seq INCREMENT 1 START 1;   
CREATE SEQUENCE IF NOT EXISTS stavka_seq INCREMENT 1 START 1;   


ALTER TABLE klijent ALTER COLUMN id SET DEFAULT nextval('klijent_seq');
ALTER TABLE narudzbina ALTER COLUMN id SET DEFAULT nextval('narudzbina_seq');
ALTER TABLE tip_proizvoda ALTER COLUMN id SET DEFAULT nextval('tip_proizvoda_seq');
ALTER TABLE faktura ALTER COLUMN id SET DEFAULT nextval('faktura_seq');
ALTER TABLE uplata ALTER COLUMN id SET DEFAULT nextval('uplata_seq');
ALTER TABLE svrha ALTER COLUMN id SET DEFAULT nextval('svrha_seq');
ALTER TABLE nacin_uplate ALTER COLUMN id SET DEFAULT nextval('nacin_uplate_seq');
ALTER TABLE stavka ALTER COLUMN id SET DEFAULT nextval('stavka_seq');
