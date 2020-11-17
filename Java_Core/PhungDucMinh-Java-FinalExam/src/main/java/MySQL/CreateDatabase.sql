CREATE DATABASE final_exam;

USE final_exam;

CREATE TABLE IF NOT EXISTS employee(
	id				TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fullName 		VARCHAR(100) NOT NULL,
    email			VARCHAR(50) NOT NULL,
    `password`		VARCHAR(50) NOT NULL,
    ProSkill		VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS manager(
	id				TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fullName 		VARCHAR(100) NOT NULL,
    email			VARCHAR(50) NOT NULL,
    `password`		VARCHAR(50) NOT NULL,
    expInYear		TINYINT NOT NULL
);

CREATE TABLE IF NOT EXISTS project(
	projectId		TINYINT NOT NULL,
    teamSize		TINYINT NOT NULL,
    idManager		TINYINT NOT NULL,
    idEmployee	 	TINYINT NOT NULL,
    FOREIGN KEY (idManager) REFERENCES manager(id) ON DELETE CASCADE,
    FOREIGN KEY (idEmployee) REFERENCES employee(id) ON DELETE CASCADE
);

INSERT INTO employee(fullName, email, `password`, ProSkill) 
	VALUES	("A", "a@gmail.com", "A123456", "Java"),
			("B", "b@gmail.com", "B123456", "Javascript"),
			("C", "c@gmail.com", "C123456", "Python")
;

INSERT INTO manager(fullName, email, `password`, expInYear) 
	VALUES	("M1", "m1@gmail.com", "M123456", 10),
			("M2", "m2@gmail.com", "M234567", 20)
;

INSERT INTO project(projectId, teamSize, idManager, idEmployee) 
	VALUES	(1, 1, 1, 1),
			(2, 2, 2, 1),
			(2, 2, 2, 2)
;

SELECT * FROM manager;


SELECT m.* FROM project p
INNER JOIN manager m ON m.id = p.idManager
WHERE p.projectId = 2
GROUP BY m.id;

SELECT e.* FROM project p
INNER JOIN employee e ON e.id = p.idEmployee
WHERE p.projectId = 2
GROUP BY e.id;


SELECT id, fullname, email, `password` FROM manager
WHERE email = "m1@gmail.com" AND  `password` = "M123456"
union all
SELECT id, fullname, email, `password` FROM employee
WHERE email = "m1@gmail.com" AND  `password` = "M123456";
    