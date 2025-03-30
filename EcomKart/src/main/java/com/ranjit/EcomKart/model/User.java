package com.ranjit.EcomKart.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ranjit.EcomKart.domain.USER_Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    @JsonProperty("pass_word") // when the java variable different from the json data in that case we can use
//    @JsonProperty(index = 2) // we can arrange the column of that table by the help of INDEX
    private String password;

    private String email;

    private  String fullname;

    private String mobile;

    private USER_Role role=USER_Role.ROLE_CUSTOMER;
    @OneToMany
    private Set<Address> addresses=new HashSet<>();
    @ManyToMany
    @JsonIgnore
    private Set<Coupon> usedCoupons= new HashSet<>();


}
