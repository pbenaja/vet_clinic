package ca.vetClinic.application.service;

import ca.vetClinic.domain.model.TimeSlot;
import ca.vetClinic.domain.service.TimeSlotService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@Service
public class TimeSlotServiceImpl implements TimeSlotService {

	@Override
	public List<TimeSlot> generateAvailableSlots(UUID veterinarianId, UUID careOfferingId, LocalDate date) {
		return List.of();
	}

	@Override
	public boolean isSlotAvailable(UUID veterinarianId, LocalDate date, LocalTime startTime, LocalTime endTime) {
		return false;
	}

	@Override
	public boolean hasOverlap(UUID veterinarianId, LocalDate date, LocalTime startTime, LocalTime endTime) {
		return false;
	}

	@Override
	public void releaseSlot(UUID timeSlotId) {

	}
}
