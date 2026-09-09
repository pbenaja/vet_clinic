package ca.vetClinic.domain.repository;

import ca.vetClinic.domain.model.IdempotencyKey;

import java.util.UUID;

public interface IdempotencyKeyRepository {
	void save(IdempotencyKey idempotencyKey);

	IdempotencyKey findById(UUID id);
}
