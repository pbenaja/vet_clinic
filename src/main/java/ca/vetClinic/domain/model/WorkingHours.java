package ca.vetClinic.domain.model;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.UUID;

public class WorkingHours {
	private UUID id;
	private DayOfWeek dayOfWeek;
	private LocalTime openingTime;
	private LocalTime closingTime;

	public WorkingHours(UUID id, DayOfWeek dayOfWeek, LocalTime openingTime, LocalTime closingTime) {
		this.id = id;
		this.dayOfWeek = dayOfWeek;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public LocalTime getOpeningTime() {
		return openingTime;
	}

	public LocalTime getClosingTime() {
		return closingTime;
	}
}
