package ca.vetClinic.domain.repository;

import ca.vetClinic.domain.model.WorkingHours;

import java.time.DayOfWeek;

public interface WorkingHoursRepository {
	WorkingHours findByDayOfWeek(DayOfWeek dayOfWeek);
}
