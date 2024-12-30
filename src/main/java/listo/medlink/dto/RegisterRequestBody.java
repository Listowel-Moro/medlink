package listo.medlink.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class RegisterRequestBody {
    @NotNull(message = "Name is required")
    private String name;
    @NotNull(message = "Email is required")
    private String email;
    private String password;
    private String phone;
    private LocalDate birthdate;
    private String speciality;
    //@NotBlank(message = "Clinic is required")
    private String clinic;
}
