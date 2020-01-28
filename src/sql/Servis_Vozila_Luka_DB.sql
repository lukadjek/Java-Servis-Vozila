CREATE DATABASE IF NOT EXISTS Servis_Vozila
	DEFAULT CHARACTER SET utf8mb4 
    COLLATE utf8mb4_croatian_ci;

USE Servis_Vozila; 

CREATE TABLE Marka_AUDI(					
Model varchar(15) not null
) ENGINE=InnoDB;

INSERT INTO Marka_AUDI VALUES
	('A1'),
	('A2'),
    ('A3'),
    ('A4'),
    ('A5'),
	('A6'),
    ('A7'),
    ('A8'),
    ('Q2'),
	('Q3'),
    ('Q4'),
    ('Q5'),
    ('Q7'),
    ('Q8'),
    ('S2'),
    ('S3'),
    ('S4'),
    ('S5'),
    ('S6'),
    ('S7'),
    ('S8'),
	('RS2'),
    ('RS3'),
	('RS4'),
    ('RS6'),
    ('RS7'),
    ('TT'),
    ('TTS'),
	('TTRS'),
    ('R8');
    
    
CREATE TABLE Marka_VW(					
Model varchar(15) not null
) ENGINE=InnoDB;

INSERT INTO Marka_VW VALUES
	('Amarok'),
	('Arteon'),
    ('Caddy'),
    ('CC'),
    ('Eos'),
	('Golf'),
    ('Jetta'),
    ('Passat'),
    ('Passat cc'),
	('Polo'),
    ('Scirocco'),
    ('Sharan'),
    ('T-Cross'),
    ('Touaran'),
    ('Tiguan'),
    ('Touareg');

CREATE TABLE `Vozila` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MarkaVozila` varchar(15) NOT NULL,
  `ModelVozila` varchar(15)  NOT NULL,
  `Vreme` varchar(15)  NOT NULL,
  `Datum` date NOT NULL,
  `Kilometraza` int(11) NOT NULL,
  `BrojSasije` varchar(15) NOT NULL,
  `RegistarskaOznaka` varchar(15) NOT NULL,
  `RedovneServisneUsluge` varchar(40) NOT NULL,
  `DodatneServisneUsluge` varchar(500) DEFAULT NULL,
  `Napomene` varchar(160) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB;

drop table vozila;
    
