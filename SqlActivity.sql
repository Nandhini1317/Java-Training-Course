-- 18th April Activity

-- 1.To write a� Cursor to display the list of employees who are Working as a Managers or Analyst.
set serveroutput on;
declare
emprec emp%rowtype;
cursor mycur is select * from emp where job ='MANAGER' or job='ANALYST';
begin
open mycur;
loop
 fetch mycur into emprec;
exit when mycur%NOTFOUND;
dbms_output.put_line(emprec.ename || '' || emprec.sal);
end loop;
close mycur;
end;
/


-- 2.Write PL/SQL code in Cursor to display employee names and salary

set serveroutput on;
declare
erec emp%rowtype;
    cursor mycur is select * from emp;
begin
    open mycur;
    loop
    fetch mycur into erec ;
    exit when mycur%NOTFOUND;    
    dbms_output.put_line(erec.ename || '     ' || erec.sal ); 
    end loop;
    close mycur;
end;
/


-- 3. Write PL/SQL code in Procedure to find the Reverse of the �number
DECLARE
num number;
reverse_num number:=0;

begin
num:=98765;
while num>0
loop
reverse_num:=(reverse_num*10) + mod(num,10);
num:=trunc(num/10);
end loop;

dbms_output.put_line(' Reversed number is : '|| reverse_num);
end;
/