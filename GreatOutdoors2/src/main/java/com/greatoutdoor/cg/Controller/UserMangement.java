package com.greatoutdoor.cg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatoutdoor.cg.Dao.UserDaoI;
import com.greatoutdoor.cg.entity.User;

@RestController
public class UserMangement {
	@Autowired
	UserDaoI userdao;
	
	@PostMapping(value="/User/add",consumes = {"application/json"})
	public  String addAddress(@RequestBody User user)
	{
		userdao.create(user);
		return "User added";
	}

}
