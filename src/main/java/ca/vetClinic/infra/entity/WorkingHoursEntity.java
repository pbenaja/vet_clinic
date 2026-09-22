package ca.vetClinic.infra.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "working_hours")
public class WorkingHoursEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "id", columnDefinition = "BINARY(16)", updatable = false, nullable = false)
	private UUID id;
	@Column(nullable = false, name = "day_of_week")
	private String dayOfWeek;
	@Column(name = "opening_time", nullable = false)
	private LocalTime openingTime;
	@Column(name = "closing_time", nullable = false)
	private LocalTime closingTime;

	public WorkingHoursEntity() {

	}
	public WorkingHoursEntity(String dayOfWeek, LocalTime openingTime, LocalTime closingTime) {
		this.dayOfWeek = dayOfWeek;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
	}
}
