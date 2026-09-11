package com.ecommerce.order_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItem extends JpaRepository<OrderItem, Long> {
}
