package com.ranjit.EcomKart.model;

import com.ranjit.EcomKart.domain.AccountStatus;
import com.ranjit.EcomKart.domain.USER_Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seller {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sellerName;

    private String mobile;
    @Column(unique = true,nullable = false)
    private String email;

    private String password;
    @Embedded
    private BusinessDetails businessDetails= new BusinessDetails();
    @Embedded
    private BankDetails bankDetails= new BankDetails();
    @OneToOne(cascade = CascadeType.ALL)
    private Address pickupAddress= new Address();

    private String GSTIN;

    private USER_Role role=USER_Role.ROLE_SELLER;

    private boolean isEmailVerified=false;

    private AccountStatus accountStatus= AccountStatus.PENDING_VERIFICATION;




}
