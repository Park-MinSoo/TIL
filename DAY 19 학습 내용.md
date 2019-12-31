# [ DAY 19 ]



## [ 날짜 포메팅 방법 ]

```sql
'KING'에게 보고하는 모든 직원의 이름과 입사날짜를 출력한다. 
--     (KING에게 보고하는 직원이란 mgr이 KING인 직원을 의미함) 
--이름         입사날짜
---------- ----------
--JONES	   1981년 04월 02일
--BLAKE	   1981년 05월 01일
--CLARK	   1981년 06월 09일

select ename as "이름", to_char(hiredate, 'yyyy"년" mm"월" dd"일"') as "입사날짜" from emp
where mgr = (select empno from emp
                      where ename = 'KING' );


-- 1981년 4월 2일 처럼 월, 일에 비어있는 0 을 빼는 방법!
select ename as "이름", to_char(hiredate, 'yyyy"년" fmmm"월" dd"일"') as "입사날짜" from emp
where mgr = (select empno from emp
                      where ename = 'KING' );
-- 이경우 'fm'이 월부터 붙었기 때문에 월 이후인 월, 일은 0이 사라지는 포메팅이 되어지게된다.

```

## [ 데이터 조작어 (DML) ]

- 테이블에 데이터 추가하기
  - Inset 문

    ```sql
    Insert Into 테이블 이름 [(열1, 열2, ..., 열N)]
    Values (열1에 들어갈 데이터, 열2에 들어갈 데이터, ... , 열N에 들어갈 데이터);
    ```

    - Insert문에서 지정한 열 개수와 각 열에 입력할 ***데이터 갯수가 일치***해야 한다.
    - Insert문에서 지정한 열 개수와 각 열에 입력할 ***데이터 타입이 일치***해야 한다.
    - Insert문에서 지정한 열 개수와 각 열에 입력할 ***데이터 길이가 길지 않아***야 한다.
    - 컬럼리스트는 상략하고 만들때가 많다. (열 지정을 생략)

    

  - 비어 있는 테이블 만드는 방법

    ```sql
    select * from emp where 1 <> 1
    --> 비어있는 resultset을 만드는 것이다.
    ```

    - Table을 구성하는 컬럼 정보는 필요한데 데이터는 필요하지 않을때 주로 사용한다.



- 테이블에 있는 데이터 수정하기
  - Update 문

    ```sql
    Update [변경할 테이블]
    SET [변경할 열1]=[데이터],[변경할 열2]=[데이터],... , [변경할 열n]=[데이터]
    [where 데이터를 변경할 대상 행을 선별하기 위한 조건];
    ```

    - where절을 주지 않으면 모든 열이 전부 바뀌게 된다.

    

  -  수정한 내용을 되돌리고 싶을 때

    - ROLLBACK;

    - 하나의 덩어리로 이루어 져야 하는 Transaction으로 이루어 져야하는 작업에서 많이 이용된다.

      ex) 은행의 계좌이체



- 테이블에 있는 데이터 삭제하기
  - Delete 문

    ```sql
    Delete [FROM] [테이블 이름]
    [Where 삭제할 대상 행을 선별하기 위한 조건식];
    ```

    - where절을 주지 않으면 모든 열이 전부 삭제 된다.



## [ 트랜잭션 ]

- All and Nothing
- 트랙잭션을 제어하기 위해서 사용하는 명령어를 TCL(Transaction Control Language) 이라고 한다.
- Commit 과 Rollback으로 명령을 끝내고 따로 시작하는 명령은 없다.
  - Commit - 실제 테이블에 반영이 되고 종료된다.
  - Rollback - 트랜잭션을 취소하고 싶을 때 사용한다.
- 첫번째 DML 명령어가 시작 되었을때 시작으로 간주한다.
- DML을 수행 할 때마다 Saving Point를 설정 해 줄 수 있다. - 이런식으로 나누어 롤백 제어 가능



## [ 데이터 정의어 (DDL) ]

- Data Definition Language는 데이터베이스 데이터를 보관하고 관리하기 위해 제공되는 여러 객체의

  생성, 변경, 삭제 관련 기능을 수행한다.

- Create - 오라클 데이터베이스 객체를 생성하는 데 사용하는 명렁어이다.

- 테이블 이름 생성 규칙

  1. 테이블 이름은 문자로 시작해야 한다(한글도 가능하며 숫자로 시작할 수 없음)

     ex) EMP90 (O), 90EMP(X)

  2. 테이블 이름은 30Byte 이하여야 한다.(즉 영어는 30자, 한글은 10자까지 사용 가능)

  3. 같은 사용자 소유의 테이블 이름은 중복될 수 없다(SCOTT 계정에 두 EMP 테이블은 존재 불가능)

  4. 테이블 이름은 영문자(한글 가능), 숫자(0-9)와 특수문자 $,#,_를 사용할 수 있다.

     ​	ex) EMP#90_OB

  5. SQL 키워드는 테이블 이름으로 사용할 수 없다.(SELECT, FROM 등은 테이블 이름으로 사용 불가)

     

