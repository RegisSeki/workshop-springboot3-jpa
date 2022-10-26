package com.rtseki.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rtseki.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
