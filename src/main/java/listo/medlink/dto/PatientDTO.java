package listo.medlink.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PatientDTO {
    private String name;
    private String email;
    private String password;
    private String phone;
    private LocalDate birthdate;
}
