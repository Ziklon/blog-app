package com.darkbit.blog.user;

import org.springframework.data.domain.Page;
/**
 * 
 * @author wilber
 *
 */
public interface UserService {
	
	
	Page<User> list(final Integer page, final Integer size);
	
}
