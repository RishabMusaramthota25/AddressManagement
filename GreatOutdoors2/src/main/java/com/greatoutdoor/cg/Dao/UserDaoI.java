package com.greatoutdoor.cg.Dao;

import org.springframework.stereotype.Repository;

import com.greatoutdoor.cg.entity.User;

@Repository
public interface UserDaoI {
	public void create(User user);

}
