# c:\xampp\mysql\bin\mysql -uroot --default_character_set=utf8 < D:\GitHub\SQL_Vjezba\Postolar.sql

drop database if exists postolar;
create database postolar;
use postolar;

create table postolar(
    sifra int not null primary key auto_increment,
    osoba int not null,
    iban varchar(30),
    naziv_obrta varchar(30)
);

create table popravak(
    sifra int not null primary key auto_increment,
    vrsta_popravka varchar(30),
    postolar int,
    segrt int,
    obuca int,
    cijena decimal(6,2)
);

create table obuca(
    sifra int not null primary key auto_increment,
    naziv varchar(40),
    boja varchar(20),
    starost int,
    korisnik int
);

create table korisnik(
    sifra int not null primary key auto_increment,
    osoba int
);

create table segrt(
    sifra int not null primary key auto_increment,
    osoba int not null,
    datum_pocetka_rada date,
    broj_ugovora varchar(20)
);

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(20),
    prezime varchar(20),
    oib char(11)
);

alter table postolar add foreign key (osoba) references osoba(sifra);
alter table popravak add foreign key (postolar) references postolar(sifra);
alter table popravak add foreign key (segrt) references segrt(sifra);
alter table popravak add foreign key (obuca) references obuca(sifra);
alter table obuca add foreign key (korisnik) references korisnik(sifra);
alter table korisnik add foreign key (osoba) references osoba(sifra);
alter table segrt add foreign key (osoba) references osoba(sifra);


