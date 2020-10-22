/* Extra_Assignment_4 */

/* Question 1 */
CREATE TABLE IF NOT EXISTS Department(
	department_nu 				TINYINT AUTO_INCREMENT PRIMARY KEY,
    department_name 			VARCHAR(30)
);

CREATE TABLE IF NOT EXISTS Employee(
	employee_nu					TINYINT AUTO_INCREMENT PRIMARY KEY,
    employee_name				VARCHAR(50),
    department_nu				TINYINT,
    FOREIGN KEY (department_nu) REFERENCES Department(department_nu) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS employee_skill(
	employee_nu					TINYINT,
    skill_code					VARCHAR(20),
    date_registered				DATE,
    FOREIGN KEY (employee_nu) REFERENCES Employee(employee_nu) ON DELETE CASCADE
);

/* Question 2 */
INSERT INTO Department(department_name)
VALUE
    ('Accounts and finance'),
    ('HR'),
    ('Sales and marketing'),
    ('Infrastructures'),
    ('Research and development'),
    ('Learning and development'),
    ('IT services'),
    ('Product development'),
    ('Admin department'),
    ('Security and transport')
;

INSERT INTO Employee(employee_name, department_nu)
VALUE
	('Bill', 3),
    ('Adam', 2),
    ('John', 6),
    ('Steve', 8),
    ('Mark', 7),
    ('William', 4),
    ('Emma', 10),
    ('Sophia', 9),
    ('Jacob', 1),
    ('Dylan', 5),
    ('David', 3),
    ('Benjamin', 2),
    ('Brooklyn', 6),
    ('Victoria', 8),
    ('Gabriel', 8),
    ('Lucas', 1),
    ('Evan', 1),
    ('Luke', 9),
    ('Tyler', 1),
    ('Jack', 3)
;

INSERT INTO employee_skill(employee_nu, skill_code, date_registered)
VALUE
	(1, 'Java', '2005/1/1'),
	(1, 'Javascript', '2006/4/2'),
	(1, 'Python', '2009/12/6'),
	(1, 'C++', '2009/12/18'),
	(2, 'Java', '2004/1/5'),
	(3, 'C#', '2003/10/9'),
	(5, 'Java', '2015/1/20'),
	(6, 'Javascript', '2017/1/24'),
	(8, 'Python', '2011/8/24'),
	(8, 'C++', '2012/8/31'),
    (9, 'Javascript', '2010/3/19'),
	(9, 'Java', '2018/4/12'),
	(9, 'C++', '2020/5/5'),
	(10, 'Java', '2020/5/6')
;

/* Question 3 */
SELECT e.employee_name FROM Employee e
INNER JOIN employee_skill ek ON e.employee_nu = ek.employee_nu
WHERE ek.skill_code = 'java';

/* Question 4 */
SELECT d.department_name, COUNT(e.employee_nu) AS total_employees FROM Department d
INNER JOIN Employee e ON d.department_nu = e.department_nu
GROUP BY department_name
HAVING total_employees > 3;

/* Question 5 */
SELECT d.department_name, GROUP_CONCAT(e.employee_name SEPARATOR ', ') AS employees_list FROM Department d
INNER JOIN Employee e ON d.department_nu = e.department_nu
GROUP BY d.department_name;

/* Question 6 */
SELECT DISTINCT e.employee_name FROM Employee e
INNER JOIN employee_skill ek ON ek.employee_nu = e.employee_nu