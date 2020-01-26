SET NAMES utf8 ;
LOCK TABLES `person` WRITE;
Insert into person( `id`, `first_name`, `last_name`, `phone_number`) values ( 1, "Jan", "Kowalski", 800800800);
Insert into person( `id`, `first_name`, `last_name`, `phone_number`) values ( 2, "Andrzej", "Sapkowski", 070007207);
Insert into person( `id`, `first_name`, `last_name`, `phone_number`) values ( 3, "Czesław", "Niemen", 123098123);
Insert into person( `id`, `first_name`, `last_name`, `phone_number`) values ( 4, "David", "Olney", 666999666);
UNLOCK TABLES;
