package listo.medlink.service;

import listo.medlink.dto.PatientDTO;
import listo.medlink.dto.RegisterRequestBody;
import listo.medlink.model.User;
import listo.medlink.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RequiredArgsConstructor
@Service
public class AuthServiceImpl implements AuthService {
    private final UserRepository repository;
    //private final BCryptPasswordEncoder passwordEncoder;

//    public AuthServiceImpl(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder){
//        this.repository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
    @Override
    public User register(RegisterRequestBody requestBody) {
        User newUser = new User();

        newUser.setName(requestBody.getName());
        newUser.setEmail(requestBody.getEmail());
        newUser.setPhone(requestBody.getPhone());
        newUser.setBirthdate(requestBody.getBirthdate());
        //String password = this.passwordEncoder.encode(requestBody.getPassword());
        newUser.setPassword(requestBody.getPassword());
        this.repository.save(newUser);

        return newUser;
    }

    public User login() {
        return null;
    }
}