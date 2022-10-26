package com.rtseki.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rtseki.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
