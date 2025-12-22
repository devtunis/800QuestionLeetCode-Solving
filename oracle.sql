
DECLARE
  input1 INTEGER;
  employeeid   HR.JOB_HISTORY.EMPLOYEE_ID%TYPE;
  start_datee  HR.JOB_HISTORY.START_DATE%TYPE;
  my_error     EXCEPTION;
BEGIN
   input1:=:input1;
  IF (input1 > 100) THEN
    RAISE my_error;
  ELSE
    SELECT EMPLOYEE_ID, START_DATE 
      INTO employeeid, start_datee 
      FROM HR.JOB_HISTORY
      WHERE DEPARTMENT_ID = input1;
      

    DBMS_OUTPUT.PUT_LINE('emp id =' || employeeid || ' date =' || TO_CHAR(start_datee, 'DD-MON-YYYY'));
  END IF;
EXCEPTION
  WHEN my_error THEN
    DBMS_OUTPUT.PUT_LINE('invalid number');
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('zabour li tlwj 3lih mouch mwjoud : (');
END;
/
