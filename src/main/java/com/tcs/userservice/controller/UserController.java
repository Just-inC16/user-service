package com.tcs.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.userservice.entity.User;
import com.tcs.userservice.entity.UserDto;
import com.tcs.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping
	public User createUser(@RequestBody User addUser) {
		return userService.createUser(addUser);
	}

	@GetMapping
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@GetMapping("/{id}")
	public UserDto getUser(@PathVariable("id") Long id) {
		return userService.getUser(id);
	}

//	@GetMapping
//	public String helloWorld() {
//		return "Hello world 2";
//	}
}
