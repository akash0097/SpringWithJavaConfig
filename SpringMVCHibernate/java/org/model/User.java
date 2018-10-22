package org.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	
	@Column(name = "USER_NAME")
	private String name;
	
	@Column(name= "USER_AGE")
	private Integer age;
	
	@Column(name = "USER_EMAIL")
	private String email;
	
	@Column(name = "CREATED_TS")
	private Timestamp createdTimestamp;
	
	@Column(name = "MODIFIED_TS")
	private Timestamp modifiedTimestamp;
	
	
	
	public User() { }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}
	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	public Timestamp getUpdateTimestamp() {
		return modifiedTimestamp;
	}
	public void setUpdateTimestamp(Timestamp modifiedTimestamp) {
		this.modifiedTimestamp = modifiedTimestamp;
	}
	
	

}
