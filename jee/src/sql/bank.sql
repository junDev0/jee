create table account(
	account_no int primary key,
	name varchar2(20),
	money int,
	pw varchar2(20),
	id varchar2(20)
);

select * from account;

drop table account;

insert into account values('1234213','홍길동','1000','123','hong' );
