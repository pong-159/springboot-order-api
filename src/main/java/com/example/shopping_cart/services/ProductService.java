package com.example.shopping_cart.services;

import com.example.shopping_cart.repositories.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;
}
