create table member_bean(
	id varchar(20) primary key,
	pw varchar(20),
	name varchar(20),
	regDate varchar(20),
	gender varchar(20),
	ssn varchar(20),
	profile_img varchar2(100),
	email varchar2(30),
	age int
	
);
select count(*) from member_bean;
select * from member_bean;
where id = 'you';

insert into member_bean values('hong','1234','홍길동','2016-07-01','남성','881010-1','28');
insert into member_bean values('kim','1234','홍길동','2015-07-01','남성','900910-1','26');
insert into member_bean values('you','1234','홍길동','2015-07-01','남성','010910-1','15');

drop table member_bean;
update member_bean set pw = '999' ,name='오공' where id = 'goku';

delete from member_bean where id = 'you';

delete from member_bean where id ='chean' and pw='123';

update member_bean set profile_img = id||'.jpg' where id = 'hong'


update member_bean set email = id || '@test.com';
update member_bean set email = id || '@test.com' where id = 'hong';
alter table member_bean add email varchar2(30);
alter table member_bean add profile_img varchar2(100);

