package com.gl.EmpManagment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gl.EmpManagment.security.entity.User;
import com.gl.EmpManagment.service.UserService;


@RestController
public class EmployeeControlller {

	private UserService userService;
	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}

	@PostMapping("/addUser")
	public String  addUser(@RequestBody User user) {
		
		userService.save(user);
		return "done";
	}
}
