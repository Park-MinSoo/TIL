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
 values ('�ڹμ�',sysdate,'������ �����!');
 insert into visitor (name,writedate,memo)
 values ('������',to_date('171225','rrmmdd'),'������ �뷡����!');
 insert into visitor (name,writedate,memo)
 values ('�ں���',to_date('990811','rrmmdd'),'�� ���ִ�!');
commit;
Desc visitor;

 -- to_date('171225','rrmmdd')
  -- to_date('990811','rrmmdd')
 -- ���ϰ� ���� Ŀ���Ҳ� 

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