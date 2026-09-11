package com.ecommerce.order_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_prod;

    @Column(nullable = false)
    private String name_prod;

    private String description_prod;

    @Column(nullable = false)
    private Double price_prod;

    @Column(nullable = false)
    private Integer stockQuantity_prod;

}
