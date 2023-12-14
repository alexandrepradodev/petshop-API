package com.system.petshop.address;

public record AddressDTO(
        String street,
        String neighborhood,
        String zipCode,
        String number,
        String complement,
        String city,
        String state) {
}
