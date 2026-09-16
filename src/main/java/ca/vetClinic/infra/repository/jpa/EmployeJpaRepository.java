package ca.vetClinic.infra.repository.jpa;

import ca.vetClinic.domain.enumerator.Role;
import ca.vetClinic.infra.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EmployeJpaRepository extends JpaRepository<EmployeeEntity, UUID> {
	Optional<EmployeeEntity> findByAccountId(UUID id);
	Optional<EmployeeEntity> findByAccountRole(Role role);
}
