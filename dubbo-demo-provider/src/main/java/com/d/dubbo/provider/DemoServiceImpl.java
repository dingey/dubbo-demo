package com.d.dubbo.provider;

import com.d.dubbo.DemoService;
import com.d.entity.User;
import com.d.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class DemoServiceImpl implements DemoService {
	@Autowired
	private UserService userService;

	public String sayHello(String name) {
		User user = userService.findUserByUsername(name);
		if (user == null) {
			return "error:not found.";
		}
		return user.toString();
	}

}