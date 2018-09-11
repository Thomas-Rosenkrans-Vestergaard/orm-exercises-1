INSERT INTO BOOK (TITLE) VALUES ('book-3');
SET @book1 = LAST_INSERT_ID();
INSERT INTO BOOK (TITLE) VALUES ('book-4');
SET @book2 = LAST_INSERT_ID();

INSERT INTO CUSTOMER (first_name, last_name) VALUES ("Thomas", "Vestergaard");
INSERT INTO CUSTOMER (first_name, last_name) VALUES ("Kasper", "Vestergaard");
INSERT INTO CUSTOMER (first_name, last_name) VALUES ("Sanne", "Vestergaard");
INSERT INTO CUSTOMER (first_name, last_name) VALUES ("Thorbjørn", "Vestergaard");