create sequence seq
increment by 1
start with 1000
nocycle;

drop table grade;

create table grade(
	seq number constraint grade_pk primary key,
	grade varchar2(1),
	java number,
	sql number,
	html number,
	javascript number,
	id varchar2(20),
	constraint grade_member_fk foreign key (id)
	references member_bean(id) on delete cascade
);
alter table grade add exam_date varchar2(10);

--create
insert into grade(
	seq,grade,java,sql,html,javascript,id,exam_date
)values(
	seq.nextval,'C',70,75,70,72,'hong','2016-06'
);

--read : list
select * from GRADE;
--read : findByPK
select * from grade where seq = '1000';
--read : findByID
select * from grade where id = 'hong';
--read : count
select count(*) from GRADE;
-- update : update
update GRADE set exam_date = '2016-05' where seq = 1000;
--delete : delete
delete from grade where seq = '1004';

--- 물리 스키마---
-------------------------------------------------

-- 뷰 권한주기
sqlplus system/hanbit;
grant dba to jundev;



create view grade_view as select * from grade;
select * from GRADE_VIEW;

-- join 조인
create view grade_member as
select 	
	seq as seq,
	g.grade as grade,
	g.java as java,
	g.sql as sql,
	g.html as html,
	g.javascript as js,
	g.exam_date as exam_date,
	m.id as id,
	m.pw as pw,
	m.name as name,
	m.regDate as regDate,
	m.ssn as ssn
	from member_bean m,grade g 
	where m.id = g.id;

	select * from grade_member;

select 
	id,
	name,
	grade,
	java,
	sql,
	html,
	js
from grade_member;



--- 가상 스키마 ---
