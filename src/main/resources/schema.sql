SET NAMES utf8 ;

DROP SCHEMA IF EXISTS `person`;
CREATE SCHEMA `person`;
USE `person`;
DROP TABLE IF EXISTS `person`;

SET character_set_client = utf8mb4 ;
CREATE TABLE `person` (
`id` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `phone_number` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

