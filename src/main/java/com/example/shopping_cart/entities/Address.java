package com.example.shopping_cart.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "address")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String building;

    private  String street;

    @OneToOne(mappedBy = "address")
    private Customer customer;
    
}
