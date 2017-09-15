package com.d.entity;

import java.util.Date;

import com.d.base.BaseEntity;

/**
 * @author di
 */
public class User extends BaseEntity<User> {

	private static final long serialVersionUID = -5607333786002281495L;
	private String userName;
	private Date createTime;
	private String password;
	private Integer uid;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", createTime=" + createTime + ", password=" + password + ", uid=" + uid
				+ "]";
	}

}
