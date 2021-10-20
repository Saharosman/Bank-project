
drop table if exists client
drop table if exists employee
drop table if exists account
droop table if exists bank


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
	user_password varchar(100)

);


create table if not exists account(
	aid serial primary key,
	balance money
);

create table if not exists bank(
	bid serial primary key,
	bname varchar(100),
	address text
);
