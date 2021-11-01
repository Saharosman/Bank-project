drop table if exists client cascade
drop table if exists employee
drop table if exists account cascade
drop table if exists bank
drop table if exists client_account_Relation
drop table if exists transactions


create table if not exists client(
	cid serial primary key,
	fname varchar(50),
	lname varchar(50),
	user_name varchar(100),
	user_password varchar(100),
	dob DATE,
	ssn varchar(50),
	address text
);


create table if not exists employee(
	eid serial primary key,
	fname varchar(50),
	lname varchar(50),
	user_name varchar(100),
	user_password varchar(100),
	aid serial REFERENCES account(aid)
);


create table if not exists account(
	aid serial primary key,
	balance money,
	accountType text
);

create table if not exists client_account_Relation(
	cid serial,
	aid serial,
	FOREIGN key(cid) REFERENCES client(cid),
	FOREIGN key(aid) REFERENCES account(aid)
);

create table if not exists transactions(
	tid serial primary key,
	balance money,
	amount money,
	description text,
	aid serial,
	foreign key(aid) references account(aid)
);

create table if not exists bank(
	bid serial primary key,
	bname varchar(100),
	address text
);