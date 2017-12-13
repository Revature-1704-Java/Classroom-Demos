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

Commit;
