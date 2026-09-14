package com.ecommerce.order_api.repository;

import com.ecommerce.order_api.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByEmailCustomer(String email);
    Optional<Customer> findByFullNameCustomerContainingIgnoreCase(String nom);
}
