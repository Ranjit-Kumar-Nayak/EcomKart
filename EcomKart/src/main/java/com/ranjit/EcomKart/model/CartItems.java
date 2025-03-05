package com.ranjit.EcomKart.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class CartItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JsonIgnore // when we fetch cart item from frontend this will not fetch
    private Cart cart;

    private Product product;

    private String size;

    private int quantity =1;

    private Integer mrpPrice;

    private Integer sellingPrice;


    private Long userId;



}
