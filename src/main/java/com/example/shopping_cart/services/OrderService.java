package com.example.shopping_cart.services;

import com.example.shopping_cart.repositories.OrderRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepo orderRepo;
}
