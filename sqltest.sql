--1. employees ���̺��� ������ �ľ��� �� �ִ� SQL ����� �ۼ��Ͻÿ�.
select * from employees;

--2. departments ���̺��� ������ �ľ��� �� �ִ� SQL ����� �ۼ��Ͻÿ�.
select * from departments;

--3. ���� ��¥�� ����ϴ� SQL ����� �ۼ��Ͻÿ�.
select to_char(sysdate,' yyyy"��" mm"��" dd"��"') from dual;

--4. �������� �� ������� ����Ͻÿ�.
select count(*) from employees;

--5.** ������ ũ���������� ���� �������� ����Ͻÿ�. **

select to_date('2020-12-25')
    ,to_char(to_date('2020-12-25'), 'DAY', 'NLS_DATE_LANGUAGE = KOREAN')
    from dual;

--6. �μ� ��ġ�� ���� ���� ������ id(employee_id), �̸�(first_name), �ش� ������ ����ϴ� �Ŵ��� ID, �Ŵ����� �̸��� ��ȸ�Ͽ� ����Ͻÿ�.
select e.employee_id as "���"
        ,e.first_name as "���"
        ,e.manager_id as "�Ŵ��� ���"
        ,m.first_name as "�Ŵ��� �̸�"
        from employees e, employees m
where e.manager_id = m.employee_id
and e.department_id is null;

--7. �Ի�� ���� ������ �ְ�޿��� ��ȸ�Ͽ� ����Ͻÿ�. 
--��, ��½� �ְ�޿� ������������ ���ĵǾ� ����ϸ� �ְ�޿��� 10000 �̻��� ������ ����մϴ�. 
select to_char(hire_date,'mm') || '��' as "�Ի��"
        ,to_char(salary,'999,999') || '��' as "�ְ�޿�"
        from employees
where salary <= any (select max(salary) from employees)
and salary > 10000
order by salary desc;

--8. �Ի�⵵�� ���� ���� ���Ͽ� ����Ͻÿ�. ��, �޿��� 5000���� 10000 �� ���̸� ������ �׸��� �������� 7�� �̻��� ��츸 ����Ͻÿ�. 
-- ���� ����� �Ի�⵵ ������ �����Ͻÿ�.
select to_char(hire_date,'yy') as "�Ի�⵵"
    ,count(employee_id) as "���ǿ� �´� ������"
    from employees
where salary between 5000 and 10000
group by to_char(hire_date,'yy')
having count(employee_id) >= 7
order by to_char(hire_date,'yy');

--9. �Ի����� 6���� ������ �̸�(first_name), �μ��̸�(department_name) �� ����-�Ի���ޡ��� ����Ͻÿ�. 
-- �����̸� ������������ �����Ͽ� ��� �մϴ�.
select e.first_name as "�̸�"
    ,d.department_name as "�μ��̸�"
    ,to_char('��-�Ի����')
    from employees e join departments d on (e.department_id = d.department_id)
where to_char(hire_date, 'mm') = 06
order by e.first_name;

--10.  'Den'�� ���� �μ����� �ٹ��ϴ� �������� �ִ����, �ּҿ��� �׸��� ������ ����� ���Ͻÿ�.
-- ��, ��հ��� ����Ҷ� �ʴ��������� ����Ͻÿ�.

select Max(salary) as "�ִ����"
    ,Min(salary) as "�ּҿ���"
    ,avg(salary) as "�������"
    from employees
where department_id = (select department_id from employees where first_name = 'Den')
