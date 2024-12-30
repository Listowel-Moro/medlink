package listo.medlink.controller;

import jakarta.validation.Valid;
import listo.medlink.dto.LoginRequestBody;
import listo.medlink.dto.LoginResponse;
import listo.medlink.dto.RegisterRequestBody;
import listo.medlink.mapper.UserMapper;
import listo.medlink.model.User;
import listo.medlink.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
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
    public RegisterRequestBody register(@Valid @RequestBody RegisterRequestBody requestBody) {
        return UserMapper.convertToRequestBody(authService.register(requestBody));
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginPatient(@RequestBody LoginRequestBody requestBody) {
        return ResponseEntity.ok(new LoginResponse(requestBody.getEmail(), authService.login(requestBody)));
    }
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
