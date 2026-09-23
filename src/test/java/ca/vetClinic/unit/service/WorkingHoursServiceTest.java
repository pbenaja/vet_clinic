package ca.vetClinic.unit.service;

import ca.vetClinic.application.service.WorkingHoursServiceImpl;
import ca.vetClinic.domain.repository.WorkingHoursRepository;
import ca.vetClinic.domain.service.WorkingHoursService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class WorkingHoursServiceTest {

	@Mock
	private WorkingHoursRepository workingHoursRepository;

	private WorkingHoursService workingHoursService;

	@BeforeEach
	void setUp() {
		workingHoursService = new WorkingHoursServiceImpl(workingHoursRepository);
	}

	@Test
	void givenFindAll_thenCallRepositoryFindAll() {
		workingHoursService.findAll();
		verify(workingHoursRepository, times(1)).findAll();
	}
}