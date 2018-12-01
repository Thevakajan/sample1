package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repositories.UserRepositories;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserRepositories userRepositories;
	
	@GetMapping("/users")
	public List<User>getUser(){
		return userRepositories.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id) {
		return userRepositories.findOne(id);
	}
}
