/* Extra_Assignment_1_2 */

/* Ex1 */
CREATE DATABASE IF NOT EXISTS Extra;

USE Extra;

CREATE TABLE IF NOT EXISTS Trainee (
	trainee_id				TINYINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	full_name				VARCHAR(50) NOT NULL,
    birth_date				DATE NOT NULL,
    gender					ENUM('m','f'),
    et_iq					TINYINT CHECK (et_iq >=0 AND et_iq <= 20) NOT NULL,
    et_gmat					TINYINT CHECK (et_gmat >=0 AND et_gmat <= 20) NOT NULL,
    et_english 				TINYINT CHECK (et_english >=0 AND et_english <= 50) NOT NULL,
    training_class			VARCHAR(6) NOT NULL,
    evaluation_note 		VARCHAR(100)
);

ALTER TABLE Trainee
ADD COLUMN  VTI_Account VARCHAR(30) NOT NULL UNIQUE KEY;

/* Ex2 */
CREATE TABLE datatype1(
	id 				INT(8) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    n 				VARCHAR(50) NOT NULL,
    c 				CHAR(5) NOT NULL,
    modified_date 	TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

/* Ex3 */
CREATE TABLE datatype2(
	id 					INT(8) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    n 					VARCHAR(50) NOT NULL,
    birth 				DATE NOT NULL,
    gender 				VARCHAR(10),
    is_deleted_flag 	INT CHECK(is_deleted_flag = 0 OR is_deleted_flag = 1)
);