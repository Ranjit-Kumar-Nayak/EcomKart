package com.ranjit.EcomKart.Repositery;

import com.ranjit.EcomKart.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositery extends JpaRepository<User,Long> {

}
