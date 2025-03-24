-- Створення таблиці для Books
CREATE TABLE books
(
    isbn VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    auth VARCHAR(255) NOT NULL
);
