CREATE TABLE idempotency_keys (
    id BINARY(16) NOT NULL,
    processed BOOLEAN NOT NULL DEFAULT FALSE,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    expires_at TIMESTAMP NOT NULL,
    PRIMARY KEY (id)
) DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

ALTER TABLE time_slots
    ADD COLUMN idempotency_key_id BINARY(16);

ALTER TABLE time_slots
    ADD CONSTRAINT fk_time_slots_idempotency_key
        FOREIGN KEY (idempotency_key_id) REFERENCES idempotency_keys(id);

ALTER TABLE bookings
    ADD COLUMN idempotency_key_id BINARY(16);

ALTER TABLE bookings
    ADD CONSTRAINT fk_bookings_idempotency_key
        FOREIGN KEY (idempotency_key_id) REFERENCES idempotency_keys(id);

ALTER TABLE bookings
    ADD CONSTRAINT uq_bookings_time_slot_id UNIQUE (time_slot_id);