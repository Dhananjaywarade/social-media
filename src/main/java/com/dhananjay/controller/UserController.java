package com.dhananjay.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dhananjay.models.User;
import com.dhananjay.repository.UserRepository;
import com.dhananjay.service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	UserRepository userRepository;
	
	
	@Autowired
	UserService userService;
	
	
	
	@GetMapping("/users")
	public List<User> getUsers() {
		List<User>users=userRepository.findAll();
		return users;
	}
	
	
	
	@GetMapping("/users/{userId}")
	public User getUsersById(@PathVariable("userId") Integer id) throws Exception {
		return userService.findUserById(id);	
	}
	
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		User savedUser=userService.registerUser(user);
		return savedUser;
	}
	
	
	
	@PutMapping("/users/{userId}")
	public User updateUser(@RequestBody User user,@PathVariable Integer userId) throws Exception {
		User UpdateUser=userService.updateUser(user, userId);
		return UpdateUser;	
	}
	
	@PutMapping("/users/{userId1}/{userId2}")
	public User followUserHandler(@PathVariable Integer userId1,@PathVariable Integer userId2) throws Exception {
		User user=userService.followUser(userId1, userId2);
		return user;
	}
	
	@GetMapping("/users/search")
	public List<User>searchUser(@RequestParam("query") String query){
		List<User>users=userService.searchUser(query);
		return users;
		
	}
} 	
