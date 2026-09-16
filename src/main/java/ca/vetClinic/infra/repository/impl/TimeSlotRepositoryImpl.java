package ca.vetClinic.infra.repository.impl;

import ca.vetClinic.domain.exception.NotFoundException;
import ca.vetClinic.domain.model.TimeSlot;
import ca.vetClinic.domain.repository.TimeSlotRepository;
import ca.vetClinic.infra.mapper.TimeSlotMapper;
import ca.vetClinic.infra.repository.jpa.TimeSlotJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class TimeSlotRepositoryImpl implements TimeSlotRepository {
	private final TimeSlotJpaRepository jpaRepository;
	private final TimeSlotMapper mapper;
	@Override
	public void save(TimeSlot timeSlot) {
		jpaRepository.save(mapper.toEntity(timeSlot));
	}

	@Override
	public TimeSlot findById(UUID id) {
		return jpaRepository.findById(id).map(mapper::toDomain).orElseThrow(() -> new NotFoundException("id"));
	}

	@Override
	public List<TimeSlot> findByVeterinarianIdAndDate(UUID veterinarianId, LocalDate date) {
		return jpaRepository.findByVetenerianIdAndDate(veterinarianId, date).stream().map(mapper::toDomain).toList();
	}
}
