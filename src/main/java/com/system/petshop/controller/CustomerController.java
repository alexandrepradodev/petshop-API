package com.system.petshop.controller;

import com.system.petshop.customer.Customer;
import com.system.petshop.customer.CustomerDTO;
import com.system.petshop.customer.CustomerRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class CustomerController {

    private CustomerRepository repository;

    @PostMapping("/cliente")
    @Transactional
    public void register(@RequestBody CustomerDTO data) {
        repository.save(new Customer(data.name(), data.email(), data.number(), data.address(), data));

    }

    @GetMapping
    public void get(){

    }

}
