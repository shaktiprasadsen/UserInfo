package com.shaktiprasadsen.UserInfo;

public class User {
	private String userName;
	private String userHomeTown;
	
	public User(String userName, String userHomeTown){
		this.userHomeTown = userHomeTown;
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserHomeTown() {
		return userHomeTown;
	}
	public void setUserHomeTown(String userHomeTown) {
		this.userHomeTown = userHomeTown;
	}
	
	
}
