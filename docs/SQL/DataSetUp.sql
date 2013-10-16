INSERT INTO user(id, name, password, email, token, active, create_user_id, create_date, modify_user_id, modify_date) VALUES (1, 'root', PASSWORD('passw0rd'), 'lizhanhui@gmail.com', 'TOKEN', TRUE, 0, CURRENT_TIMESTAMP, 0, CURRENT_TIMESTAMP );

INSERT INTO user(id, name, password, email, token, active, create_user_id, create_date, modify_user_id, modify_date) VALUES (2, 'test', PASSWORD('passw0rd'), 'test@company.com', 'TOKEN', TRUE, 1, CURRENT_TIMESTAMP, 1, CURRENT_TIMESTAMP );

INSERT INTO user(id, name, password, email, token, active, create_user_id, create_date, modify_user_id, modify_date) VALUES (3, 'test2', PASSWORD('passw0rd'), 'test2@company.com', 'TOKEN', FALSE, 1, CURRENT_TIMESTAMP, 1, CURRENT_TIMESTAMP );