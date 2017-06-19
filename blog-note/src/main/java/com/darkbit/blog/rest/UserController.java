package com.darkbit.blog.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.darkbit.blog.user.User;
import com.darkbit.blog.user.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(code = HttpStatus.OK)
	public Page<User> list(@RequestParam(name = "page", defaultValue = "1") Integer page, 
						   @RequestParam(name = "size", defaultValue = "10") Integer size,Pageable pageable
						   ) {
		
		
		size = Math.min(size, 1000);

		return userService.list(page, size);
	}

}
