package ca.vetClinic.domain.repository;

import ca.vetClinic.domain.model.TimeSlot;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface TimeSlotRepository {

	void save(TimeSlot timeSlot);

	TimeSlot findById(UUID id);

	List<TimeSlot> findByVeterinarianIdAndDate(UUID veterinarianId, LocalDate date);
}
