package com.example.shopping_cart.repositories;

import com.example.shopping_cart.entities.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepo extends JpaRepository<OrderDetail, Long> {
}
