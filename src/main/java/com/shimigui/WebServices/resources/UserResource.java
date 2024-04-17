package com.shimigui.WebServices.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shimigui.WebServices.entities.User;
import com.shimigui.WebServices.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource extends EntityResource<User> {
	public UserResource(@Autowired UserService service) {
		super(service);
	}
}
