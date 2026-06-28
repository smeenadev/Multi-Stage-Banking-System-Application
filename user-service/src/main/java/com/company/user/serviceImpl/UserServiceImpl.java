package com.company.user.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.company.user.dto.UserRequest;
import com.company.user.dto.UserResponse;
import com.company.user.entity.User;
import com.company.user.repository.UserRepository;
import com.company.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository repository;

	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public UserResponse createUser(UserRequest request) {
		User user = new User();
		user.setUsername(request.getUsername());
		user.setPassword(request.getPassword());
		user.setRole(request.getRole());
		User saved = repository.save(user);
		return new UserResponse(saved.getId(), saved.getUsername(), saved.getRole());
	}

	@Override
	public List<UserResponse> getAllUsers() {
		return repository.findAll()
				.stream()
				.map(user -> new UserResponse(user.getId(), user.getUsername(), user.getRole()))
				.collect(Collectors.toList());
	}

	@Override
	public UserResponse getUser(Long id) {
		User user = repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
		return new UserResponse(user.getId(), user.getUsername(), user.getRole());
	}

	@Override
	public UserResponse updateRole(Long id, UserRequest request) {
		User user = repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
		user.setRole(request.getRole());
		user.setUsername(request.getUsername());
		user.setPassword(request.getPassword());
		User updated = repository.save(user);
		return new UserResponse(updated.getId(), updated.getUsername(), updated.getRole());
	}

	@Override
	public String deleteUser(Long id) {
		repository.deleteById(id);
		return "user deleted successfully!!!!";
	}
}