INSERT INTO BOOK (TITLE) VALUES ('book-3');
SET @book1 = LAST_INSERT_ID();
INSERT INTO BOOK (TITLE) VALUES ('book-4');
SET @book2 = LAST_INSERT_ID();

INSERT INTO CUSTOMER (first_name, last_name, customer_type) VALUES ("Thomas", "Vestergaard", 1);
INSERT INTO CUSTOMER (first_name, last_name, customer_type) VALUES ("Kasper", "Vestergaard", 2);
INSERT INTO CUSTOMER (first_name, last_name, customer_type) VALUES ("Sanne", "Vestergaard", 3);
INSERT INTO CUSTOMER (first_name, last_name, customer_type) VALUES ("Thorbjørn", "Vestergaard", 4);