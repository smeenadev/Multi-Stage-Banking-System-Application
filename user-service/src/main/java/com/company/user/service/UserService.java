package com.company.user.service;

import java.util.List;

import com.company.user.dto.UserRequest;
import com.company.user.dto.UserResponse;

public interface UserService {

	public UserResponse createUser(UserRequest request);

	public List<UserResponse> getAllUsers();

	public UserResponse getUser(Long id);

	public UserResponse updateRole(Long id, UserRequest request);

	public String deleteUser(Long id);

}
