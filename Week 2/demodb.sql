--CREATE USER demo
--IDENTIFIED BY p4ssw0rd
--DEFAULT TABLESPACE users
--TEMPORARY TABLESPACE temp
--QUOTA 10M ON users;
--
--GRANT connect to demo;
--GRANT resource to demo;
--GRANT create session to demo;
--GRANT create table to demo;
--GRANT create view to demo;

--CONN demo/p4ssw0rd;

/*This is DDL*/
--create table "PERSON" (
--    P_ID NUMBER PRIMARY KEY,
--    P_NAME VARCHAR2(200),
--    P_AGE INTEGER,
--    P_STATE VARCHAR2(50)
--);

--/*ALTERING TABLE*/
--ALTER TABLE PERSON 
--    MODIFY P_ID INTEGER;
--    
--/*Adding data (DML)*/
--INSERT INTO PERSON VALUES(1, 'Bob', 26, 'HI');
--Insert into person values(2, 'Sam', 21, 'MA');
--insert into person(p_id, P_NAME) values(4, 'Mike');

/*Queries (DML/DQL)*/
SELECT * FROM PERSON;
SELECT P_ID, P_NAME FROM PERSON;

/*CAN USE operators on numerics, or join chars with +*/
SELECT P_AGE * P_AGE FROM PERSON;
SELECT P_AGE * P_AGE AS AGESQUARED FROM PERSON;

/*Alias keyword AS*/
SELECT 'FIRST NAME', P_NAME FROM PERSON;
SELECT P_NAME AS FIRST_NAME, P_STATE FROM PERSON;

/*Group By: reduce rows to distinct values*/
INSERT INTO PERSON VALUES (5, 'Sarah', 31, 'HI');
SELECT P_STATE FROM PERSON
    GROUP BY P_STATE;
    
/*Aggregate functions (AVG, MIN, MAX, SUM, COUNT)
  Performs an action on entire column*/
SELECT AVG(P_AGE), P_STATE FROM PERSON GROUP BY P_STATE;
SELECT COUNT(P_STATE), P_STATE FROM PERSON GROUP BY P_STATE;

/*Scalar functions, operate on individual entries (LOWER, UPPER, NVL)*/
SELECT UPPER(P_NAME) FROM PERSON;
SELECT LOWER(P_NAME) FROM PERSON WHERE P_ID = 5;
SELECT NVL(P_AGE, 0) FROM PERSON;

/*Order By*/
SELECT * FROM PERSON ORDER BY P_NAME;
SELECT * FROM PERSON ORDER BY P_ID DESC;
SELECT * FROM PERSON ORDER BY P_AGE, P_STATE ASC;
INSERT INTO PERSON VALUES (6, 'Bob', 22, 'AL');
INSERT INTO PERSON VALUES (7, 'Jack', 26, 'TX');
SELECT P_AGE, P_NAME FROM PERSON GROUP BY P_AGE, P_NAME ORDER BY P_AGE;

/*WHERE vs. HAVING*/
SELECT * FROM PERSON WHERE P_AGE != 26;
SELECT P_STATE, AVG(P_AGE) FROM PERSON GROUP BY P_STATE HAVING AVG(P_AGE) > 27;
--Having is for aggregate functions with group by clauses


Commit;
