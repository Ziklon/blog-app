package com.darkbit.blog.user;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 * 
 * @author wilber
 *
 */
public interface UserDao extends JpaRepository<User, Long>{

	User findByUsername(String username);
	
	
}
