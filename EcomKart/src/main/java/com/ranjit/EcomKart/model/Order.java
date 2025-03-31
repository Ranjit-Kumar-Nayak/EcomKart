package com.ranjit.EcomKart.model;

import com.ranjit.EcomKart.domain.AccountStatus;
import com.ranjit.EcomKart.domain.OrderItem;
import com.ranjit.EcomKart.domain.OrderStatus;
import com.ranjit.EcomKart.domain.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String orderId;

    @ManyToOne
    private User user;

    private Long sellerId;

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<OrderItem> orderItems= new ArrayList<>();
    @ManyToOne
    private Address shippingAddress;

    private double totalMrpPrice;

    private Integer totalSellingPrice;

    private Integer discount;

    private OrderStatus orderStatus;

    private int totalItem;

    private PaymentStatus paymentStatus= PaymentStatus.PENDING;

    private LocalDateTime orderDate= LocalDateTime.now();

    private LocalDateTime deliveryDate=orderDate.plusDays(7);







}
