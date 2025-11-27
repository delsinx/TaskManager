CREATE TABLE tasks (
                       id              BIGSERIAL PRIMARY KEY,
                       title           VARCHAR(150) NOT NULL,
                       description     TEXT,
                       status          VARCHAR(30) NOT NULL,
                       due_date        DATE,
                       user_id         BIGINT NOT NULL,
                       created_at      TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

                       CONSTRAINT fk_user
                           FOREIGN KEY (user_id)
                               REFERENCES users(id)
                               ON DELETE CASCADE
);