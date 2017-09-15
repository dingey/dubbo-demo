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
public class RolePermission extends BaseEntity<RolePermission> {
	private static final long serialVersionUID = 907123515658862592L;
    private int roleId;
    private int permissionId;
    private int del;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }
}