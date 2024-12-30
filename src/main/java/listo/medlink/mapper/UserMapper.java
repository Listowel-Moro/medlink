package listo.medlink.mapper;

import listo.medlink.dto.RegisterRequestBody;
import listo.medlink.model.User;

public class UserMapper {
    public static User convertToUser(RegisterRequestBody requestBody){
        return User.builder().name(requestBody.getName())
                .email(requestBody.getEmail())
                .password(requestBody.getPassword())
                .phone(requestBody.getPhone())
                .birthdate(requestBody.getBirthdate())
                .speciality(requestBody.getSpeciality())
                .clinic(requestBody.getClinic())
                .build();
    }

    public static RegisterRequestBody convertToRequestBody(User requestBody){
        return RegisterRequestBody.builder().name(requestBody.getName())
                .email(requestBody.getEmail())
                .phone(requestBody.getPhone())
                .birthdate(requestBody.getBirthdate())
                .speciality(requestBody.getSpeciality())
                .clinic(requestBody.getClinic())
                .build();
    }
}
