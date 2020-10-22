/* Testing_System_Assignment_4 */

/* Question 1 */
DROP PROCEDURE IF EXISTS q1;
DELIMITER $$
	CREATE PROCEDURE q1 (IN dep_name VARCHAR(30))
		BEGIN      
			SELECT a.Username FROM Testing_system.Accounts a 
            INNER JOIN Testing_system.Departments d ON d.DepartmentID = a.DepartmentID
            WHERE d.DepartmentName LIKE dep_name;
        END$$
DELIMITER ;

/* Question 2 */
DROP PROCEDURE IF EXISTS q2;
DELIMITER $$
	CREATE PROCEDURE q2()
		BEGIN
			SELECT g.GroupName, COUNT(g.GroupID) FROM Testing_system.Groupss g
            INNER JOIN Testing_system.Groupaccount ga ON ga.GroupID = g.GroupID
            GROUP BY g.GroupName;
        END$$
DELIMITER ;

/* Question 3 */
DROP PROCEDURE IF EXISTS q3;
DELIMITER $$	
	CREATE PROCEDURE q3()
		BEGIN
			SELECT t.TypeName, COUNT(q.QuestionID) FROM Testing_system.Typequestions t
            INNER JOIN Testing_system.Questions q ON t.TypeID = q.TypeID
            WHERE MONTH(q.CreateDate) = MONTH(NOW()) AND YEAR(q.CreateDate) = YEAR(NOW())
            GROUP BY t.TypeName;
        END$$
DELIMITER ;

/* Question 4 */
DROP PROCEDURE IF EXISTS q4;
DELIMITER $$
	CREATE PROCEDURE q4(OUT id INT)
		BEGIN
			WITH 
				id_max_ques AS 
					(SELECT COUNT(q.QuestionID) AS t FROM Testing_system.Typequestions t
                    LEFT JOIN Testing_system.Questions q ON t.TypeID = q.TypeID
					GROUP BY t.TypeName)           
			SELECT t.TypeID INTO id FROM Testing_system.Typequestions t
            INNER JOIN Testing_system.Questions q ON t.TypeID = q.TypeID
            GROUP BY t.TypeName
            HAVING COUNT(q.QuestionID) = (SELECT MAX(t) FROM id_max_ques);
        END$$
DELIMITER ;

/* Question 5 */
DROP PROCEDURE IF EXISTS q5;
DELIMITER $$
CREATE PROCEDURE q5()
	BEGIN
		-- Get id type
		SET @id = 0;
        CALL q4(@id);
        SELECT @id;
        
        SELECT TypeName FROM Testing_system.Typequestions
        WHERE TypeID = @id;
	END$$;
DELIMITER ;

/* Question 6 */
DROP PROCEDURE IF EXISTS q6;
DELIMITER $$
CREATE PROCEDURE q6(IN in_string VARCHAR(100), IN opt TINYINT)
	BEGIN
		-- if option is 1 then select group name
		IF opt = 1 THEN
			SELECT 	*
			FROM	Testing_system.Groupss 
			WHERE	GroupName LIKE in_string;
		-- else select user name
 		ELSE
			SELECT 	Email, Username, FullName
			FROM	Testing_system.Accounts
			WHERE	Username LIKE in_string;
		END IF;
    END$$;
DELIMITER ;

/* Question 7 */
DROP PROCEDURE IF EXISTS q7;
DELIMITER $$
CREATE PROCEDURE q7(IN fn NVARCHAR(100), IN e VARCHAR(100))
	BEGIN
		IF e LIKE '%@%' THEN
			INSERT INTO Testing_system.Accounts(Email, Username, FullName, PositionID)
			VALUES
				(e, SUBSTRING_INDEX(e,'@',1) , fn, 1);
			SELECT 'Successfully!!' AS Notification; 
		ELSE
			SELECT 'Your email is invalid!!' AS Notification;
		END IF;
    END$$;
DELIMITER ;

/* Question 8 */
DROP PROCEDURE IF EXISTS q8;
DELIMITER $$
CREATE PROCEDURE q8(IN input ENUM('Essay', 'Multiple-Choice'))
	BEGIN
		IF input LIKE 'Essay' THEN
			SELECT Content FROM Testing_system.Questions 
            WHERE LENGTH(Content) = (SELECT MAX(LENGTH(Content)) FROM Questions WHERE TypeID = 1);
        ELSE
			SELECT Content FROM Testing_system.Questions 
            WHERE LENGTH(Content) = (SELECT MAX(LENGTH(Content)) FROM Questions WHERE TypeID = 2);
        END IF;
    END$$;
DELIMITER ;

/* Question 9 */
DROP PROCEDURE IF EXISTS q9;
DELIMITER $$
CREATE PROCEDURE q9(IN exam_id VARCHAR(100))
	BEGIN
		DELETE FROM Testing_system.Exams
        WHERE ExamID = exam_id;
    END$$;
DELIMITER ;

/* Question 10 */
DROP PROCEDURE IF EXISTS q10;
DELIMITER $$
CREATE PROCEDURE q10(IN department VARCHAR(100))
	BEGIN
		DELETE
		FROM Testing_system.Exams
		WHERE ExamID = (SELECT ExamID FROM Testing_system.Exam WHERE (YEAR(NOW()) - YEAR(CreateDate)) > 3);
	END$$;
DELIMITER ;

/* Question 11 */
DROP PROCEDURE IF EXISTS q11;
DELIMITER $$
CREATE PROCEDURE q11(IN department_name VARCHAR(100))
	BEGIN
		UPDATE Testing_system.Accounts
		SET DepartmentID = 10
		WHERE	DepartmentID = (SELECT DepartmentID	FROM Testing_system.Departments	WHERE DepartmentName = department_name);
        
		DELETE 
		FROM	Department
		WHERE	DepartmentName = in_DepartmentName;
    END$$;
DELIMITER ;

/* Question 12 */
DROP PROCEDURE IF EXISTS q12;
DELIMITER $$
CREATE PROCEDURE q12()
	BEGIN
		SELECT MONTH(CreateDate) AS `Month`, COUNT(QuestionID) AS Total_questions FROM Testing_system.Questions
        WHERE YEAR(CreateDate) = YEAR(NOW())
        GROUP BY MONTH(CreateDate);
    END$$;
DELIMITER ;

/* Question 13 */
DROP PROCEDURE IF EXISTS q13;
DELIMITER $$
CREATE PROCEDURE q13()
	BEGIN
		SELECT MONTH(CreateDate) AS `Month`, COUNT(QuestionID) AS Total_questions FROM Testing_system.Questions
        WHERE CreateDate > ADDDATE(NOW(), INTERVAL -6 MONTH)
        GROUP BY MONTH(CreateDate);
    END$$;
DELIMITER ;




