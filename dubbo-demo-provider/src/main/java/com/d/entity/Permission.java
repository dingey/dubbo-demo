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
public class Permission extends BaseEntity<Permission> {
	private static final long serialVersionUID = 907123515646279680L;
    /**
	 * 名称
	 */
    private String name;
    private java.util.Date createTime;
    private int del;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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