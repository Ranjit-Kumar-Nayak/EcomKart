package com.ranjit.EcomKart.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class SignUpRequest {
    private String email;

    private String fullname;

    private String otp;


}
