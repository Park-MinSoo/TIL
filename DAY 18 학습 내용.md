# [ DAY 18 ]



## [ JOIN ]

- 두 개 이상의 테이블을 연결하여 하나의 테이블처럼 출력할 때 사용하는 방식
  - 크로스 조인(Cross Join) - 모든 행과 행단위를 붙여서 결과를 나타내어 주는 것.
  - 이너 조인(Inner Join) - 같은 행이 없는것은 제외 시키고 붙여서 결과를 나타내어 주는 것.
  - 자체 조인(Self Join) - 테이블 하나 가지고 자기 자신과 조인하는 것.

- 연산식을 작성할 때 빈행을 추가하고자 하는 테이블의 컬럼값에 +를 붙여주면 비어있는 행이 추가되며 join이 일어난다.

```sql
select * from emp, dept -- ,를 통하여 행과 행단위를 붙여서 결과를 나타내어 준다.
-- 결과로 14x4 = 56행이 타나타게 되는데, 이를 크로스 조인이라고 말한다.

select * from emp, dept where emp.deptno = dept.deptno;
-- 같은 행이 없는 것은 제외시킨다. 이를 이너 조인이라고 말한다.

select * from emp, dept where emp.deptno = dept.deptno(+);
-- 연산식을 작성할때 빈행을 추가하고자 하는 테이블의 컬럼값에 +를 붙여주면 비어있는 행이 추가되며 join이 일어난다.	// left outer

select * from emp, dept where emp.deptno(+) = dept.deptno;
-- 일치하는 애가 없는 행은 null행 하고 일치하는 것으로 무조건 간주해 버리게 된다. // right outer

select * from emp, dept where emp.deptno(+) = dept.deptno(+);
-- 이렇게 양쪽으로 붙이게 되는 경우는 지원되지 않는다. 오류 발생!!!

select * from emp, dept where emp.deptno = dept.deptno(+)
union
select * from emp, dept where emp.deptno(+) = dept.deptno;
-- 따라서 이런 방법으로 합쳐야 한다.

select e1.empno, e1.ename, e1.mgr
    ,e2.empno as mgr_empno
    ,e2.ename as mgr_ename
    from emp e1, emp e2
where e1.mgr = e2.empno;
--한테이블을 두번 사용해서 join하는 방법인 self join 이다.

select e.ename, nvl(m.ename, '없음')
from emp e, emp m
where e.mgr = m.empno(+);
-- 이경우 null 값이였던 king도 나오게 되고 또 킹의 매니저는 '없음' 이라고 출력되어지게 된다.
```



## [ ANSI JOIN (표준 조인) ]

- Join 유형을 세분화
- where 절에서 join 조건을 별도로 분리하고 'Join' 키워드를 명시적으로 사용

```sql
(1)
select
from 테이블1 join 테이블2 using (조인에 사용할 컬럼명)
where 행에 대한 조건
-- using을 사용할 때에는 반드시 ()를 사용해야 한다.

(2)
select
from 테이블1 join 테이블2 on (조인 조건식)
where 행에 대한 조건

(3)
select
from 테이블1 left join 테이블2 [using (조인에 사용할 컬럼명) 또는 on (조인 조건식)]
where 행에 대한 조건
-- left join

(4)
select
from 테이블1 right join 테이블2 [using (조인에 사용할 컬럼명) 또는 on (조인 조건식)]
where 행에 대한 조건
-- right join

(5)
select
from 테이블1 full join 테이블2 [using (조인에 사용할 컬럼명) 또는 on (조인 조건식)]
where 행에 대한 조건
-- full join
```

- using절이나 on절이 없어도 되는경우

  - cross join

    

## [ 서브 쿼리 ]

- 서브쿼리는 연산자와 같은 비교 또는 ***조회 대상의 오른쪽에 놓이며 괄호 ()로 묶어서 사용***한다.
- 특수한 몇몇 경우를 제외한 대부분의 서브쿼리에서는 ***ORDER BY절을 사용할 수 없다***.
- 서브쿼리의 SELECT 절에 명시한 열은 메인쿼리의 ***비교 대상과 같은 자료형과 같은 개수로 지정***해야 한다.
- 서브쿼리에 있는 SELECT문의 결과 행 수는 함께 사용하는 ***메인쿼리의 연산자 종류와 호환 가능***해야 한다.

```sql
select 컬럼리스트 !*
from 테이블명
where 컬럼 = 정해진 값 OR 이미 알고 있는 값

select 컬럼리스트 !*
from 테이블명
where 컬럼 = (SELECT 명령)	-- (SELECT 명령)은 비교할 값

select *
from emp
where sal > (select sal from emp where ename = 'ADAMS');
-- 서브 쿼리는 비교식의 오른쪽에만 올 수 있다.

select *
from emp
where sal > ALL(select sal from emp where ename = 'ADAMS' or 'SCOTT');
-- 여러개를 비교할때에는 다중행 연산자 처럼 연산자 종류와 호환이 가능한 형태로 비교 되어야한다.
```

- 비교 연산자
  - Any - 조건식을 사용한 결과가 하나라도 ture 면 ture!
    - < Any의 경우 MAX함수를 사용하는 식으로도 응용이 가능하다.
  - Some - 조건식을 사용한 결과가 하나라도 ture 면 ture!
  - ALL - 조건식을 사용한 결과가 하나라도 falsue 면 faluse!