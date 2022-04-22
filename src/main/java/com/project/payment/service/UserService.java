package com.project.payment.service;

import java.util.List;

import com.project.payment.model.User;

public interface UserService {
  
	User findById(Long id);
	List<User> findAll();
}
