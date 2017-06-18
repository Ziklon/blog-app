package com.darkb.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 
 */

/**
 * @author wilber
 *
 */
@SpringBootApplication
@EnableConfigurationProperties
public class BlogApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SpringApplication.run(BlogApplication.class,args);
		
		
	}

}
