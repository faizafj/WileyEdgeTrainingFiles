DROP DATABASE booksDb;
-- -- creates a database
CREATE DATABASE IF NOT EXISTS booksDb;
-- uses the wiley database
USE booksDb;


CREATE TABLE IF NOT EXISTS Books (
    bookId INT PRIMARY KEY,
    bookName  VARCHAR(100),
    authorName VARCHAR(50),
    numCopies INT
);

INSERT INTO Books VALUES 
(1, "Harry Potter", "JK Rowling", 20),
(2, "Hunger Games", "Susanne Collins", 15),
(3, "Me Before You", "Jojo Mayers", 22),
(4, "Divergent", "Veronica Roth", 18),
(5, "Twilight", "Stephanie Meyer", 19);


select * from Books;