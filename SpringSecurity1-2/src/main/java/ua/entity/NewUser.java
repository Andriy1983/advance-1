package ua.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NewUser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(unique=true)
	private String username;
	private String password;
	
	public NewUser() {
		// TODO Auto-generated constructor stub
	}

	public NewUser(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "NewUser [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	
	

}
