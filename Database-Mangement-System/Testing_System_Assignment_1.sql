/* Testing_System_Assignment_1 */

CREATE DATABASE testing_system;

USE testing_system;

CREATE TABLE Departments(
	DepartmentID 				TINYINT AUTO_INCREMENT PRIMARY KEY ,
    DepartmentName 				VARCHAR(50) NOT NULL
);

CREATE TABLE Positions(
	PositionID					TINYINT AUTO_INCREMENT PRIMARY KEY,
    PositionName				VARCHAR(50) NOT NULL
);

CREATE TABLE Accounts(
	AccountID					TINYINT AUTO_INCREMENT PRIMARY KEY,
    Email						VARCHAR(30) NOT NULL,
    Username 					VARCHAR(30) NOT NULL,
    FullName					NVARCHAR(30) NOT NULL,
    DepartmentID 				TINYINT NOT NULL,
    PositionID					TINYINT NOT NULL,
    CreateDate 					TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID) ON DELETE CASCADE,
    FOREIGN KEY (PositionID) REFERENCES Positions(PositionID) ON DELETE CASCADE
);

CREATE TABLE Groupss(
	GroupID						TINYINT AUTO_INCREMENT PRIMARY KEY,
    GroupName					VARCHAR(30) NOT NULL,
    CreatorID					VARCHAR(5) NOT NULL,
    CreateDate					TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE GroupAccount(
	GroupID						TINYINT,
    AccountID					TINYINT,
    JoinDate					TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (GroupID) REFERENCES Groupss(GroupID) ON DELETE CASCADE,
    FOREIGN KEY (AccountID) REFERENCES Accounts(AccountID) ON DELETE CASCADE
);

CREATE TABLE TypeQuestions(
	TypeID						TINYINT AUTO_INCREMENT PRIMARY KEY,
    TypeName					ENUM('Essay', 'Multiple-Choice')
);

CREATE TABLE CategoryQuestions(
	CategoryID					TINYINT AUTO_INCREMENT PRIMARY KEY,
    CategoryName				VARCHAR(15) NOT NULL
);

CREATE TABLE Questions(
	QuestionID					TINYINT AUTO_INCREMENT PRIMARY KEY,
    Content						VARCHAR(200) NOT NULL,
    CategoryID					TINYINT NOT NULL,
    TypeID						TINYINT NOT NULL,
    CreatorID					TINYINT NOT NULL,
    CreateDate    				TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (CategoryID) REFERENCES CategoryQuestions(CategoryID) ON DELETE CASCADE,
    FOREIGN KEY (TypeID) REFERENCES TypeQuestions(TypeID) ON DELETE CASCADE
);

CREATE TABLE Answers(
	AnswerID					TINYINT AUTO_INCREMENT PRIMARY KEY,
    Content						VARCHAR(200) NOT NULL,
    QuestionID					TINYINT NOT NULL,
    isCorrect					BOOLEAN,
    FOREIGN KEY (QuestionID) REFERENCES Questions(QuestionID) ON DELETE CASCADE
);

CREATE TABLE Exams(
	ExamID						TINYINT AUTO_INCREMENT PRIMARY KEY,
    Codes						VARCHAR(10) NOT NULL,
    Title						VARCHAR(15) NOT NULL,
    CategoryID					TINYINT NOT NULL,
    Duration					MEDIUMINT NOT NULL,
    CreatorID					TINYINT NOT NULL,
	CreateDate					TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (CategoryID) REFERENCES CategoryQuestions(CategoryID) ON DELETE CASCADE
);


CREATE TABLE ExamQuestions(
	ExamID						TINYINT NOT NULL,
    QuestionID					TINYINT NOT NULL,
    FOREIGN KEY (ExamID) REFERENCES Exams(ExamID) ON DELETE CASCADE,
    FOREIGN KEY (QuestionID) REFERENCES Questions(QuestionID) ON DELETE CASCADE
);


INSERT INTO Departments(DepartmentName)
VALUES
    ('Development'),
    ('Finance and Couting'),
    ('Human resouce'),
    ('Admin'),
    ('Sale')
;

INSERT INTO Positions(PositionName)
VALUES
	('HR manager'),
    ('Develop'),
    ('Directer'),
    ('Project Manager'),
    ('Risk Management Officer')
;

INSERT INTO Accounts(Email, Username, FullName, DepartmentID, PositionID)
VALUES
	('John@gmail.com', 'John', 'John', 1, 2),
    ('Benjamin@gmail.com', 'Benjamin', 'Benjamin', 5, 3),
    ('Alex@gmail.com', 'Alex', 'Alex', 3, 1),
    ('Victoria@gmail.com', 'Victoria', 'Victoria', 1, 4),
    ('Zoey@gmail.com', 'Zoey', 'Zoey', 2, 5)
;
    
INSERT INTO Groupss(GroupName, CreatorID)
VALUES
	('Dev','G1'),
    ('HR','G2'),
    ('Finance and Couting','G3'),
    ('Admin','G4'),
    ('x','G5')
;

INSERT INTO GroupAccount(GroupID, AccountID )
VALUES
	(1,1),
	(4,2),
    (3,3),
    (1,4),
    (2,5)    
;

INSERT INTO TypeQuestions(TypeName)
VALUES
	  ('Essay'), 
      ('Multiple-Choice')
;

INSERT INTO CategoryQuestions(CategoryName)
VALUES
	('Math'),
    ('SQL'),
    ('Python'),
    ('Postman'),
    ('Javascript')
;

INSERT INTO Questions(Content, CategoryID, TypeID, CreatorID)
VALUES
	('1 + 1 = ?', 1, 2, 1),
    ('What does SQL stand for?', 2, 1, 4),
    ('What is dictonary ?', 3, 1, 2),
    ('What is Postman ?', 4, 1, 2),
    ('What is asynchronous programming?', 5, 1, 3)
;

INSERT INTO Answers(Content, QuestionID, isCorrect)
VALUES
	('1', 1, FALSE),
    ('2', 1, TRUE),
    ('3', 1, FALSE),
    ('4', 1, FALSE),
	('Structured Query Language', 2, TRUE),
    ('Python dictionaries are written with curly brackets, and they have keys and values', 3, TRUE),
    ('A platform offers the tools to simplify each step of the API building process and streamlines collaboration' , 4, TRUE),
    ('Unit of work runs separately from the main application thread and notifies the calling thread of its completion' , 5, TRUE)
;

INSERT INTO Exams(Codes, Title, CategoryID, Duration, CreatorID)
VALUES
	('E1', 'Exam 1', 1, 1, 1),
    ('E2', 'Exam 2', 2, 120, 2),
    ('E3', 'Exam 3', 3, 160, 4),
    ('E4', 'Exam 4', 4, 30, 2),
    ('E5', 'Exam 5', 5, 90, 3)
;

INSERT INTO ExamQuestions(ExamID, QuestionID)
VALUES
	(1,1),
	(2,2),
    (3,3),
    (4,4),
    (5,5)  
;
