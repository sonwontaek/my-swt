package net.swt.web;

public class user {
	private String userId;
	private String passwd;
	private String name;
	private String email;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "user [userId=" + userId + ", passwd=" + passwd + ", name=" + name + ", email=" + email + "]";
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
