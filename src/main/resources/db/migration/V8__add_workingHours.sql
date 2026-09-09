CREATE TABLE working_hours (
    id BINARY(16) NOT NULL,
    day_of_week VARCHAR(10) NOT NULL,
    opening_time TIME NOT NULL,
    closing_time TIME NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT uq_working_hours_day UNIQUE (day_of_week)
);

INSERT INTO working_hours (id, day_of_week, opening_time, closing_time) VALUES
    (UUID_TO_BIN(UUID()), 'MONDAY', '09:00:00', '17:00:00'),
    (UUID_TO_BIN(UUID()), 'TUESDAY', '09:00:00', '17:00:00'),
    (UUID_TO_BIN(UUID()), 'WEDNESDAY', '09:00:00', '17:00:00'),
    (UUID_TO_BIN(UUID()), 'THURSDAY', '09:00:00', '17:00:00'),
    (UUID_TO_BIN(UUID()), 'FRIDAY', '09:00:00', '17:00:00');