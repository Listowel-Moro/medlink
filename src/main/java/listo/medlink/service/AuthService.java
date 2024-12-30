package listo.medlink.service;

import listo.medlink.dto.RegisterRequestBody;
import listo.medlink.model.User;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {

    public User register(RegisterRequestBody registerBody);

    public User login();
}
