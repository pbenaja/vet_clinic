package ca.vetClinic.application.service;

import ca.vetClinic.domain.model.WorkingHours;
import ca.vetClinic.domain.repository.WorkingHoursRepository;
import ca.vetClinic.domain.service.WorkingHoursService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkingHoursServiceImpl implements WorkingHoursService {
	private final WorkingHoursRepository workingHoursRepository;
	@Override
	public List<WorkingHours> findAll() {
		return workingHoursRepository.findAll();
	}
}
