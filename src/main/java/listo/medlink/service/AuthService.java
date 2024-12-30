package listo.medlink.service;

import listo.medlink.dto.LoginRequestBody;
import listo.medlink.dto.RegisterRequestBody;
import listo.medlink.model.User;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {

    public User register(RegisterRequestBody registerBody);

    public String login(LoginRequestBody loginBody);
}
