package com.shimigui.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shimigui.WebServices.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
