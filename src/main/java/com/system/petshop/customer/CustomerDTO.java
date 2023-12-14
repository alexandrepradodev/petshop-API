package com.system.petshop.customer;

import com.system.petshop.address.Address;

public record CustomerDTO(String name, String email, String number, Address address) {
}
