package com.ecommerce.order_api.repository;

import com.ecommerce.order_api.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
