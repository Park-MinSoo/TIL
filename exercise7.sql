select * from emp;
select * from dept;
RollBack;


-- 1. EMP ���̺��� ������ȣ�� 7499���� ������ ������ 5000�޷��� �����Ѵ�.

Update emp
set sal = '5000'
where empno = '7499';

-- 2. EMP���̺��� �μ���ȣ�� 20���� �������� ������ ���� ���޿��� 10% �λ��� �ݾ����� �����Ѵ�.

update emp
set sal = sal * (110/100)
where deptno = '20';

-- 3. DEPT ���̺� �Ʒ��� �������� �����͸� �Է��Ѵ�.
-- �μ���ȣ: 50, �μ���ġ: BOSTON,  �μ���: RESERCH

insert into dept
values (50, 'RESERCH', 'BOSTON');

-- 4. EMP ���̺� �Ʒ��� ���� �����͸� �����Ѵ�.
-- ������ȣ: 9900, �����̸�: JACKSON, ����: SALESMAN, �μ���ȣ: 10, ���� : 800

insert into emp (empno, ename, job, deptno, sal)
values (9900, 'JACKSON', 'SALESMAN', 10, 800);

-- 5. DEPT ���̺� �Ʒ��� �������� �����͸� �Է��Ѵ�.
-- �μ���ȣ: 60, �μ���ġ: NULL,  �μ���: MARKETING

insert into dept
values (60, 'MARKETING', null);

-- 6. ������ȣ�� 7698���� ������ �μ���ȣ�� 7369�� ������ 
-- �μ���ȣ�� �����Ѵ�.

update emp
set deptno = (select deptno from emp
                      where empno = '7369')
where empno = '7698';

-- 7. 20�� �μ��� �������� ��� �����Ѵ�.

delete emp
where deptno = '20';

-- 8. ������ 1000 ������ �������� �����Ѵ�.

delete emp
where sal <= 1000;

-- 9. ������ȣ�� 7900 �� ������ ������ ���� ���޿��� 5% ������Ű��
         �μ���ȣ�� 40���� �����Ѵ�.

update emp
set sal = sal * (105/100), deptno = '40'
where empno = '7900';

-- 10. ���縦 �������� �Ի����� 38�� �̻��� �����鿡 ���Ͽ� 
  --        ������ 2��� �����ϰ� Ŀ�̼ǵ� 3000���� �����Ѵ�.
    --     (�Ի����� �⵵�� �������� �ݿø��Ͽ� ����Ѵ�.)

update emp
set sal = sal*2, comm = '3000'
where (to_char(sysdate, 'yyyy') - round(to_char(hiredate, 'yyyy'))) >= 38;


select*from tab;
