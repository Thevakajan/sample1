package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserRepositories extends JpaRepository<User, Long> {

	User findOne(Long id);

	
	

}
