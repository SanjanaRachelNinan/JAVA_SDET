CREATE DATABASE db2;
USE db2;
SHOW TABLES;

/*Creating Table Student*/

CREATE TABLE Student
( Student_ID VARCHAR(10),
Student_Name VARCHAR(20),
Address VARCHAR(20),
DOB DATE,
Department_ID VARCHAR(20));

/*Inserting Values in Table Student*/

INSERT INTO Student VALUES('S001','Jack','xyffz,Delhi','1999-09-27','DOO1');
INSERT INTO Student VALUES('S002','Amy','xyzdf,Kerala','1998-07-02','DOO2');
INSERT INTO Student VALUES('S003','Susan','abxyz,Mumbai','1999-03-14','DOO3');
INSERT INTO Student VALUES('S004','Sam','xadyz,Karnataka','1998-12-17','DOO2');
INSERT INTO Student VALUES('S005','Mark','xyzee,Delhi','1999-01-21','DOO1');

/*Displaying Contents in Table Student*/

SELECT * FROM Student;

/*Creating Table Subjects*/

CREATE TABLE Subjects
( Subject_ID VARCHAR(10),
Subject_Name VARCHAR(20),
Lecturer_ID VARCHAR(20));

/*Inserting Values in Table Subjects*/

INSERT INTO Subjects VALUES('SUBD001','Literature','LOO1');
INSERT INTO Subjects VALUES('SUBD001','Grammar','LOO2');
INSERT INTO Subjects VALUES('SUBD002','SQL','LOO3');
INSERT INTO Subjects VALUES('SUBD002','Java','LOO4');
INSERT INTO Subjects VALUES('SUBD002','Manual Testing','LOO5');
INSERT INTO Subjects VALUES('SUBD003','Trignometry','LOO6');
INSERT INTO Subjects VALUES('SUBD003','Algebra','LOO7');

/*Displaying Contents in Table Subjects*/

SELECT * FROM Subjects;

/*Creating Table Lecturers*/

CREATE TABLE Lecturers (
    Lecturer_ID VARCHAR(10),
    Lecturer_Name VARCHAR(20),
    Department_ID VARCHAR(20));
    
/*Inserting Values in Table Subjects*/

INSERT INTO Lecturers VALUES('LOO1','Liam','DOO1');
INSERT INTO Lecturers VALUES('LOO2','Dawn','DOO1');
INSERT INTO Lecturers VALUES('LOO3','Jessy','DOO2');
INSERT INTO Lecturers VALUES('LOO4','Ryunjin','DOO2');
INSERT INTO Lecturers VALUES('LOO5','Haley','DOO2');
INSERT INTO Lecturers VALUES('LOO6','Hyuna','DOO3');
INSERT INTO Lecturers VALUES('LOO7','Jackson','DOO3');

/*Displaying Contents in Table Lecturers*/

SELECT * FROM Lecturers;

/*Creating Table Departments*/

CREATE TABLE Departments ( 
	Department_ID VARCHAR(10),
    Department_Name VARCHAR(20));
    
/*Inserting Values in Table Departments*/
    
INSERT INTO Departments VALUES('DOO1','English');
INSERT INTO Departments VALUES('DOO2','Computer');
INSERT INTO Departments VALUES('DOO3','Mathematics');

/*Displaying Contents in Table Departments*/
  
SELECT * FROM Departments;

/*Creating Table FeeStructure*/

CREATE TABLE FeeStructure (
    Student_ID VARCHAR(10),
    Fee INTEGER);
    
/*Inserting Values in Table FeeStructures*/  
    
 INSERT INTO FeeStructure VALUES('SOO1',25000);   
 INSERT INTO FeeStructure VALUES('SOO2',25000);
 INSERT INTO FeeStructure VALUES('SOO3',25000);
 INSERT INTO FeeStructure VALUES('SOO4',25000);
 INSERT INTO FeeStructure VALUES('SOO5',25000);
 
 /*Displaying Contents in FeeStructure*/
 
 SELECT * FROM FeeStructure;
 
 /*Using WHERE*/
 
 SELECT * FROM Lecturers WHERE Department_ID = 'DOO2';
 
 /*Using LIKE*/
 
 SELECT * FROM Student WHERE Address LIKE '%,Delhi%';
 
 /*Using BETWEEN*/

 SELECT * FROM Student WHERE DOB BETWEEN '1998-01-01' AND '1998-12-31';
 
 /*Using DISTINCT*/
 
 SELECT DISTINCT Department_ID FROM Lecturers;
 
 /*Using IN*/
 
 SELECT * FROM Student WHERE Department_ID IN ('DOO1','DOO2');
 
/*Using Having*/

SELECT * FROM Student GROUP BY Department_ID HAVING COUNT(Department_ID) <=1;

/*Using ALTER-ADD*/
 
ALTER TABLE Student ADD Email VARCHAR(20);
 
/*Using ALTER-DROP*/
 
ALTER TABLE Student DROP Email;

/*Using ALTER-MODIFY*/
 
ALTER TABLE Student MODIFY Department_ID  VARCHAR(5);

/*Using Truncate*/

TRUNCATE TABLE FeeStructure;
SELECT * FROM FeeStructure;

/*Joins*/

/*INNER JOIN*/

SELECT Lecturers.Lecturer_Name,Lecturers.Department_ID,Departments.Department_Name FROM Lecturers INNER JOIN Departments ON Lecturers.Department_ID=Departments.Department_ID;

/*LEFT JOIN*/

SELECT Lecturers.Lecturer_Name,Lecturers.Department_ID,Departments.Department_Name FROM Lecturers LEFT JOIN Departments ON Lecturers.Department_ID=Departments.Department_ID ORDER BY Lecturers.Lecturer_Name;

/*RIGHT JOIN*/

SELECT Lecturers.Lecturer_Name,Lecturers.Department_ID,Departments.Department_Name FROM Lecturers RIGHT JOIN Departments ON Lecturers.Department_ID=Departments.Department_ID ORDER BY Lecturers.Lecturer_Name;

/* The End*/
