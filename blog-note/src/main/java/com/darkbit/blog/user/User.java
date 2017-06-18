package com.darkbit.blog.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1710867264980756535L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(unique=true)
	private String username;
	@Column 
	private String password;
	
	public User(){
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	
}
