package ca.vetClinic.domain.service;

import java.time.Instant;
import java.util.UUID;

public interface IdempotencyService {
	void registerKey(UUID idempotencyKey, Instant expiresAt);
}
