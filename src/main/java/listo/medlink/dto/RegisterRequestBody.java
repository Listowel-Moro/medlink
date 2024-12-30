package listo.medlink.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RegisterRequestBody {
    private String name;
    private String email;
    private String password;
    private String phone;
    private LocalDate birthdate;
    private String speciality;
    private String clinic;
}
