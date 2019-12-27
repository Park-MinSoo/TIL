-- 1. ���տ����� �ǽ� 
-- 1.1 course1 �� course2 �� ��� �����ϴ� �л����� �̸�, ��ȭ ��ȣ �׸��� 
--    ���̸� ����Ͻÿ�.
select name, phone, age from course1
intersect
select name, phone, age from course2;
-- 1.2 course1 �̵� course2 �� �����ϴ� �л����� �̸�, ��ȭ ��ȣ �׸��� 
--    ���̸� ����ϴµ� ���̰� ���� ������ ����Ͻÿ�.
select name, phone, age from course1
UNION
select name, phone, age from course2
order by age desc;
-- 1.3 course1�� ���������� course2 �� �������� �ʴ� �л����� �̸��� ����Ͻÿ�.
select name from course1
minus
select name from course2;
-- 1.4 course2�� ���������� course1 �� �������� �ʴ� �л����� �̸��� ��ȭ��ȣ�� 
--    �̸� ������ ����Ͻÿ�.
select name, phone from course2
minus
select name, phone from course1
order by name;
--2. ��� ������ ������ ����� ���Ͻÿ�. 
select trunc(avg(sal),2) as "���� ���" from emp;
--3. ��� �������� �޴� Ŀ�̼��� ���� ���Ͻÿ�.
select sum(comm) as "Ŀ�̼� ��" from emp;
--4. �� ���޺��� �ѿ����� ����ϵ� �ѿ����� ���� ������ ����Ͻÿ�.
select job as "���޸�"
    , sum(sal) as "�� ����"
    from emp
group by job
order by sum(sal);
--or
select job as "���޸�"
    , sum(sal) as "�� ����"
    from emp
group by job
order by '�� ����';
--or
select job as "���޸�"
    , sum(sal) as "�� ����"
    from emp
group by job
order by 2;
--5. �� �μ����� �ٹ��ϴ� �������� ����� �˰�ʹ�. ���� �������� ����ϴ� SQL
--    �� �ۼ��Ͻÿ� .
select 
    NVL2(deptno,deptno || '�� �μ�' ,'����') as "�μ�����"
   ,count(*) || '��' as "���� ���"
    from emp
group by deptno
order by deptno desc;

--6. �⵵���� ����� �Ի��ߴ��� �˰�ʹ�. ���� �������� ����ϴ� SQL
--    �� �ۼ��Ͻÿ� . (���� �Ի��� ������ ���)
select 
   to_char(hiredate, 'yyyy') || '��' as "�Ի�⵵"
   ,count(to_char(hiredate, 'yyyy')) || '��' as "�Ի� �ο���"
    from emp
group by to_char(hiredate, 'yyyy')
order by count(to_char(hiredate, 'yyyy')) desc;

--7. ��ü �������� ���ڸ� �μ������� ���� �������� ����ϴ� SQL
--    �� �ۼ��Ͻÿ� .

select 
    to_char(sysdate, 'yyyy"��" mm"��" dd"��"') || '�������� ' || count(*) || '���� �ٹ����Դϴ�.' as " "
    from emp;
    
--8. ���޺� �ѿ����� ����ϵ�, ������ 'MANAGER'�� �������� �����Ͻÿ�. 
--   �׸��� �� �ѿ����� 5000���� ū ���޿� �ѿ��޸� ����Ͻÿ�.
select job as "���޸�"
    , sum(sal) as "�ѿ���"
    from emp
where job != 'MANAGER'
group by job
    having sum(sal) >= 5000;

--9. 30�� �μ��� ������ ����� ����� �˻��Ѵ�.
-- ��������� ����+Ŀ�̼�(null�̸� 0���� ���)�̸� 
-- ��� ����� �Ҽ��� ���� �� �ڸ�(�ݿø�)���� ���ϵ� ������� ����Ѵ�.
select job as "������" 
   ,round(avg(sal+nvl(comm,0)),2) as "��տ���"
    from emp
where deptno = 30
group by job;
--10. ���� �Ի��ο��� ���� �������� ����ϴ� SQL �� �ۼ��Ͻÿ� . 
--     �Ի������ ���������̸� �Ի��ο��� 2�� �̻��� ��쿡�� ����Ѵ�.
select 
    to_char(hiredate, 'mm') || '��' as " "
   ,count(to_char(hiredate, 'mm')) || '��' as " "
    from emp
group by to_char(hiredate, 'mm')
having count(to_char(hiredate, 'mm')) >= 2
order by to_char(hiredate, 'mm');
  