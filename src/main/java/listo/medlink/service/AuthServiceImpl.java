package listo.medlink.service;

import jakarta.transaction.Transactional;
import listo.medlink.dto.LoginRequestBody;
import listo.medlink.dto.PatientDTO;
import listo.medlink.dto.RegisterRequestBody;
import listo.medlink.mapper.UserMapper;
import listo.medlink.model.User;
import listo.medlink.model.UserRole;
import listo.medlink.repository.UserRepository;
import listo.medlink.util.JwtHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RequiredArgsConstructor
@Service
public class AuthServiceImpl implements AuthService {
    private final UserRepository repository;
    private final BCryptPasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

//    public AuthServiceImpl(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder){
//        this.repository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
    @Override
    @Transactional
    public User register(RegisterRequestBody requestBody) {
        User newUser = UserMapper.convertToUser(requestBody);
        String password = this.passwordEncoder.encode(requestBody.getPassword());
        newUser.setPassword(password);
        newUser.setRole(UserRole.PATIENT);

        this.repository.save(newUser);
        return newUser;
    }

    public String login(LoginRequestBody requestBody) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(requestBody.getEmail(), requestBody.getPassword())
        );
        return JwtHelper.generateToken(requestBody.getEmail());
    }
}