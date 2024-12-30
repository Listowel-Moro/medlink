package listo.medlink.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private User doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private User patient;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Enumerated(EnumType.STRING) // Store the enum as a string in the database
    @Column(name = "status")
    private AppointmentStatus status;

    @OneToOne(mappedBy = "appointment")
    private Review review;
}
