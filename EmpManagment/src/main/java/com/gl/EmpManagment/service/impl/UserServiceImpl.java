package com.gl.EmpManagment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.EmpManagment.repository.UserRepository;
import com.gl.EmpManagment.security.entity.User;
import com.gl.EmpManagment.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User save(User user) {
	
		return userRepo.save(user);
	}

}
