package ca.vetClinic.infra.repository.impl;

import ca.vetClinic.domain.model.WorkingHours;
import ca.vetClinic.domain.repository.WorkingHoursRepository;
import ca.vetClinic.infra.mapper.WorkingHoursMapper;
import ca.vetClinic.infra.repository.jpa.WorkingHoursJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class WorkingHoursRepositoryImpl implements WorkingHoursRepository {
	private final WorkingHoursJpaRepository jpaRepository;
	private final WorkingHoursMapper mapper;
	@Override
	public List<WorkingHours> findAll() {
		return jpaRepository.findAll().stream().map(mapper::toDomain).toList();
	}
}
