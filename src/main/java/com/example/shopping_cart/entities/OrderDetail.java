package com.example.shopping_cart.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Table(name = "order_detail")
@Data
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "order_id"
    )
    private Orders order;

    @ManyToOne
    @JoinColumn(
            name = "product_id"
    )
    private Product product;

    private Integer quantity;


}
