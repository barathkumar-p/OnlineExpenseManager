package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_dtls")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="full_name")
	private String fullname;
	private String email;
	private String phoneNumber;
	private String password;
	private String about;
	public User() {
		super();
		
	}
	public User(String fullname, String email, String phoneNumber, String password, String about) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.about = about;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return fullname;
	}
	public void setName(String name) {
		this.fullname = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", fullname=" + fullname + ", email=" + email + ", phoneNumber=" + phoneNumber + ", password="
				+ password + ", about=" + about + "]";
	}

}
