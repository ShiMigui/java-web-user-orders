package com.shimigui.WebServices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shimigui.WebServices.entities.User;
import com.shimigui.WebServices.repositories.UserRepository;
import com.shimigui.WebServices.services.exceptions.NotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Integer id) {
		return repository.findById(id).orElseThrow(() -> new NotFoundException(id));
	}

	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
	public User update(Integer id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
