package ca.vetClinic.infra.repository.jpa;

import ca.vetClinic.infra.entity.WorkingHoursEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WorkingHoursJpaRepository extends JpaRepository<WorkingHoursEntity, UUID> {
}
