package africa.semicolon.mogbo.services;

import africa.semicolon.mogbo.dto.requests.LoginUserRequest;
import africa.semicolon.mogbo.dto.requests.RegisterUserRequest;
import africa.semicolon.mogbo.dto.responses.LoginUserResponse;
import africa.semicolon.mogbo.dto.responses.RegisterUserResponse;

public interface UserServices {

    RegisterUserResponse registerUser(RegisterUserRequest request);

    LoginUserResponse loginUser(LoginUserRequest loginUserRequest);

    //void loginUser(String email, String password);
}
