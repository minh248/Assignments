/* Testing_System_Assignment_2 */

-- Question 1
SELECT * FROM Testing_system.Departments;

-- Question 2
SELECT DepartmentID FROM Testing_system.Departments
WHERE DepartmentName = "Sale";

-- Question 3
SELECT FullName FROM Testing_system.Accounts a
WHERE LENGTH(FullName) = (SELECT MAX(LENGTH(FullName)) FROM Testing_system.Accounts);

-- Question 4
SELECT GroupName FROM Testing_system.Groupss
WHERE CreateDate < '2019-12-20 00:00:00';

-- Question 5
SELECT QuestionID FROM Testing_system.Answers
GROUP BY QuestionID
HAVING COUNT(AnswerID) >= 4;

-- Question 6
SELECT * FROM Testing_system.Groupss
ORDER BY CreateDate DESC
LIMIT 5;

-- Question 7
-- No question available

-- Question 8
DELETE FROM Testing_system.Exams
WHERE CreateDate < '2019-12-20 00:00:00';

-- Question 9
UPDATE Testing_system.Accounts
SET Fullname = N'Nguyễn Bá Lộc', Email = 'loc.nguyenba@vti.com.vn'
WHERE AccountID = 5;

-- Question 10
SELECT a.AccountID, a.Email, a.Username, a.Fullname, d.DepartmentName
FROM Testing_system.Accounts a
INNER JOIN Departments d ON a.DepartmentID = d.DepartmentID;

-- Question 11
SELECT a.Fullname, p.PositionName 
FROM Testing_system.Accounts a
INNER JOIN Testing_system.Positions p ON p.PositionID = a.PositionID
WHERE p.PositionName LIKE 'dev%';

-- Question 12
SELECT d.*, COUNT(a.DepartmentID)
FROM Testing_system.Departments d
INNER JOIN Testing_system.Accounts a ON a.DepartmentID = d.DepartmentID
GROUP BY DepartmentID
HAVING COUNT(a.DepartmentID) > 3;

-- Question 13
WITH
	-- Get total question use and sort by content
	total_question_use AS 
		(SELECT q.Content, COUNT(eq.QuestionID) AS t FROM Testing_system.Questions q
		INNER JOIN Testing_system.Examquestions eq ON eq.QuestionID = q.QuestionID
        GROUP BY q.Content)
SELECT q.Content FROM Testing_system.Questions q
INNER JOIN Testing_system.Examquestions eq ON eq.QuestionID = q.QuestionID
GROUP BY q.Content
-- Select max using question from: total_question_use
HAVING COUNT(q.QuestionID) = (SELECT MAX(tqu.t) FROM total_question_use tqu);
    
-- Question 14
SELECT cq.*, COUNT(q.CategoryID) AS UsingTime 
FROM Testing_system.CategoryQuestions cq
INNER JOIN Testing_system.Questions q ON cq.CategoryID = q.CategoryID
GROUP BY cq.CategoryID;

-- Question 15
WITH 
	-- Select quesion and total answers of it
	qta AS 
		(SELECT q.Content, COUNT(a.AnswerID) AS Total_answers FROM Testing_system.Questions q
        INNER JOIN Testing_system.Answers a ON a.QuestionID = q.QuestionID
        GROUP BY q.Content)
SELECT qta.Content FROM qta
WHERE qta.Total_answers = (SELECT MAX(Total_answers) FROM qta) ;

-- Question 16
WITH
	-- Select name of position and total employees in each position
	pte AS 
		(SELECT p.PositionName, COUNT(a.AccountID) AS Total_employees FROM Testing_system.Accounts a
        INNER JOIN Testing_system.Positions p ON a.PositionID = p.PositionID
        GROUP BY p.PositionName)
SELECT pte.PositionName FROM pte
WHERE pte.Total_employees = (SELECT MIN(Total_employees) FROM pte);

-- Question 17
SELECT d.DepartmentName, p.PositionName , COUNT(a.AccountID) AS Total
FROM Testing_system.Departments d
INNER JOIN Testing_system.Accounts a ON a.DepartmentID = d.DepartmentID
INNER JOIN Testing_system.Positions p ON a.PositionID = p.PositionID
WHERE p.PositionName LIKE 'dev%' OR
		p.PositionName LIKE 'test' OR
        p.PositionName LIKE 'scrum master' OR
        p.PositionName LIKE 'PM'
GROUP BY d.DepartmentName;

-- Question 18
SELECT q.Content, t.TypeName, q.CreatorID, a.Content FROM Testing_system.Typequestions t
INNER JOIN Testing_system.Questions q ON q.TypeID = t.TypeID
INNER JOIN Testing_system.Answers a ON q.QuestionID = a.QuestionID
WHERE a.isCorrect = TRUE;

-- Question 19
SELECT t.TypeName, COUNT(q.QuestionID) FROM Testing_system.Typequestions t
INNER JOIN Testing_system.Questions q ON q.TypeID = t.TypeID
GROUP BY t.TypeName;

/* Setting SQL_SAFE_UPDATES */
SET SQL_SAFE_UPDATES = 0;
SET SQL_SAFE_UPDATES = 1;
