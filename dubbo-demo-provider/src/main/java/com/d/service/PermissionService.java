/* 
* Copyright (c) 2016. All Rights Reserved
*/
package com.d.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.d.base.BaseService;
import com.d.entity.Permission;
import com.d.mapper.PermissionMapper;

/**
 * service
 * 
 * @author d
 */
@Service
public class PermissionService extends BaseService<PermissionMapper, Permission> {
	public boolean hasPermission(long userId, String[] paths) {
		int i = 0;
		if (paths == null || paths.length == 0) {
			return false;
		} else {
			for (String path : paths) {
				i = i + mapper.countByUserIdAndPath(userId, path);
			}
		}
		return i > 0;
	}

	public List<String> findPathByUserId(long userId) {
		return mapper.findPathByUserId(userId);
	}
}