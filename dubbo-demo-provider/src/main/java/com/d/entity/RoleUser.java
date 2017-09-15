/* 
* Copyright (c) 2016. All Rights Reserved
*/
package com.d.entity;

import com.d.base.BaseEntity;
/**
 * 
 * @author di
 * @date 2017-09-11 14:07
 */
public class RoleUser extends BaseEntity<RoleUser> {
	private static final long serialVersionUID = 907123515663056896L;
    private int userId;
    private int roleId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}