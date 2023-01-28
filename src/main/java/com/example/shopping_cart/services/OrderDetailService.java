package com.example.shopping_cart.services;

import com.example.shopping_cart.repositories.OrderDetailsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderDetailService {

    private final OrderDetailsRepo orderDetailsRepo;
}
