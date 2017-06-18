package com.darkbit.blog.user;

import org.springframework.data.domain.Page;

public interface UserService {
	
	
	Page<User> list(final Integer page, final Integer size);
	
}
