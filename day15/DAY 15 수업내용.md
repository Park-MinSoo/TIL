# [ DAY 15 ]



- I18N : 국제화를 적용한 서비스라는 의미이다.

- 랜더링 : 2차원, 3차원 데이터를 사람이 인지 가능한 형상으로 변환하는 것.

- 크롤링 : 웹을 돌아다니며 유용한 정보를 찾아 특정 데이터베이스로 수집해 오는 작업이나 기술.

- 스크래핑 : 끌어와서 파싱하여 원하는 부분을 나타내는 것.



## [ 앞으로의 학습 계획 ]

Java 구문 - SQL - JDBC - HTML5 - CSS3 - JavaScript(jQuery) - Ajax

Servlet - JSP - Spring  - Mybatis - D3.js(웹 기반 시각화) - 1day 게시판 프로젝트 - 미니프로젝트(8일 전후)

리눅스(CentOs7) - Hadoop 2.x.x(설치, 설정, HDFS, MapReduce) - Hive - Spark

R(구문, 데이터 수집(웹크롤링, 공공DB, SNS Open API), 통계분석, 데이터 마이닝, 텍스트 마이닝, 시각화)  - Java와 R 연동

팀프로젝트(1달) : 빅데이터를 가지고 분석하여 웹으로 서비스하는 모델



## [ Oracle 설치 ]

DQL -----> DML -----> DDL

CRUD

Create : INSERT 명령어

Read : SELECT 명령어(DQL)

Update : UPDATE 명령어

Delete : DELETE 명령어



관리자계정(system) 암호 : manager

서버와 클라이언트

​			-----------------

​			(1) cmd 창에 나가서 sqlpus 라는 명령을 수행시킨다.

​			(2) sqldeveloper 라는 추가프로그램을 설치하여 사용

학습용 일반 계정 : scott(생성), hr(락해제)



   - (1) sqlplus 라는 명령으로 오라클 사용하기 
     cmd 창을 기동시킨다.
     sqlplus 
     [ scott 계정 생성 ]
     SQL> @C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\scott.sql
     SQL> alter user scott identified by tiger;

     SQL> select user from dual;	// scott 이라고 출력됨

     SQL> select * from tab;	// scott 계정이 보유하고 있는 테이블 리스트

     SQL> connect system/manager

     

- [ hr 계정 락(lock) 풀기 ]
  SQL> alter user hr account unlock;
  SQL> alter user hr identified by hr;

  SQL> connect hr/hr

  
  - [ jdbctest 계정 만들기 : JDBC 수업시간에 사용 ]
    SQL> create user jdbctest identified by jdbctest;
    SQL> grant connect, resource to jdbctest;		// grant란?? -> 권한을 부여해주는 방법이다.



## [ SELECT 명령어 ]

- select 추출하려는 컬럼명리스트 또는 *

- from 테이블이름	// from이 젤 먼저 수행된다!! 가져와야 뭘 하니까

[ where 행의 조건식 ]

[ order by 컬럼명(별칭, 식) desc | asc ]

```sql
select * from emp
select *
from emp;
select ename, sal from emp;	//emp가 가지고있는 모든 행들중, ename과 sal 만 꺼내라.
select sysdate from dual;
select user from dual;
select 100 + 200 from dual;
//dual 테이블은 1행 1열 짜리 ('x')이다. why?? 오라클은 from절을 생략할수 없기 때문이다.

select ename, sal
from emp
where sal > 2000
order by sal [asc];	// desc = decendent, <-> asc = ascendent 혹은 생략!
```

