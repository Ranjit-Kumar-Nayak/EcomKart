package com.ranjit.EcomKart.controller;

import com.ranjit.EcomKart.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ResponseEntity<ApiResponse> strater(){
        ApiResponse apiResponse= new ApiResponse("hey this is Ranjit",true);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
}
