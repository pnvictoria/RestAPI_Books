-- Додавання жанрів
INSERT INTO genres (name)
VALUES ('Фантастика'),
       ('Детектив'),
       ('Наукова література'),
       ('Роман');

-- Додавання статусів бронювання
INSERT INTO reservation_status (status)
VALUES ('ACTIVE'),
       ('RETURNED'),
       ('CANCELLED');

-- Додавання користувачів
INSERT INTO users (username, password, email, role)
VALUES ('admin', 'hashed_password_1', 'admin@example.com', 'LIBRARIAN'),
       ('user1', 'hashed_password_2', 'user1@example.com', 'READER'),
       ('user2', 'hashed_password_3', 'user2@example.com', 'READER');

-- Додавання книг
INSERT INTO books (title, author, genre_id, published_year, available)
VALUES ('1984', 'Джордж Орвелл', 1, 1949, TRUE),
       ('Шерлок Холмс', 'Артур Конан Дойл', 2, 1892, TRUE),
       ('Коротка історія часу', 'Стівен Гокінг', 3, 1988, TRUE),
       ('Гордість і упередження', 'Джейн Остін', 4, 1813, TRUE);

-- Додавання бронювань
INSERT INTO reservations (user_id, book_id, reserved_at, status_id)
VALUES (2, 1, NOW(), 1), -- Користувач 1 забронював книгу "1984"
       (3, 2, NOW(), 1);
-- Користувач 2 забронював "Шерлок Холмс"

-- Додавання бажаних книг
INSERT INTO wishlist (user_id, book_id, added_at)
VALUES (2, 3, NOW()), -- Користувач 1 хоче прочитати "Коротка історія часу"
       (3, 4, NOW()); -- Користувач 2 хоче прочитати "Гордість і упередження"
