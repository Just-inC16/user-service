package com.tcs.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.userservice.entity.User;
import com.tcs.userservice.entity.UserDto;
import com.tcs.userservice.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User createUser(User addUser) {
		return userRepository.save(addUser);
	}

	public List<User> getUsers() {
		return userRepository.findAll();
	}

	public UserDto getUser(Long id) {
		User currentUser = userRepository.getReferenceById(id);
		UserDto user = new UserDto(currentUser.getId(), currentUser.getName(), currentUser.getAddress());
		return user;
	}
}
