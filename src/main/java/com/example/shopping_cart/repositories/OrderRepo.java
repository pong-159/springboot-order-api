package com.example.shopping_cart.repositories;

import com.example.shopping_cart.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepo extends JpaRepository<Orders, Long> {
}
