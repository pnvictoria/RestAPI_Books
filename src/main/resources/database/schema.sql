CREATE TABLE users
(
    id         BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    username   VARCHAR(100) UNIQUE                                 NOT NULL,
    password   VARCHAR(255)                                        NOT NULL,
    email      VARCHAR(255) UNIQUE                                 NOT NULL,
    role       VARCHAR(20) CHECK (role IN ('LIBRARIAN', 'READER')) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE genres
(
    id   BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE books
(
    id             BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    title          VARCHAR(255) NOT NULL,
    author         VARCHAR(255) NOT NULL,
    genre_id       INT          REFERENCES genres (id) ON DELETE SET NULL,
    published_year INT,
    available      BOOLEAN   DEFAULT TRUE,
    created_at     TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE reservation_status
(
    id     BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    status VARCHAR(20) UNIQUE NOT NULL
);


CREATE TABLE reservations
(
    id          BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    user_id     INT REFERENCES users (id) ON DELETE CASCADE,
    book_id     INT REFERENCES books (id) ON DELETE CASCADE,
    reserved_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status_id   INT REFERENCES reservation_status (id) ON DELETE CASCADE
);


CREATE TABLE reading_history
(
    id          BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    user_id     INT REFERENCES users (id) ON DELETE CASCADE,
    book_id     INT REFERENCES books (id) ON DELETE CASCADE,
    taken_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    returned_at TIMESTAMP NULL
);


CREATE TABLE wishlist
(
    id       BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    user_id  INT REFERENCES users (id) ON DELETE CASCADE,
    book_id  INT REFERENCES books (id) ON DELETE CASCADE,
    added_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    UNIQUE (user_id, book_id) -- Один користувач не може додати одну книгу двічі
);


