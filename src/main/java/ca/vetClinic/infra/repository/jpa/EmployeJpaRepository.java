package ca.vetClinic.infra.repository.jpa;

import ca.vetClinic.domain.enumerator.Role;
import ca.vetClinic.infra.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeJpaRepository extends JpaRepository<EmployeeEntity, UUID> {
	Optional<EmployeeEntity> findByAccountId(UUID id);
	List<EmployeeEntity> findByAccountRole(Role role);
}
