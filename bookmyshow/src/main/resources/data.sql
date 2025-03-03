INSERT INTO venue (name, city) VALUES
                                                   ('PVR', 'Jal'), ('MBD', 'Delhi');

INSERT INTO hall (venue_id) VALUES
                                          (1), ( 1), ( 2);

INSERT INTO hall_seats (hall_col, hall_row, seat_type) VALUES
                                                                           (1, 1, 1), (1, 2, 1), (1, 3, 1);

INSERT INTO movie (duration, name) VALUES
                                                                    (180,'kal ho na ho'),
                                                                    (200,'baahubali');

INSERT INTO movie_show (movie_id, hall_id, start_time) VALUES
                                                                       (1, 1, '2020-08-10 12:00:00'),
                                                                       (2, 1, '2020-08-11 12:00:00'),
                                                                       (1, 2, '2020-08-11 12:00:00');

INSERT INTO show_seat (price, show_seat_status, seat_id, show_id) VALUES
                                                                      (100, 1, 1, 1), (120, 1, 2, 1), (140, 1, 3, 1);