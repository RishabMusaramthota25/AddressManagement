package com.greatoutdoor.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatoutdoor.cg.Dao.AddressDaoI;
import com.greatoutdoor.cg.Dao.UserDaoI;

@SpringBootApplication
public class GreatOutdoors2Application   {
	@Autowired
	AddressDaoI addressdao;
	
	@Autowired
	UserDaoI userdao;

	public static void main(String[] args) {
		SpringApplication.run(GreatOutdoors2Application.class, args);
	}
}
