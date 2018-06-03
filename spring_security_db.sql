INSERT INTO security_storage.users (name, password)
VALUES
  ('User', 'user'),
  ('Admin', 'admin');

INSERT INTO security_storage.role (name)
VALUES
  ('USER'),
  ('ADMIN');

INSERT INTO security_storage.user_role
(user_id, role_id)
VALUES
  ((SELECT id
    FROM security_storage.users
    WHERE name = 'User'), (SELECT id
                           FROM security_storage.role
                           WHERE name = 'USER')),
  ((SELECT id
    FROM security_storage.users
    WHERE name = 'Admin'), (SELECT id
                            FROM security_storage.role
                            WHERE name = 'ADMIN'));