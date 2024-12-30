package listo.medlink.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String review;

    @Column
    private int rating;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private User doctor;

    @OneToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private User patient;
}
