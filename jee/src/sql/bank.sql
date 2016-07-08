---------[내부 스키마]----------
create table account(
	account_no int primary key,
	money int,
	id varchar2(20)
);

select * from account;

drop table account;

insert into account values('654321','0','ujn' );
delete from account where id = 'ujn';
create view account_member as
select 	
	b.account_no as account_no,
	b.money as money,
	m.id as id,
	m.pw as pw,
	m.name as name,
	m.regDate as regDate,
	m.ssn as ssn
	from member_bean m,account b 
	where m.id = b.id;

select * from account_member;

----------[외부 스키마: 논리적]------------
create view account_member as
select 
	a.account_no as account_no,
	a.money as money,
	m.id as id,
	m.pw as pw,
	m.name as name,
	m.regDate as regDate,
	m.ssn as ssn
	from member_bean m, account a 
	where m.id = a.id;
