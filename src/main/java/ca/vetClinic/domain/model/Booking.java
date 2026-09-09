package ca.vetClinic.domain.model;

import jakarta.persistence.Column;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.UUID;

public class Booking {
	private UUID id;
	private UUID userId;
	private UUID serviceId;
	private UUID petId;
	private UUID veterinarianId;
	private UUID timeSlotId;
	private String status;
	private String notes;
	private Instant bookingCreatedAt;
	private Instant bookingUpdatedAt;

	public Booking(UUID userId, UUID vetId, UUID serviceId, UUID petId, UUID timeSlotId, String status, String notes) {
		this.userId = userId;
		this.serviceId = serviceId;
		this.petId = petId;
		this.timeSlotId = timeSlotId;
		this.status = status;
		this.notes = notes;
		this.veterinarianId = vetId;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public UUID getServiceId() {
		return serviceId;
	}

	public void setServiceId(UUID serviceId) {
		this.serviceId = serviceId;
	}

	public UUID getPetId() {
		return petId;
	}

	public void setPetId(UUID petId) {
		this.petId = petId;
	}

	public UUID getVeterinarianId() {
		return veterinarianId;
	}

	public void setVeterinarianId(UUID veterinarianId) {
		this.veterinarianId = veterinarianId;
	}

	public UUID getTimeSlotId() {
		return timeSlotId;
	}

	public void setTimeSlotId(UUID timeSlotId) {
		this.timeSlotId = timeSlotId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Instant getBookingCreatedAt() {
		return bookingCreatedAt;
	}

	public void setBookingCreatedAt(Instant bookingCreatedAt) {
		this.bookingCreatedAt = bookingCreatedAt;
	}

	public Instant getBookingUpdatedAt() {
		return bookingUpdatedAt;
	}

	public void setBookingUpdatedAt(Instant bookingUpdatedAt) {
		this.bookingUpdatedAt = bookingUpdatedAt;
	}
}
