//package listo.medlink.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.List;
//
//@Data
//@Entity
//@Table(name="doctor")
//public class Doctor {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @Column
//    private String name;
//
//    @Column
//    private String email;
//
//    @Column
//    private String password;
//
//    @Column
//    private String phone;
//
//    @Column
//    private String speciality;
//
//    @Column
//    private String clinic;
//
//    @OneToMany(mappedBy = "doctor")
//    private List<Appointment> doctorAppointments;
//
//    @OneToMany(mappedBy = "doctor")
//    private List<Review> reviews;
//
//    @OneToOne(mappedBy = "doctor")
//    private Profile profile;
//
//}
