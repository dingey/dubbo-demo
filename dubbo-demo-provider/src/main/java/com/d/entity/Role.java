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
public class Role extends BaseEntity<Role> {
	private static final long serialVersionUID = 907123515650473984L;
    /**
	 * 角色名
	 */
    private String roleName;
    /**
	 * 创建时间
	 */
    private java.util.Date createTime;
    /**
	 * 删除状态:0正常；1删除
	 */
    private int del;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public java.util.Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }
}