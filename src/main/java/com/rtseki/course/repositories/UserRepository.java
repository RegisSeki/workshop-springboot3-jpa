package com.rtseki.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rtseki.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
