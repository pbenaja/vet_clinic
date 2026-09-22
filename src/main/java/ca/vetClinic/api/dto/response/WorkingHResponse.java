package ca.vetClinic.api.dto.response;

import jakarta.validation.constraints.NotNull;

import java.time.DayOfWeek;
import java.time.LocalTime;

public record WorkingHResponse(@NotNull DayOfWeek dayOfWeek, @NotNull LocalTime openingTime,
		@NotNull LocalTime closingTime) {
}
