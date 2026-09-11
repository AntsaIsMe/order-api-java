package com.ecommerce.order_api.repository;

import com.ecommerce.order_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByName_prodContaining(String name);
}
