package com.letsstartcoding.springbootrestapioauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letsstartcoding.springbootrestapioauth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findOneByUsername(String username);
}
