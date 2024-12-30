package listo.medlink.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String bio;

    private List<String> qualifications;

    @Column(name = "profile_picture")
    private String profilePicture;

    @OneToOne
    @JoinColumn(name = "doctor_id")
    private User doctor;
}
