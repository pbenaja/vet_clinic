package ca.vetClinic.infra.mapper;

import ca.vetClinic.domain.model.Employee;
import ca.vetClinic.infra.entity.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

	@Mapping(target = "accountId", source = "account.id")
	Employee toDomain(EmployeeEntity employeeEntity);

	@Mapping(target = "account.id", source = "accountId")
	EmployeeEntity toEntity(Employee employee);
}
