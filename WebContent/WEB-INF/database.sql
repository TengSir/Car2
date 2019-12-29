
/* Drop Tables */

create database Cars charset=utf8;

use Cars;

DROP TABLE CAR;




/* Create Tables */

CREATE TABLE CAR
(
	CARID INT NOT NULL AUTO_INCREMENT,
	PINPAIMING VARCHAR(20),
	XIELIE VARCHAR(20),
	GONGLISHU INT,
	YANSE VARCHAR(20),
	SHOUJIA INT,
	PRIMARY KEY (CARID)
);



