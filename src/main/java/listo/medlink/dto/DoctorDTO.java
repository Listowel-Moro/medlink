package listo.medlink.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DoctorDTO {
    private String name;
    private String email;
    private String password;
    private String phone;
    private String speciality;
    private String clinic;
}
