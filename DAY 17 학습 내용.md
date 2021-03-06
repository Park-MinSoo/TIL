# [ DAY 17 ]

```sql
  select to_char(sysdate,'yyyy"년"') 
  from dual;

  select to_char(sysdate,'mm"월" dd"일" day') 
  from dual;

  select to_char(sysdate,'yyyy"년" mm"월" dd"일" hh"시" mi"분" ss"초"') 
  from dual;

  sal * 12 + comm
  sal * 12 + nvl(comm, 0)

  select enmae, sal, nvl(to_char(comm), '없음') from emp;
  select enmae, sal, nvl(comm, 0) from emp;

  select enmae, sal, nvl2(comm, '정해짐', '미정') from emp;

  decode(대상식, 비교값1, 처리식1, 비교값2, 처리식2, ...., 처리식n)
  switch(대상식, 비교값1, 처리식1, 비교값2, 처리식2, ...., 처리식n)
```



## [ 다중행 함수 ]

```sql
SELECT MAX(SAL), MIN(SAL), SUM(SAL), AVG(SAL), COUNT(SAL) FROM EMP
SELECT EMPNO, ENAME FROM EMP
SELECT EMPNO, ENAME, SAL FROM EMP
SELECT ENAME, MAX(SAL) FROM EMP	---> 오류 발생!!
// ENAME은 14행이고 MAX는 1행 이므로 합해지지 않는다.
SELECT COUNT(COMM), COUNT(*) FROM EMP
```



- COUNT

  - COUNT에 한해서만 * 을 사용할 수 있다. 

  - 나온 행 데이터의 개수를 반환한다.

  - 컬럼이 가지고 있는 Null도 다 센다.

    

- GROUP BY

  - 특정 열 또는 데이터를 기준으로 데이터를 그룹으로 묶는다.

  - WHERE 절 밑에 GROUP BY절을 작성한다.

  - 여러개 지정 가능하다.

  - GROUP BY절을 사용한 그룹화는 그룹화된 열 외에 일반 열을 SELECT절에 명시 할 수 없다.

  - 별칭 사용이 불가하다.

    

- HAVING
  - 그룹에 대한 조건식이다.
  - GROUP BY절이 반드시 사용되어야 사용 가능하다.
  - 별칭 사용이 불가하다.
  - WHERE 절이 GROUP BY절, HAVING절보다 먼저 실행된다.



```sql
SELECT * FROM EMP
WHERE SAL > (전체 월급의 평균을 구하는 SELECT 명령)

SELECT * FROM EMP
WHERE SAL > (SELECT AVG(SAL) FROM EMP)
----> WHERE절 에서는 그룹화 함수를 쓸 수 없기 때문에 이런식으로 SELECT절을 2번 사용해야한다.
```

