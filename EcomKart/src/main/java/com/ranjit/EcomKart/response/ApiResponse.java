package com.ranjit.EcomKart.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {

    private String message;

    private boolean success;

    private HttpStatus status;


}
