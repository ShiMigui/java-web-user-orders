package com.shimigui.WebServices.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shimigui.WebServices.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1, "Miguel Nascimento", "miguel@gmail.com", "+5513996722405", "123");
		return ResponseEntity.ok().body(u);
	}
}
