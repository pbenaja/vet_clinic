package ca.vetClinic.domain.repository;

import ca.vetClinic.domain.model.WorkingHours;

import java.util.List;

public interface WorkingHoursRepository {
	List<WorkingHours> findAll();
}
