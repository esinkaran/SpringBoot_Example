package com.microDemo.microserviceExample.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.microDemo.microserviceExample.dto.UserViewDTO;
import com.microDemo.microserviceExample.model.User;

public interface UserService {
	UserViewDTO getUserById(Long id);
	List<User> getUsers();
}
