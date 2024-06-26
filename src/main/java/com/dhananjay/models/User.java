package com.dhananjay.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	private String gender;
	
	private List<Integer> followers;
	
	private List<Integer> followings;
	
	
	
	public User() {
		
	}

	
	public User(Integer id, String firstName, String lastName, String email, String password, String gender,
			List<Integer> followers, List<Integer> followings) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.followers = followers;
		this.followings = followings;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public List<Integer> getFollowers() {
		return followers;
	}


	public void setFollowers(List<Integer> followers) {
		this.followers = followers;
	}


	public List<Integer> getFollowings() {
		return followings;
	}


	public void setFollowings(List<Integer> followings) {
		this.followings = followings;
	}


	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", gender=" + gender + ", followers=" + followers + ", followings="
				+ followings + "]";
	}

			
}
