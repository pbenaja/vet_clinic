package ca.vetClinic.domain.service;

import ca.vetClinic.domain.model.TimeSlot;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

public interface TimeSlotService {

	List<TimeSlot> generateAvailableSlots(UUID veterinarianId, UUID careOfferingId, LocalDate date);

	boolean isSlotAvailable(UUID veterinarianId, LocalDate date, LocalTime startTime, LocalTime endTime);

	boolean hasOverlap(UUID veterinarianId, LocalDate date, LocalTime startTime, LocalTime endTime);

	void releaseSlot(UUID timeSlotId);
}