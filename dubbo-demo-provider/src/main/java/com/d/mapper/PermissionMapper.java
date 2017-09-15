/* 
* Copyright (c) 2016. All Rights Reserved
*/
package com.d.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.d.base.BaseMapper;
import com.d.entity.Permission;

/**
 * Mapper接口
 * 
 * @author d
 */
public interface PermissionMapper extends BaseMapper<Permission> {
	@Select("SELECT count(0) from permission WHERE path LIKE #{path} AND id in(SELECT permission_id FROM role_permission WHERE role_id in (SELECT role_id FROM role_user WHERE user_id=#{userId}))")
	int countByUserIdAndPath(@Param("userId") long userId, @Param("path") String path);

	@Select("SELECT path from permission WHERE id in(SELECT permission_id FROM role_permission WHERE role_id in (SELECT role_id FROM role_user WHERE user_id=#{userId}))")
	List<String> findPathByUserId(@Param("userId") long userId);
}