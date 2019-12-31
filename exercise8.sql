select user from dual;
rollback;
select * from visitor;
--1.
create table JDBCTEST.visitor(
    name    VARCHAR2(18)
    ,writedate  Date
    ,memo   VARCHAR2(180)
    );
 insert into visitor (name,writedate,memo)
 values ('박민수',sysdate,'열심히 배우자!');
 insert into visitor (name,writedate,memo)
 values ('차은우',to_date('171225','rrmmdd'),'열심히 노래하자!');
 insert into visitor (name,writedate,memo)
 values ('박보검',to_date('990811','rrmmdd'),'밥 맛있다!');
commit;
Desc visitor;

 -- to_date('171225','rrmmdd')
  -- to_date('990811','rrmmdd')
 -- 다하고 나서 커밋할껏 

--2.
create table JDBCTEST.member(
    m_id    VARCHAR2(12) PRIMARY KEY
    ,m_pwd  VARCHAR2(12) Not null
    ,name   VARCHAR2(18) Not null
    ,joindate   Date Default sysdate
    );
    commit;
Desc member;

--3.
create table JDBCTEST.news(
    id   number(8)
    ,writer  VARCHAR2(18)
    ,title   VARCHAR2(120)
    ,content   VARCHAR2(900)
    ,writedate date
    ,cnt number(8)
    );
    commit;
Desc news;

--4.
create table JDBCTEST.meeting(
    id   number(8) PRIMARY key
    ,name  VARCHAR2(18)
    ,title   VARCHAR2(120)
    ,meetingdate date
    );
    commit;
Desc meeting;
--5.
create table JDBCTEST.imgtest(
    name  VARCHAR2(18) PRIMARY key
    ,imgcontent blob
    );
    commit;
Desc imgtest;