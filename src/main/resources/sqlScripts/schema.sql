
drop trigger IF EXISTS obracunCene on stavka;
drop trigger IF EXISTS ukupanIznos on stavka;

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
	pib varchar not null check(length(pib)=9),
	naziv varchar(20) not null,
	adresa varchar(30) not null,
	kontakt varchar(30) not null unique,
	mejl varchar(30) unique,
	CONSTRAINT PK_klijent PRIMARY KEY (id)
);

create table narudzbina
(
	id integer not null,
    datum date,
	iznos numeric,
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
	svrha integer null,
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
	nacin_uplate integer,
	CONSTRAINT PK_uplata PRIMARY KEY (id),
	CONSTRAINT FK_uplata_nacin_uplate FOREIGN KEY (nacin_uplate) REFERENCES nacin_uplate(id),
	CONSTRAINT FK_uplata_faktura FOREIGN KEY (faktura) REFERENCES faktura(id) ON DELETE CASCADE
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
	CONSTRAINT FK_stavka_faktura FOREIGN KEY (faktura) REFERENCES faktura(id) ON DELETE SET NULL
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

CREATE OR REPLACE FUNCTION obracunCene() RETURNS trigger AS 'BEGIN new.obracunata_cena:=new.kolicina * (select jedinicna_cena from tip_proizvoda where id=new.tip_proizvoda); RETURN NEW; END'  LANGUAGE PLPGSQL;


CREATE TRIGGER obracunCene BEFORE insert OR update ON stavka for each row EXECUTE PROCEDURE obracunCene();

CREATE OR REPLACE FUNCTION ukupanIznos() RETURNS trigger AS 'BEGIN IF (new.faktura is not null) THEN UPDATE narudzbina SET iznos = (select sum(obracunata_cena) from stavka where narudzbina=new.narudzbina) WHERE id=new.narudzbina; UPDATE faktura SET iznos = (select sum(obracunata_cena) from stavka where faktura=new.faktura) WHERE id=new.faktura; IF NOT FOUND THEN RETURN NULL; END IF; RETURN NEW; ELSIF (new.faktura is null) THEN UPDATE narudzbina SET iznos = (select sum(obracunata_cena) from stavka where narudzbina=new.narudzbina) WHERE id=new.narudzbina; RETURN NEW; END IF; RETURN NEW; END' LANGUAGE PLPGSQL;

CREATE TRIGGER ukupanIznos AFTER insert OR update OR delete ON stavka for each row EXECUTE PROCEDURE ukupanIznos();
