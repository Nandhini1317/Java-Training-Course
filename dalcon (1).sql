No:14#
--40.List all the details of ‘Miller’.
select * from emp e , dept d where e.ename = 'MILLER' and e.deptno = d.deptno


--39.List all the unique jobs along with deptno.
select distinct job, deptno from emp order by job asc


--41.list the details of dept 10.
select * from dept where deptno = 10;