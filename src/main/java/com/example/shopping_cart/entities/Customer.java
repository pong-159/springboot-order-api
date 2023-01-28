package com.example.shopping_cart.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;


    private Integer age;

    @Column( nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "customer")
//    @Column(insertable = false, updatable = false)
    private List<Orders> ordersList;
}
