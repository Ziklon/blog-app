package com.darkbit.blog;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.darkbit.blog.user.User;
import com.darkbit.blog.user.UserDao;
import com.github.javafaker.Faker;

/**
 * 
 */

/**
 * @author wilber
 *
 */
@SpringBootApplication
@EnableConfigurationProperties
public class BlogApplication implements CommandLineRunner {

	@Autowired
	UserDao userDao;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		Faker faker = new Faker();
		Set<String> set = new HashSet<>();
		for (int i = 0; i < 1000; ++i) {
			final String firstname = faker.name().username();
			if(!set.contains(firstname)){
				userDao.save(new User(firstname, faker.crypto().sha1()));
				set.add(firstname);
			}
		}
	}

}
