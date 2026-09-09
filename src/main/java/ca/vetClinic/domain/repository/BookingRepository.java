package ca.vetClinic.domain.repository;

import ca.vetClinic.domain.model.Booking;

import java.util.UUID;

public interface BookingRepository {
	void save(Booking booking);

	Booking findById(UUID id);

	Booking findByTimeSlotId(UUID timeSlotId);
}
