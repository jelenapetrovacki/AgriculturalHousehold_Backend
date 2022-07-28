ALTER SEQUENCE klijent_seq RESTART WITH 1;
ALTER SEQUENCE narudzbina_seq RESTART WITH 1;
ALTER SEQUENCE svrha_seq RESTART WITH 1;
ALTER SEQUENCE nacin_uplate_seq RESTART WITH 1;
ALTER SEQUENCE uplata_seq RESTART WITH 1;
ALTER SEQUENCE faktura_seq RESTART WITH 1;
ALTER SEQUENCE stavka_seq RESTART WITH 1;
ALTER SEQUENCE tip_proizvoda_seq RESTART WITH 1;
--klijent
INSERT INTO klijent VALUES(nextval('klijent_seq'),153648236,'Restoran kod Cava','Ivana Milutinovica 4 Vrbas','02345671', 'kodcava@gmail.com');
INSERT INTO klijent VALUES(nextval('klijent_seq'),596545698,'Tiffany restoran','Marsala Tita 34 Vrbas','0234567097', 'tiffany@gmail.com');
INSERT INTO klijent VALUES(nextval('klijent_seq'),458756952,'Jurosevic SV','Marsala Tita 87 Lipar','0324567097', 'jurosevic@gmail.com');

--narudzbina
INSERT INTO narudzbina VALUES(nextval('narudzbina_seq'),CAST('26 JUN 2019'AS DATE), 0, 1);--1
INSERT INTO narudzbina VALUES(nextval('narudzbina_seq'),CAST('29 JUN 2019'AS DATE), 0, 2);--2
INSERT INTO narudzbina VALUES(nextval('narudzbina_seq'),CAST('02 JUL 2019'AS DATE),0,2);--3
INSERT INTO narudzbina VALUES(nextval('narudzbina_seq'),CAST('29 JUL 2019'AS DATE),0,3);--4
INSERT INTO narudzbina VALUES(nextval('narudzbina_seq'),CAST('29 SEP 2019'AS DATE),0,2);--5
INSERT INTO narudzbina VALUES(nextval('narudzbina_seq'),CAST('29 SEP 2019'AS DATE),0,3);--6

--svrha
INSERT INTO svrha VALUES(nextval('svrha_seq'),'Uplata avansa');
INSERT INTO svrha VALUES(nextval('svrha_seq'),'Uplata celog iznosa');
INSERT INTO svrha VALUES(nextval('svrha_seq'),'Uplata rate');
INSERT INTO svrha VALUES(nextval('svrha_seq'),'Uplata depozita');

--faktura
INSERT INTO faktura VALUES(nextval('faktura_seq'),0,CAST('03 JAN 2020' AS DATE),1,1);--1
INSERT INTO faktura VALUES(nextval('faktura_seq'),0,CAST('04 JAN 2020' AS DATE),2,2);--2
INSERT INTO faktura VALUES(nextval('faktura_seq'),0,CAST('05 JAN 2020' AS DATE),3,3);--3
INSERT INTO faktura VALUES(nextval('faktura_seq'),0,CAST('06 JAN 2020' AS DATE),3,4);--4
INSERT INTO faktura VALUES(nextval('faktura_seq'),0,CAST('07 JAN 2020' AS DATE),4,5);--5
INSERT INTO faktura VALUES(nextval('faktura_seq'),0,CAST('07 JAN 2020' AS DATE),4,6);--6

--nacin uplate
INSERT INTO nacin_uplate VALUES(nextval('nacin_uplate_seq'),'Kartica');
INSERT INTO nacin_uplate VALUES(nextval('nacin_uplate_seq'),'Keš');

--uplata
INSERT INTO uplata VALUES(nextval('uplata_seq'),CAST('06 JAN 2020'AS DATE),1,1);
INSERT INTO uplata VALUES(nextval('uplata_seq'),CAST('16 JAN 2020'AS DATE),3,1);
INSERT INTO uplata VALUES(nextval('uplata_seq'),CAST('06 JAN 2020'AS DATE),2,2);
INSERT INTO uplata VALUES(nextval('uplata_seq'),CAST('06 JAN 2020'AS DATE),4,2);

--tip proizvoda
INSERT INTO tip_proizvoda VALUES(nextval('tip_proizvoda_seq'),'Prase',6000, true);
INSERT INTO tip_proizvoda VALUES(nextval('tip_proizvoda_seq'),'Pečeno prase',9000, true);
INSERT INTO tip_proizvoda VALUES(nextval('tip_proizvoda_seq'),'Paket suhomesnatih proizvoda',5000, true);
INSERT INTO tip_proizvoda VALUES(nextval('tip_proizvoda_seq'),'Slanina',1000, true);
INSERT INTO tip_proizvoda VALUES(nextval('tip_proizvoda_seq'),'Kobasica',1000, true);
INSERT INTO tip_proizvoda VALUES(nextval('tip_proizvoda_seq'),'Kulen',1500, true);
INSERT INTO tip_proizvoda VALUES(nextval('tip_proizvoda_seq'),'Svinjski but',800, true);
INSERT INTO tip_proizvoda VALUES(nextval('tip_proizvoda_seq'),'Dimljeni čvarci',1000, true);
INSERT INTO tip_proizvoda VALUES(nextval('tip_proizvoda_seq'),'Svinjska mast',300, true);
INSERT INTO tip_proizvoda VALUES(nextval('tip_proizvoda_seq'),'Nazimica',40000, true);
INSERT INTO tip_proizvoda VALUES(nextval('tip_proizvoda_seq'),'Nerast',60000, true);
INSERT INTO tip_proizvoda VALUES(nextval('tip_proizvoda_seq'),'Tovljenik',25000, true);
--stavka
INSERT INTO stavka VALUES(nextval('stavka_seq'),18, 'kg',0,1,1,null);
INSERT INTO stavka VALUES(nextval('stavka_seq'),5, 'kg',0,1,2,1);
INSERT INTO stavka VALUES(nextval('stavka_seq'),7, 'kg',0,1,3,1);

INSERT INTO stavka VALUES(nextval('stavka_seq'),5, 'kg',0,2,4,2);

INSERT INTO stavka VALUES(nextval('stavka_seq'),14, 'kg',0,3,5,3);

INSERT INTO stavka VALUES(nextval('stavka_seq'),13, 'kg',0,4,6,4);
INSERT INTO stavka VALUES(nextval('stavka_seq'),13, 'kg',0,4,7,4);

INSERT INTO stavka VALUES(nextval('stavka_seq'),22, 'kg',0,5,8,5);

INSERT INTO stavka VALUES(nextval('stavka_seq'),10, 'kg',0,6,9,6);
