package listo.medlink.controller;

import listo.medlink.dto.RegisterRequestBody;
import listo.medlink.model.User;
import listo.medlink.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/auth")
//@AllArgsConstructor
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public User register(@RequestBody RegisterRequestBody requestBody) {
        return authService.register(requestBody);
    }

//    @PostMapping("/login/patient")
//    public Patient loginPatient(@RequestBody PatientDTO patientDTO) {
//        return patientService.login(patientDTO);
//    }
//
//    @PostMapping("/register/doctor")
//    public Doctor registerDoctor(@RequestBody DoctorDTO doctorDTO) {
//        return doctorService.register(doctorDTO);
//    }
//
//    @PostMapping("/login/doctor")
//    public Doctor loginDoctor(@RequestBody DoctorDTO doctorDTO) {
//        return doctorService.login(doctorDTO);
//    }
}
