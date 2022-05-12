package com.example.test;

import com.example.test.model.entity.Post;
import com.example.test.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {

	@Autowired
	public PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(postRepository.findLongPost().get(0).getMessage());

	}
}
