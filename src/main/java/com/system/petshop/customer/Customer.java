package com.system.petshop.customer;

import com.system.petshop.address.Address;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "customer")
@Table(name = "customer")
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String number;
    @Embedded
    private Address address;

    public Customer(String name, String email, String number, Address address, CustomerDTO data) {
        this.name = data.name();
        this.email = data.email();
        this.number = data.number();
        this.address = data.address();
    }
}
