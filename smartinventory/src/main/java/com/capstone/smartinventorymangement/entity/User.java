package com.capstone.smartinventorymangement.entity;

public class User {
	private Integer userId;
	private String userName;
	private Integer mobNo;
	private String name;
	private Integer number;
	
	public Integer getMobNo() {
		return mobNo;
	}
	public void setMobNo(Integer mobNo) {
		this.mobNo = mobNo;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", mobNo=" + mobNo + ", name=" + name + ", number="
				+ number + "]";
	}
	
}
