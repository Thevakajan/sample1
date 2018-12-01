package com.example.demo.reposi;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitiets.User;

public interface UserRepository   extends JpaRepository<User, Long> {

	



}
