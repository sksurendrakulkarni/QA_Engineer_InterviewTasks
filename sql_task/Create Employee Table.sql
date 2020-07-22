CREATE TABLE Employee (
	emp_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	first_name VARCHAR(255) NOT NULL,
	last_name VARCHAR(255) NOT NULL,
	gender VARCHAR(1) NOT NULL,
	position VARCHAR(255) NOT NULL,
	department_id INT,
	salary INT,
	FOREIGN KEY (department_id)
		REFERENCES Department (department_id)
);