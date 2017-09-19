update emp
   set gender = 'F'
 where gender = 'f';

select * from emp;
 
select count(*) from dept;
commit;


select * from tbl_dept;
select * from tbl_emp;

select count(*) from dept;

insert into tbl_dept
select * from dept;

insert into tbl_emp
(comm, deptno, empno, ename, gender, hiredate, job, mgr, sal)
select comm, deptno, empno, ename, gender, hiredate, job, mgr, sal from emp;

delete from tbl_emp;

insert into tbl_profile
(fname, curr)
values
("user01_profile", 1);

select * from tbl_profile;