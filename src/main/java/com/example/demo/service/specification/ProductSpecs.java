package com.example.demo.service.specification;

import org.springframework.data.jpa.domain.Specification;

import com.example.demo.domain.Product;
import com.example.demo.domain.Product_;

public class ProductSpecs {
    public static Specification<Product> nameLike(String name) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get(Product_.NAME), "%" + name + "%");
    }
}
