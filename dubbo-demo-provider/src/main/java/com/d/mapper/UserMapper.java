package com.d.mapper;

import java.util.Set;

import org.apache.ibatis.annotations.Select;

import com.d.base.BaseMapper;
import com.d.entity.User;

/**
 * @author di
 */
public interface UserMapper extends BaseMapper<User> {
	User findUserByUsername(String userName);

	Set<String> findRoles(String userName);

	Set<String> findPermissions(String userName);

	@Select("select * from user where user_name=#{userName}")
	User getByName(String userName);
}
