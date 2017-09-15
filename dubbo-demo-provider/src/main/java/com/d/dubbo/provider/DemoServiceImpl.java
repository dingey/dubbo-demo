/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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