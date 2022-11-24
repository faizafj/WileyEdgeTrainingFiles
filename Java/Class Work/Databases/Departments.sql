DROP DATABASE wiley;
-- -- creates a database
CREATE DATABASE IF NOT EXISTS wiley;
-- uses the wiley database
USE wiley;
-- DROP TABLE IF EXISTS Departments;
-- DROP TABLE IF EXISTS Jobs;
-- DROP TABLE IF EXISTS Employees;

CREATE TABLE IF NOT EXISTS Departments (
    Department_ID INT PRIMARY KEY,
    Department_name  VARCHAR(30),
    Manager_ID INT,
    Location_ID INT
);

CREATE TABLE IF NOT EXISTS Jobs (
    Job_ID VARCHAR(10) PRIMARY KEY,
    Job_Title  VARCHAR(30) NOT NULL,
    Min_Salary INT,
    Max_Salary INT
);

CREATE TABLE IF NOT EXISTS Employees (
    Employee_ID INT PRIMARY KEY,
    First_Name VARCHAR(20),
    Surname VARCHAR(25) NOT NULL,
    Email VARCHAR(30) NOT NULL,
    Phone_Number VARCHAR(20) NOT NULL,
    Hire_Date DATE NOT NULL,
    Job_ID varchar(10),
    Salary DOUBLE,
    Commission_Pct DOUBLE,
    Manager_ID INT,
    Department_ID INT,
    Constraint jobId_Fk
    FOREIGN KEY (Job_ID) REFERENCES Jobs (Job_ID),
    Constraint deptId_FK
    FOREIGN KEY (Department_ID)
        REFERENCES Departments (Department_ID)
);

INSERT INTO Departments VALUES 
(1, 'IT', 1, 1),
(2, 'HR', 2, 2),
(3, 'Customer Services', 1, 1),
(4, 'IT', 2, 3),
(50, 'IT', 2, 3),
(23, 'IT', 2, 3);

INSERT INTO Jobs VALUES
(1, 'Web Development', 50333, 80000),
(2, 'Software Development', 10000, 50000),
(3, 'Database Development', 5000, 12000),
(4, 'HR Management', 12333, 30000);

INSERT INTO Employees VALUES
(1, 'Faiza', 'Javed', 'email123', '0123232323', "2022-11-15", 1, 233232, 132, 1, 1),
(2, 'Sam', 'J', 'samemail', '019865732323', "2022-11-15", 2, 10334, 12, NULL, 1),
(3, 'Harry', 'Taylor', 'email2133', '0192332223', "2022-11-15", 3, 5435232, 8942, 2, 3),
(4, 'Zayn', 'Malik', 'zemail2133', '027382736278', "1994-11-15", 1, 900, 8790, 3, 23),
(5, 'Louis', 'Matos', 'Lemail2133', '01924540823', "2022-11-15", 3, 133232, 4372, NULL, 2),
(6, 'Betty', 'Dancs', 'Bemail2133', '01928989570', "1994-11-15", 2, 11000, 4372, 2, 50);



SET SQL_SAFE_UPDATES = 0; 	
select Surname, Job_ID, Hire_Date as "STARTDATE", Employee_ID from Employees; 

select concat(Surname, ", " , Job_ID) as "Employee and Title"  from Employees; 

select Surname, Salary from Employees where (Salary < 12000 AND Salary > 5000) AND (department_ID = 20 OR department_ID = 50); 

select Surname, Hire_Date from Employees where Hire_Date LIKE "1994%"; 

select Surname, Job_ID from Employees WHERE Manager_ID is null; 

update Employees set Salary = 1000 WHERE salary <= 900;
select * from Employees; 

-- Delete all from the table; 


/*

Create a report to display the last name, salary, and commission of all employees who earn commissions.
Change the last name of employee 3 to Drexler.
Delete Betty Dancs from the EMPLOYEE table
Empty the table EMPLOYEE .

*/ 

