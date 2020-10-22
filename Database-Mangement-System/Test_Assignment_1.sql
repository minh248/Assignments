/* a */
-- Create DB
DROP DATABASE IF EXISTS Project;
CREATE DATABASE IF NOT EXISTS Project;
-- Use Database
USE Project;

-- Create Table Employee
CREATE TABLE 	CUSTOMER ( 
	CustomerID 					INT AUTO_INCREMENT PRIMARY KEY,
	`Name`						VARCHAR(30) NOT NULL,
	Phone 						CHAR(13) NOT NULL,
	Email 						VARCHAR(50) UNIQUE NOT NULL,
	Address 					VARCHAR(100) NOT NULL,
    Note						VARCHAR(500) NOT NULL
);

-- Create Table CAR
CREATE TABLE 	CAR (
	CarID 						INT AUTO_INCREMENT PRIMARY KEY,
	Maker						ENUM('HONDA','TOYOTA','NISSAN') NOT NULL ,
	Model 						CHAR(13) NOT NULL,
	`Year` 						SMALLINT UNIQUE NOT NULL,
	Color 						VARCHAR(50) NOT NULL,
    Note						VARCHAR(500) NOT NULL
);

-- Create Table CAR_ORDER
CREATE TABLE 	CAR_ORDER ( 
	OrderID 					INT AUTO_INCREMENT PRIMARY KEY,
	CustomerID					INT NOT NULL ,
	CarID 						INT NOT NULL,
	Amount						SMALLINT DEFAULT 1 NOT NULL,
	SalePrice 					DOUBLE NOT NULL,
	OrderDate 					DATE NOT NULL,
	DeliveryDate 				DATE NOT NULL,
	DeliveryAddress 			VARCHAR(100) NOT NULL,
	`Status` 					TINYINT(2) DEFAULT 0 NOT NULL,
    Note						VARCHAR(500) NOT NULL,
    FOREIGN KEY (CarID) REFERENCES  CAR(CarID) ON DELETE CASCADE,
    FOREIGN KEY (CustomerID) REFERENCES  CUSTOMER(CustomerID) ON DELETE CASCADE
);

 -- Insert CUSTOMER
INSERT INTO	CUSTOMER
	(`Name`, Phone, Email, Address, Note)
	VALUES
	('A', '123456', 'acb@gmail.com', 'HN', '1'),
	('A1', '1234562', 'acb1@gmail.com', 'H1N', '21'),
	('A2', '1234564', 'acb2@gmail.com', 'HN2', '12');
	
 INSERT INTO CAR (Maker, Model, `Year`, Color, Note)
	VALUES
	('HONDA', 'HONDA1', 1990, 'YEALLOW', '1'),
	('TOYOTA', 'TOYOTA1', 1992, 'BLUE', '12'),
	('NISSAN', 'NISSAN1', 1994, 'RED', '111');
	
INSERT INTO	CAR_ORDER (CustomerID, CarID, Amount, SalePrice, OrderDate, DeliveryDate, DeliveryAddress, `Status`, Note)
	VALUES
	(1, 2, 2, 5.000000, '2020-03-01', '2020-03-21', 'HN', 1, '123'),
	(2, 3, 2, 6.000000, '2020-03-04', '2020-03-10', 'HN1', 1, '1234'),
	(3, 1, 2, 8.000000, '2020-03-08', '2020-03-15', 'HN2', 1, '1235'),
    (2, 2, 2, 5.000000, '2020-03-01', '2020-03-21', 'HN', 1, '123'),
	(2, 3, 2, 6.000000, '2020-03-04', '2020-03-10', 'HN1', 1, '1234'),
	(2, 2, 2, 8.000000, '2020-03-08', '2020-03-15', 'HN2', 1, '1235'),
	(3, 1, 7, 8.000000, '2020-03-08', '2020-03-15', 'HN2', 1, '1235');
    

/* b */
SELECT c.`Name`, t.total_cars FROM Project.CUSTOMER c
INNER JOIN 
			(
				SELECT co.CustomerID, SUM(co.Amount) AS total_cars 
				FROM Project.CAR_ORDER co
				WHERE co.`Status` = 1
				GROUP BY co.CustomerID
            ) AS t ON c.CustomerID = t.CustomerID
GROUP BY c.`Name`
ORDER BY total_cars ASC;


/* c */
-- Delete function if exists
DROP FUNCTION IF EXISTS f1;
-- Create function
DELIMITER $$
CREATE FUNCTION f1()
RETURNS VARCHAR(100) 
DETERMINISTIC
	BEGIN
		DECLARE r VARCHAR(100);

        WITH 
			-- Table show total cars bought in year, cars is grouped by each brand
			bought_cars_table_in_year AS 
				(SELECT co.CarID, SUM(co.Amount) AS total_cars 
				FROM CAR_ORDER co
				WHERE co.`Status` = 1 AND YEAR(NOW()) = YEAR(co.DeliveryDate)
				GROUP BY co.CarID
				HAVING total_cars > 0)
        SELECT GROUP_CONCAT(c.Maker)
        INTO r
        FROM Project.CAR c
        INNER JOIN bought_cars_table_in_year bc ON c.CarID = bc.CarID
        WHERE bc.total_cars = (SELECT MAX(total_cars) FROM bought_cars_table_in_year);
        
        RETURN r;
	END $$  
DELIMITER ;

/* d */
DROP PROCEDURE IF EXISTS p1;
DELIMITER $$
CREATE PROCEDURE p1()
	BEGIN
		DELETE FROM Project.CAR_ORDER
        WHERE `Status` = 2 AND YEAR(OrderDate) < YEAR(NOW());
        
        SELECT ROW_COUNT();
    END$$;
DELIMITER ;

/* e */
DROP PROCEDURE IF EXISTS p2;
DELIMITER $$
CREATE PROCEDURE p2(IN customer_id TINYINT)
	BEGIN
		SELECT cus.`Name`, co.OrderID, co.Amount, c.Maker FROM Project.CUSTOMER cus
        INNER JOIN Project.CAR_ORDER co ON co.CustomerID = cus.CustomerID
        INNER JOIN Project.CAR c ON c.CarID = co.CarID
        WHERE co.`Status` = 0;
    END$$;
DELIMITER ;

/* f */
-- Trigger

/* Setting SQL_SAFE_UPDATES */
SET SQL_SAFE_UPDATES = 0;
SET SQL_SAFE_UPDATES = 1;

