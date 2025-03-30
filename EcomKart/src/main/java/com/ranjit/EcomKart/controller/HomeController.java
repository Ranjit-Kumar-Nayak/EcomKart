package com.ranjit.EcomKart.controller;

import com.ranjit.EcomKart.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping("/")
    public ResponseEntity<ApiResponse> display(){
        ApiResponse response=new ApiResponse();
        response.setMessage("hey here i am ");
        response.setSuccess(true);
        response.setStatus(HttpStatus.OK);
        return  new ResponseEntity<>(response, HttpStatus.OK);
    }
}
