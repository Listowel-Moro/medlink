package listo.medlink.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column(unique = true)
    private String email;

    @Column
    private String password;

    @Column(unique = true)
    private String phone;

    @Column(nullable = true)
    private LocalDate birthdate;

    @Column
    private String speciality;

    @Column
    private String clinic;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false, columnDefinition = "varchar(255) default 'PATIENT'")
    private UserRole role;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> patientAppointments;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> doctorAppointments;

    @OneToMany(mappedBy = "doctor")
    private List<Review> reviews;

    @OneToOne(mappedBy = "doctor")
    private Profile profile;
}
