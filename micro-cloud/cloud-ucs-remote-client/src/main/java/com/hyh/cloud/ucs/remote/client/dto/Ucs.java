package com.hyh.cloud.ucs.remote.client.dto;





public class Ucs {
	
	//id，主键
	
	
	private Long id;
	//用户名
	private String userName;
	//密码
	private String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Ucs [id=" + id + ", userName=" + userName + ", password="
				+ password + "]";
	}
}

