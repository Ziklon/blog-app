package com.darkbit.blog.post;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.darkbit.blog.user.User;

import lombok.Data;

/**
 * 
 * @author wilber
 *
 */
@Entity
@Table(name = "posts")
@Data
public class Post implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7532555595122053875L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "title")
	private String title;
	@Column(name = "content")
	private String content;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	

}
