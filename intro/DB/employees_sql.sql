use employees;

CREATE TABLE Employee (
	emp_no char(9) NOT NULL,
    birth_date date,
    first_name varchar(15) NOT NULL,
    last_name varchar(15) NOT NULL,
    gender char,
    hire_date date,
    PRIMARY KEY emp_no(emp_no)
);

CREATE TABLE Titles (
	emp_no char(9) NOT NULL,
    title char(15) NOT NULL,
    from_date date NOT NULL,
    to_date date,
    PRIMARY KEY (title, from_date), 
    FOREIGN KEY (emp_no) REFERENCES Employee(emp_no)
);

CREATE TABLE Departments (
	dept_no char(9) NOT NULL,
    dept_name char(15),
    PRIMARY KEY (dept_no)
);

CREATE TABLE Dept_manager (
	dept_no char(9) NOT NULL,
    emp_no char(9) NOT NULL,
    from_date date,
    to_date date,
	PRIMARY KEY (dept_no, emp_no),
    FOREIGN KEY (dept_no) references Departments(dept_no),
    FOREIGN KEY (emp_no) references Employee(emp_no)
);

CREATE TABLE Dept_emp(
	 emp_no char(9) NOT NULL,
     dept_no char(9) NOT NULL,
     from_date date,
     to_date date,
	 PRIMARY KEY (dept_no, emp_no),
     FOREIGN KEY (dept_no) references Departments(dept_no),
     FOREIGN KEY (emp_no) references Employee(emp_no)  
);


