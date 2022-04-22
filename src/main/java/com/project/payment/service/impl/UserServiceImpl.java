package com.project.payment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.payment.exception.ObjectNotFoundException;
import com.project.payment.model.User;
import com.project.payment.repository.UserRepository;
import com.project.payment.service.UserService;

@Service
public class UserServiceImpl implements UserService {
  
	@Autowired
	UserRepository repository;

	@Override
	public User findById(Long id) {
 		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Id "+id+" Não encontrado"));
	}

	@Override
	public List<User> findAll() {
 		return repository.findAll();
	}
}
