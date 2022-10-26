package com.rtseki.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rtseki.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
