package com.web.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.api.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
