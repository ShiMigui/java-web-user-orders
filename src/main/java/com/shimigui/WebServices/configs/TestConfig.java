package com.shimigui.WebServices.configs;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.shimigui.WebServices.entities.User;
import com.shimigui.WebServices.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User("Miguel Nascimento dos Santos", "miguel.nasto@gmail.com", "13996722405", "12345");
		User u2 = new User("Manuela D'ávilla", "manuela@gmail.com", "13999999999", "12345");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
