package com.tcs.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.userservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
