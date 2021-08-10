package com.example.types;

public class User {
	private int id;
    private String username;
    private String password;
    private String name;
	
	public User() {}
    public User(String username, String password, String name) {
		super();
		this.username = username;
		this.password = password;
		this.name=name;
	}

    
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
public String name() {
	return name;
}
			

    public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUsername() {
    return username;
}
public String getPassword() {
       return password;
}

public void setPassword(String newPassword) {
       password = newPassword;
}
@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + "]";
}

	
}
