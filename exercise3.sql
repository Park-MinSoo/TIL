-- 1. 집합연산자 실습 
-- 1.1 course1 과 course2 를 모두 수강하는 학생들의 이름, 전화 번호 그리고 
--    나이를 출력하시오.
select name, phone, age from course1
intersect
select name, phone, age from course2;
-- 1.2 course1 이든 course2 든 수강하는 학생들의 이름, 전화 번호 그리고 
--    나이를 출력하는데 나이가 많은 순으로 출력하시오.
select name, phone, age from course1
UNION
select name, phone, age from course2
order by age desc;
-- 1.3 course1은 수강하지만 course2 는 수강하지 않는 학생들의 이름을 출력하시오.
select name from course1
minus
select name from course2;
-- 1.4 course2는 수강하지만 course1 은 수강하지 않는 학생들의 이름과 전화번호를 
--    이름 순으로 출력하시오.
select name, phone from course2
minus
select name, phone from course1
order by name;
--2. 모든 직원들 월급의 평균을 구하시오. 
select trunc(avg(sal),2) as "월급 평균" from emp;
--3. 모든 직원들이 받는 커미션의 합을 구하시오.
select sum(comm) as "커미션 합" from emp;
--4. 각 직급별로 총월급을 출력하되 총월급이 낮은 순으로 출력하시오.
select job as "직급명"
    , sum(sal) as "총 월급"
    from emp
group by job
order by sum(sal);
--or
select job as "직급명"
    , sum(sal) as "총 월급"
    from emp
group by job
order by '총 월급';
--or
select job as "직급명"
    , sum(sal) as "총 월급"
    from emp
group by job
order by 2;
--5. 각 부서에서 근무하는 직원들의 명수를 알고싶다. 다음 형식으로 출력하는 SQL
--    을 작성하시오 .
select 
    NVL2(deptno,deptno || '번 부서' ,'미정') as "부서정보"
   ,count(*) || '명' as "직원 명수"
    from emp
group by deptno
order by deptno desc;

--6. 년도별로 몇명이 입사했는지 알고싶다. 다음 형식으로 출력하는 SQL
--    을 작성하시오 . (많이 입사한 순으로 출력)
select 
   to_char(hiredate, 'yyyy') || '년' as "입사년도"
   ,count(to_char(hiredate, 'yyyy')) || '명' as "입사 인원수"
    from emp
group by to_char(hiredate, 'yyyy')
order by count(to_char(hiredate, 'yyyy')) desc;

--7. 전체 직원들의 숫자를 부서정보를 다음 형식으로 출력하는 SQL
--    을 작성하시오 .

select 
    to_char(sysdate, 'yyyy"년" mm"월" dd"일"') || '기준으로 ' || count(*) || '명이 근무중입니다.' as " "
    from emp;
    
--8. 직급별 총월급을 출력하되, 직급이 'MANAGER'인 직원들은 제외하시오. 
--   그리고 그 총월급이 5000보다 큰 직급와 총월급만 출력하시오.
select job as "직급명"
    , sum(sal) as "총월급"
    from emp
where job != 'MANAGER'
group by job
    having sum(sal) >= 5000;

--9. 30번 부서의 업무별 년봉의 평균을 검색한다.
-- 연봉계산은 월급+커미션(null이면 0으로 계산)이며 
-- 출력 양식은 소수점 이하 두 자리(반올림)까지 통일된 양식으로 출력한다.
select job as "업무명" 
   ,round(avg(sal+nvl(comm,0)),2) as "평균월급"
    from emp
where deptno = 30
group by job;
--10. 월별 입사인원을 다음 형식으로 출력하는 SQL 을 작성하시오 . 
--     입사월별로 오름차순이며 입사인원이 2명 이상인 경우에만 출력한다.
select 
    to_char(hiredate, 'mm') || '월' as " "
   ,count(to_char(hiredate, 'mm')) || '명' as " "
    from emp
group by to_char(hiredate, 'mm')
having count(to_char(hiredate, 'mm')) >= 2
order by to_char(hiredate, 'mm');
  