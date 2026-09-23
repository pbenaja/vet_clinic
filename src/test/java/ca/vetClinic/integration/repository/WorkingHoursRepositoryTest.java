package ca.vetClinic.integration.repository;

import ca.vetClinic.base.AbstractContainerBase;
import ca.vetClinic.domain.model.WorkingHours;
import ca.vetClinic.domain.repository.WorkingHoursRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.DayOfWeek;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WorkingHoursRepositoryTest extends AbstractContainerBase {

	@Autowired
	private WorkingHoursRepository workingHoursRepository;

	@Test
	void givenFindAll_thenReturnFiveWorkingDays() {
		List<WorkingHours> workingHours = workingHoursRepository.findAll();
		assertEquals(5, workingHours.size());
	}

	@Test
	void givenFindAll_thenReturnNotNullList() {
		List<WorkingHours> workingHours = workingHoursRepository.findAll();
		assertNotNull(workingHours);
	}

	@Test
	void givenFindAll_thenOnlyContainWeekdays() {
		List<WorkingHours> workingHours = workingHoursRepository.findAll();
		Set<DayOfWeek> days = workingHours.stream().map(WorkingHours::getDayOfWeek).collect(Collectors.toSet());

		assertTrue(days.containsAll(Set.of(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY,
				DayOfWeek.FRIDAY)));
	}
	@Test
	void givenFindAll_thenDontContainSATURDAY() {
		List<WorkingHours> workingHours = workingHoursRepository.findAll();
		Set<DayOfWeek> days = workingHours.stream().map(WorkingHours::getDayOfWeek).collect(Collectors.toSet());

		assertFalse(days.contains(DayOfWeek.SATURDAY));
	}
	@Test
	void givenFindAll_thenDontContainSUNDAY() {
		List<WorkingHours> workingHours = workingHoursRepository.findAll();
		Set<DayOfWeek> days = workingHours.stream().map(WorkingHours::getDayOfWeek).collect(Collectors.toSet());

		assertFalse(days.contains(DayOfWeek.SUNDAY));
	}
}