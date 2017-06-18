package com.darkbit.blog.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	public Page<User> list(final Integer page, final Integer size) {
		return userDao.findAll(new PageRequest(page,size));

	}

}
