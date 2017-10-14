package com.d.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.d.entity.User;
import com.d.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleTest {
	@Autowired
	UserService userService;
	
	@Test
	public void test(){
		User user = userService.get(1);
	}
}
