package ca.vetClinic.infra.mapper;

import ca.vetClinic.domain.model.WorkingHours;
import ca.vetClinic.infra.entity.WorkingHoursEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WorkingHoursMapper {
	WorkingHours toDomain(WorkingHoursEntity entity);
	WorkingHoursEntity toEntity(WorkingHours entity);
}
