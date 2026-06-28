package com.company.user.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.user.dto.UserRequest;
import com.company.user.dto.UserResponse;
import com.company.user.service.UserService;

@RestController
@RequestMapping("/user-service")
public class UserController {

	private UserService service;

	public UserController(UserService service) {
		this.service = service;
	}

	@PostMapping("/create/user")
	public UserResponse createUser(@RequestBody UserRequest request) {
		return service.createUser(request);
	}

	@GetMapping("/getall/users")
	public List<UserResponse> getUsers() {
		return service.getAllUsers();
	}

	@GetMapping("/get/userById")
	public UserResponse getUser(@RequestParam Long id) {
		return service.getUser(id);
	}

	@PutMapping("/update/user")
	public UserResponse updateRole(@RequestParam Long id, @RequestBody UserRequest request) {
		return service.updateRole(id, request);
	}

	@DeleteMapping("/delete/user")
	public void deleteUser(@RequestParam Long id) {
		service.deleteUser(id);
	}
}