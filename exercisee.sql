--1.
desc employees;
--2
select * from employees;
--3
select employee_id, last_name, salary from employees;
--4
select last_name, first_name, salary from employees
order by salary desc;
--5.
select employee_id, job_id, department_id from employees
where job_id = 'IT_PROG';
--6.
select last_name, commission_pct from employees
where commission_pct is not null
order by last_name asc;
--7.
SELECT employee_id, last_name
,salary * 12 as "ANNUAL SALARY"
FROM employees;
--8.
select distinct employee_id as "emp#",
last_name as "employee",
job_id as "job",
hire_date as "Hire Date" from employees;
--9.
select last_name || ',  ' || job_id as "Employee and Title" FROM employees
order by last_name asc;
--10.
select last_name, salary from employees
where salary >= 12000;
--11.
select last_name, salary from employees
where salary between 5000 and 12000;
--12.
select last_name, job_id, hire_date from employees
where last_name in ('Taylor', 'Matos')
order by Hire_date asc;
--13.
select last_name, department_id from employees
where department_id in ('20', '50');
--14.
select last_name as "Employee", salary as "Monthly Salary" from employees
where salary between 5000 and 12000 and department_id in ('20', '50');
--15.
select last_name, hire_date from employees
where hire_date like '04%';
--16.
select last_name, job_id from employees
where manager_id is null;
--17.
select last_name, salary, commission_pct from employees
where commission_pct is not null
order by salary desc, commission_pct desc;
--18.
select last_name from employees
where last_name like '__a%';
--19.
select last_name from employees
where last_name like '%a%e%';
--20.
select last_name, job_id, salary from employees
where job_id in ('IT_PROG', 'SA_REP')
and salary != '4800'
and salary != '7500'
and salary != '10000';
--21.
select last_name as "Employee", salary as "Monthly Salary", commission_pct as "Commission" from employees
where commission_pct is not null
and salary between 5000 and 12000
and department_id = '20'
or  department_id = '80'
and commission_pct = 0.2;

--실습 6-6
Select Length('한글'), LENGTHB('한글')
from DUAL;
-- utf - 8 을 이용중이기 때문에 한글의 바이트수가 '4'(x2)가 아닌 '6'(x3)이 나오는것을 볼 수 있다.
