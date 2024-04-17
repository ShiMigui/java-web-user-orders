package com.shimigui.WebServices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shimigui.WebServices.entities.User;
import com.shimigui.WebServices.repositories.UserRepository;

@Service
public class UserService extends EntityService<User> {
	public UserService(@Autowired UserRepository repository) {
		super(repository);
	}

	@Override
	protected void updateData(User entity, User obj) {

	}
}