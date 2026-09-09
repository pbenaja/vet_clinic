package ca.vetClinic.domain.model;

import java.time.Instant;
import java.util.UUID;

public class IdempotencyKey {
	private UUID id;

	private boolean processed;
	private Instant createdAt;
	private Instant expiresAt;

	public IdempotencyKey(UUID id, Instant expiresAt) {
		this.id = id;
		this.processed = false;
		this.expiresAt = expiresAt;
	}

	public boolean isProcessed() {
		return processed;
	}

	public void setProcessed(boolean processed) {
		this.processed = processed;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Instant getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(Instant expiresAt) {
		this.expiresAt = expiresAt;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}
}
