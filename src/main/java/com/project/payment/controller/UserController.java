package com.project.payment.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.payment.model.User;
import com.project.payment.service.UserService;

@RestController
@RequestMapping("/api/users/")
public class UserController {  

	private UserService service;

	public UserController(UserService service) {
 		this.service = service;
	}


	@GetMapping("{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		return ResponseEntity.ok().body(service.findById(id));	
	}
	

	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok().body(service.findAll());
	}
}
