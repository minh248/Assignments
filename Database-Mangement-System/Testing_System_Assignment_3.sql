/* Testing_System_Assignment_3 */

/* Question 1 */
DROP VIEW IF EXISTS employees_of_sale;
CREATE VIEW employees_of_sale AS
	SELECT a.*, d.DepartmentName FROM Testing_system.Accounts a
    INNER JOIN Departments d ON d.DepartmentID = a.DepartmentID
    WHERE d.DepartmentName LIKE 'Sale';

/* Question 2 */
DROP VIEW IF EXISTS acc_joint_most_group;
CREATE VIEW acc_joint_most_group AS
	WITH
		-- Get accID and total group which employee join in
		x AS (SELECT AccountID, COUNT(GroupID) AS total_groups FROM Testing_system.groupaccount GROUP BY AccountID),
        -- Get the accID and total of group which that employee join the most
        y AS (SELECT AccountID, MAX(total_groups) AS max_group FROM x)
	SELECT a.* FROM Testing_system.Accounts a
    WHERE a.AccountID = (SELECT AccountID FROM y)
;

/* Question 3 */
DROP VIEW IF EXISTS long_content_question;
CREATE VIEW long_content_question AS
	SELECT q.Content FROM Questions q
    WHERE LENGTH(q.Content) > 300;
DROP VIEW long_content_question;

/* Question 4 */
DROP VIEW IF EXISTS have_most_employees;
CREATE VIEW have_most_employees AS
	SELECT MAX(total_employees) AS total_employees FROM (
		SELECT d.DepartmentName, COUNT(a.AccountID) as total_employees FROM Departments d
		INNER JOIN Accounts a ON d.DepartmentID = a.DepartmentID
		GROUP BY d.DepartmentName
	) as departmentname_n_total_employees;

/* Question 5 */
DROP VIEW IF EXISTS user_start_with_nguyen;
CREATE VIEW user_start_with_nguyen AS
	SELECT q.Content FROM Questions q
    WHERE q.CreatorID LIKE 'nguyen%';