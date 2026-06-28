package com.company.auth.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.company.auth.entity.User;
import com.company.auth.repository.UserRepository;

@Component
public class DataInitializer implements CommandLineRunner {

	private final UserRepository repository;
	private final PasswordEncoder encoder;

	public DataInitializer(UserRepository repository, PasswordEncoder encoder) {

		this.repository = repository;
		this.encoder = encoder;
	}

	@Override
	public void run(String... args) {

		if (repository.count() == 0) {

			repository.save(new User("admin", encoder.encode("admin123"), "ADMIN"));

			repository.save(new User("officer", encoder.encode("officer123"), "OFFICER"));

			repository.save(new User("customer", encoder.encode("customer123"), "CUSTOMER"));
		}
	}
}