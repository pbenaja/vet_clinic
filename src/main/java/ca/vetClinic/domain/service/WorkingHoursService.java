package ca.vetClinic.domain.service;

import ca.vetClinic.domain.model.WorkingHours;

import java.time.DayOfWeek;

public interface WorkingHoursService {
	WorkingHours findByDayOfWeek(DayOfWeek dayOfWeek);
}
