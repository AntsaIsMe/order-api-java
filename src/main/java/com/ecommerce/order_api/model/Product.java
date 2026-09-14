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
    private long idProd;

    @Column(nullable = false)
    private String nameProd;

    private String descriptionProd;

    @Column(nullable = false)
    private Double priceProd;

    @Column(nullable = false)
    private Integer stockQuantityProd;

}
