package ca.vetClinic.infra.repository.jpa;

import ca.vetClinic.infra.entity.TimeSlotEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface TimeSlotJpaRepository extends JpaRepository<TimeSlotEntity, UUID> {
	List<TimeSlotEntity> findByVetenerianIdAndDate(UUID veterinarianId, LocalDate date);
}
