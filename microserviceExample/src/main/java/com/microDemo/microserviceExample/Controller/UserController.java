package com.microDemo.microserviceExample.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microDemo.microserviceExample.model.User;

import com.microDemo.microserviceExample.dto.UserViewDTO;
import com.microDemo.microserviceExample.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	// @Autowired
	// UserService userService;

	@GetMapping("user/{id}")

	public ResponseEntity<UserViewDTO> getUserById(@PathVariable Long id) {
		final UserViewDTO user = userService.getUserById(id);
		return ResponseEntity.ok(user);

	}
	
	@GetMapping("users")
	
	public List<User> getUsers() {
		
		return userService.getUsers();
		}
}
