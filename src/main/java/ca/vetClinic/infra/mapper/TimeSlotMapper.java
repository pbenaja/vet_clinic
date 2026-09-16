package ca.vetClinic.infra.mapper;

import ca.vetClinic.domain.model.TimeSlot;
import ca.vetClinic.infra.entity.TimeSlotEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TimeSlotMapper {
	@Mapping(target = "vetenerianId", source = "vetenerian.id")
	TimeSlot toDomain(TimeSlotEntity timeSlotEntity);
	@Mapping(target = "vetenerian.id", source = "vetenerianId ")
	TimeSlotEntity toEntity(TimeSlot timeSlot);
}
