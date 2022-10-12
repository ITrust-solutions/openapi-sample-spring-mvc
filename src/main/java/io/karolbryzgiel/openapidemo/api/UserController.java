package io.karolbryzgiel.openapidemo.api;

import io.karolbryzgiel.openapidemo.model.User;
import io.karolbryzgiel.openapidemo.model.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {

    @Override
    public ResponseEntity<Void> createUser(UserDto userDto) {
        return null;
    }

    @Override
    public ResponseEntity<User> getUserById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> listUsers() {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateUser(UserDto userDto) {
        return null;
    }

}
