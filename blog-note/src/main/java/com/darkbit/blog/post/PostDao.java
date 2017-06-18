package com.darkbit.blog.post;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 * 
 * @author wilber
 *
 */
public interface PostDao extends JpaRepository<Post, Long>{
	
}
