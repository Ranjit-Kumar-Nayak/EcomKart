package com.ranjit.EcomKart.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ranjit.EcomKart.model.Order;
import com.ranjit.EcomKart.model.Product;
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
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnore
    @ManyToOne
    private Order order;
    @ManyToOne
    private Product product;

    private String size;

    private int quantity;

    private Integer mrpPrice;

    private Integer sellingPrice;

    private Long userId;





}
