package com.ecommerce.order_api.repository;

import com.ecommerce.order_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public class ProductRepository extends JpaRepository<Product, Long> {

}
