package com.example.shopping_cart.services;

import com.example.shopping_cart.repositories.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepo customerRepo;


}
