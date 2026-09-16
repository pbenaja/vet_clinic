package ca.vetClinic.infra.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "time_slots")
public class TimeSlotEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "id", columnDefinition = "BINARY(16)", updatable = false, nullable = false)
	private UUID id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vetenerian_id", nullable = false, columnDefinition = "BINARY(16)")
	private EmployeeEntity vetenerian;
	@Column(name = "start_time", nullable = false)
	private LocalTime startTime;

	@Column(name = "end_time", nullable = false)
	private LocalTime endTime;

	@Column(name = "date", nullable = false)
	private LocalDate date;

	@Column(name = "available", nullable = false)
	private boolean available;

	public TimeSlotEntity() {
	}

	public TimeSlotEntity(LocalTime startTime, LocalTime endTime, LocalDate date, boolean available) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.date = date;
		this.available = available;
	}
}