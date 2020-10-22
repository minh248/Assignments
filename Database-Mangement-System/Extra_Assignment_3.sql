/* Extra_Assignment_3*/

/* Question 1 */
INSERT INTO Trainee(full_name, birth_date, gender, et_iq, et_gmat, et_english, training_class)
VALUE
	('Min', '2000/8/24', 'M', 20, 20 ,50 , '1'),
	('Bill', '2001/9/13', 'F', 18, 19 ,40 , '1'),
	('Candace', '1998/10/16', 'M', 5, 5 ,5 , '6'),
	('Warren', '1999/2/4', 'F', 20, 13 ,41 , '1'),
	('Stanford', '2000/2/14', 'M', 14, 20 ,50 , '4'),
	('Frank', '2001/12/18', 'M', 20, 19 ,32 , '2'),
	('Griffin', '1999/5/6', 'M', 16, 19 ,49 , '4'),
	('Stewart', '2000/6/5', 'F', 10, 20 ,30 , '3'),
	('Barnes', '2000/10/18', 'F', 20, 17 ,45 , '3'),
	('Howard', '2000/3/3', 'M', 1, 1 ,1 , '6')
;

/* Question 2 */

SELECT MONTH(birth_date) AS Group_by_month, full_name, birth_date, gender FROM Trainee
ORDER BY Group_by_month ASC;

/*Question 3*/
SELECT * FROM Trainee
WHERE LENGTH(full_name) = (SELECT MAX(LENGTH(full_name)) FROM Trainee);

/* Question 4 */
SELECT * FROM Trainee
WHERE et_iq + et_gmat >= 20 AND et_iq >= 8 AND et_gmat >= 8 AND et_english >= 18;

/* Question 5 */ 
DELETE FROM Trainee
WHERE trainee_id = 3;

/* Question 6 */
UPDATE Trainee
SET training_class = 2
WHERE trainee_id = 5;


/* Setting SQL_SAFE_UPDATES */
SET SQL_SAFE_UPDATES = 0;
SET SQL_SAFE_UPDATES = 1;