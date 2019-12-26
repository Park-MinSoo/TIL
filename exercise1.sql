-- ������ ������ �������� �ذ��Ͽ� �����Ѵ�.
-- �������ϸ� : exercise1.sql

--1. ��� ���̺��� ����Ʈ�� ����Ͻÿ�.
select * from tab;
--2. ��� ���̺��� ������ ����Ͻÿ�.
desc emp;
desc dept;
desc bonus;
desc salgrade;
--3. ���(emp)���̺��� ��� �����͸� ����Ͻÿ�.
select * from emp;
--4. ������̺��� �����ȣ, ����̸�, ������ ����Ͻÿ�.
select EMPNO, ENAME, SAL from emp;
--5. ������̺��� ���޿��� �̴µ� �ߺ��� �����Ͱ� ���� ����Ͻÿ�.
select DISTINCT SAL from emp;
--6. ������̺��� ����̸��� ������ ����ϴµ� ������ �÷�����
-- "�� ��","�� ��"���� �ٲ㼭 ����Ͻÿ�. ��, ALIAS�� ���� �߰�
select ENAME AS "�� ��", SAL AS "�� ��" from emp;
--7. ������̺��� ����̸�, ������ �̰�, ���ް� Ŀ�̼���  ���� ����
-- ����ϴµ� �÷����� '�Ǳ޿�'�̶�� �ؼ� ����Ͻÿ�.
-- ��, NULL���� ��Ÿ���� �ʰ� �Ͻÿ�.(Ŀ�̼� �ȹ޴»������)
select ENAME, SAL, SAL+COMM AS "�Ǳ޿�" from emp
where comm is not null;
--8. ������̺��� 'FORD'�̶�� ����� �����ȣ, �̸�, ������ ����Ͻÿ�.
select EMPNO, ENAME, SAL from emp
WHERE ENAME = 'FORD';
--9. ������̺��� ������ 'SALESMAN'�� ����� �����ȣ, �̸�, ������
-- ����Ͻÿ�.
select EMPNO, ENAME, JOB from emp
where JOB = 'SALESMAN';
--10. ������̺��� �����ȣ�� 7499, 7521, 7654�� ����� �����ȣ, �̸�
-- ������ ����Ͻÿ�.
select  EMPNO, ENAME, SAL from emp
where EMPNO IN ('7499' , '7521' , '7654');
--11. ������̺��� ������ 1500���� 3000������ ����� �����ȣ, �̸�,
-- ������ ����Ͻÿ�.
select EMPNO, ENAME, SAL from emp
where SAL Between 1500 And 3000;
--12. ��� ���̺��� �Ŵ����� ���� ������ �̸��� ����Ͻÿ�.
select ENAME from emp
where  MGR is null;
--13. ������̺��� ������ ���� ������ ��� ������ ����Ͻÿ�.
select * from emp
order by sal desc;
--14. ������̺��� ������ �̸��� �Ի����� ����ϴµ� �ֱٿ� �Ի��� ������ ����Ͻÿ�.
select ENAME, HIREDATE from emp
order by HIREDATE desc;
--15. ��� ���̺��� 30�� �μ��� �ٹ��ϴ� �������� �̸��� ����ϴµ�
-- �Ի����� ������ ������ ����Ͻÿ�.
select ENAME from emp
where DEPTNO = 30
order by HIREDATE asc;
