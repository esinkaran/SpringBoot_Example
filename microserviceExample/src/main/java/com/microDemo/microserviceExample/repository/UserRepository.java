package com.microDemo.microserviceExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microDemo.microserviceExample.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
