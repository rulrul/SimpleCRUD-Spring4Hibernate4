Spring4-Hibernate4 Example
------------------------------
Simple CRUD operations using Maven, Spring4, Hibernate4

[MySQL-Script]
--------------
CREATE TABLE freelancer (
id bigint(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
name varchar(255) NOT NULL,
position varchar(255) DEFAULT NULL,
salary int(15),
email varchar(255) DEFAULT NULL)Engine=InnoDB;
