//package listo.medlink.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Data
//@Entity
//@Table(name="patient")
//public class Patient {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @Column
//    private String name;
//
//    @Column(unique = true)
//    private String email;
//
//    @Column
//    private String password;
//
//    @Column(unique = true)
//    private String phone;
//
//    @Column(nullable = true)
//    private LocalDate birthdate;
//
//    @OneToMany(mappedBy = "patient")
//    private List<Appointment> patientAppointments;
//}
