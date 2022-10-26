package com.rtseki.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rtseki.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
