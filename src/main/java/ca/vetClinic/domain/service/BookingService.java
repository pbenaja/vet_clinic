package ca.vetClinic.domain.service;

import ca.vetClinic.domain.model.Booking;

import java.util.UUID;

public interface BookingService {
	Booking createBooking(UUID timeSlotId, UUID userId, UUID petId, UUID serviceId, String notes, UUID idempotencyKey);

	void cancelBooking(UUID bookingId);
}
