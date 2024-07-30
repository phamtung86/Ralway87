package com.vti.entity;

public class Account {
	private String id;
	private String userName;
	private String passWord;
	private User user;
	public Account(String id, String userName, String passWord, User user) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.user = user;
	}
	public String getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public User getUser() {
		return user;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", user=" + user + "]";
	}
	
	
}
