package com.dhananjay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhananjay.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findByEmail(String email);
	
	public List<User>searchUser();
}
