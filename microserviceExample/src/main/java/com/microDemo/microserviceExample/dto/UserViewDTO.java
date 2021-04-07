package com.microDemo.microserviceExample.dto;

import java.io.Serializable;

import com.microDemo.microserviceExample.model.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class UserViewDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String firstName;
	private final String lastName;

	public UserViewDTO(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public static UserViewDTO of(User user) {

		return new UserViewDTO(user.getFirstName(), user.getLastName());
	}

}
