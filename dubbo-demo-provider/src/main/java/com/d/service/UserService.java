package com.d.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.d.base.BaseService;
import com.d.entity.User;
import com.d.mapper.UserMapper;

/**
 * @author d
 */
@Service
public class UserService extends BaseService<UserMapper, User> {

	public User findUserByUsername(String userName) {
		return mapper.findUserByUsername(userName);
	}

	public Set<String> findRoles(String userName) {
		return mapper.findRoles(userName);
	}

	public Set<String> findPermissions(String userName) {
		return mapper.findPermissions(userName);
	}
}
