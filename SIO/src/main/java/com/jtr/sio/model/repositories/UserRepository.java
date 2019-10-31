package com.jtr.sio.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtr.sio.model.beans.User;

public interface UserRepository extends JpaRepository<User, String> {
	
}