- Alter - 이미 생성된 오라클 데이터베으 객체를 변경할 때 사용하는 명렁어이다.

  - ADD - 새 열을 추가 가능

  - RENAME - 열 이름을 변경 가능

  - MODIFY - 열의 자료형을 변경 가능

  - DROP - 테이블의 특정 열을 삭제할때 사용

    

- 테이블 이름 변경 하기

  ```sql
  Rename 'A' to 'B';
  ```

  

- TRUNCATE

  - 특정 테이블의 모든 데이터를 삭제한다.
  - 복구 할 수없다.
  - 데이터만 삭제하므로 테이블 구조에는 영향을 주지 않는다.



## [ 오라클의 휴지통 기능 ]

- 휴지통에 들은 테이블을 조회

  - SQL> show recyclebin;

    

- 휴지통의 모든 내용이 비움

  - SQL> purge recyclebin;

    

- 삭제된 테이블을 되살리고 싶다면

  - SQL> flashback table 테이블명 to before drop;

    

- 특정 테이블을 휴지통에 남기지 않고 모두 삭제

  - SQL> drop table 테이블명 purge;

    

- Purge 문 없이 그냥 drop 한 후에는

  - SQL> purge table 테이블명;



## [ 제약 조건 ]

- 제약조건이란?

  - 테이블의 특정 열에 지정한다.

  - 제약 조건을 지정한 열의 제약 조건에 부합하지 않는 데이터를 저장할 수 없다.

    

- Primary Key

  - Unique와 Not Null 제약 조건의 특성을 모두 가지는 제약 조건이다.

  - 즉, 데이터 중복을 허용하지 않고 NULL도 허용하지 않는다.

  - 테이블에 하나밖에 지정할 수 없다.

    

- Default

  - 특정 열에 저장할 값이 지정되지 않았을 경우에 기본값(default)을 지정 하는것.

  - 생략했을때, 자동으로 부여되는 값이다.

    

- 제약 조건 확인
  - 지정한 제약 조건 정보를 확인하려면 User_constraints 데이터 사전을 활용한다
  - owner - 제약 조건 소유 계정
  - constraint_name - 제약 조건 이름(직접 지정하지 않을 경우 오라클이 자동으로 지정함)
  - constraint_type - 제약 조건 종류
    - C : Check, Not null
    - U : Unique
    - P : Primary key
    - R : Foreign key
  - Table_Name - 제약 조건을 지정한 테이블 이름



## [ JDBC(Java DataBase Connectivity) 프로그래밍 ]

- Java API

  - Java.sql

  - javax.sql

    

- DBMS 에 무관하게 프로그램을 개발할 수 있다.

  

- 구성 : JDBC API         +         JDBC Driver

  ​		 (인터페이스)          (인터페이스들의 구현 클래스)

  ​		 DBMS에 무관           DBMS에 따라 달라진다.

  

- 팩토리 메서드 

  - 객체 생성을 대신 해주는 일반 메서드

    

- SQL 명령을 수행시키는 기능을 지원하는 객체 - Statement

  - executeQuery():ResultSet - SELECT

  - executeUpdate():Int - 그 외의 모든 SQL

  - Statement stmt = Connection 객체의 createStatement();

    

- JDBC 프로그램의 구현 순서

  1. JDBC Driver 로딩 - Class.forName()

  2. DBMS 에 접속 - DriverManager.getConnection("jdbc url", "계정", "암호")

  3. Statement/PreparedStatement 객체 생성

  4. 처리하려는 기능에 따라서 SQL 문을 전달하고 수행시킨다.

  5. 결과 처리

     ResultSet 객체

     next(), getXXX()

     SELECT 명령의 수행 결과 여부에 관계없이 ResultSet 객체는 리턴된다.

  6. 종료시 close() 필수



## [ URL ]

- URL : 인터넷 사이트(웹 사이트, 웹 페이지)의 주소 문자열

  ​			--------------------------------------------------------> 이것은 사실 http URL에 대한 설명이다!

  - Uniform Resource Locator의 약어로 어떤 자원의 위치를 알리는 단일화(규격화)된 형식의 문자열

  - 프로토콜명 : ..........................

    - 프로토콜 : 통신 규약

    http(s)://www.naver.com/

    http://www.html5test.com/

    http://www.w3schools.com/

    http://www.w3.org/

    

    jdbc url : 어떤 DBMS를 어떤 JDBC Driver를 통해서 접속할 것인지 하나의 문자열로 구성

    jdbc : DBMS이름 : JDBCDriver이름 : Driver에서 원하는대로

    jdbc:oracle : thin : @DBMS네트워크주소 : 리스너포트번호 : SID



