package com.ranjit.EcomKart.controller;

import com.ranjit.EcomKart.Repositery.UserRepositery;
import com.ranjit.EcomKart.model.User;
import com.ranjit.EcomKart.response.SignUpRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserRepositery userRepositery;
    @PostMapping("/signup")
    public ResponseEntity<User> createUserHandler(@RequestBody SignUpRequest request){

        User user= new User();
        user.setEmail(request.getEmail());
        user.setFullname(request.getFullname());
        userRepositery.save(user);
        return ResponseEntity.ok(user);

    }
}
