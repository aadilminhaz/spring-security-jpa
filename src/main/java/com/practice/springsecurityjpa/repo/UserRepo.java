package com.practice.springsecurityjpa.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.springsecurityjpa.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	Optional<User> findByUsername(String username);
}
