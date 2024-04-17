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
		String password = obj.getPassword();
		String phone = obj.getPhone();
		String email = obj.getEmail();
		String name = obj.getName();

		if (email != null)
			entity.setEmail(email);
		if (phone != null)
			entity.setPhone(phone);
		if (name != null)
			entity.setName(name);
		if (password != null)
			entity.setPassword(password);
	}
}