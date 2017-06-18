package com.darkbit.blog.user;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@DataJpaTest
public class UserDaoTest {

	
	@Autowired private TestEntityManager entityManager;
	@Autowired private UserDao userDao;
	
	
	@Test
	public void testSave()throws Exception{
		
		entityManager.merge(new User("winftc@gmail.com","123456"));
		
		User user = userDao.findByUsername("winftc@gmail.com");
		
		Assert.assertEquals(user.getUsername(), "winftc@gmail.com");
	}
	
	
}
