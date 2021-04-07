package com.microDemo.microserviceExample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microDemo.microserviceExample.dto.UserViewDTO;
import com.microDemo.microserviceExample.exception.NotFoundException;
import com.microDemo.microserviceExample.model.User;
import com.microDemo.microserviceExample.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Override
	public UserViewDTO getUserById(Long id) {
		final User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException("Not found exception"));
		return UserViewDTO.of(user);
	}

	@Override
	public List<User> getUsers() {

		return userRepository.findAll();

	}


}
