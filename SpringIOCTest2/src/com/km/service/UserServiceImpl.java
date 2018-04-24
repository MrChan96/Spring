package com.km.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import com.km.dao.UserDao;

//@Component(value="userService")
@Controller(value="userService")
public class UserServiceImpl implements UserService{

	
	
	@Value(value="美美")
	private String name;
	
	@Autowired
	private UserDao userDao;
	
	public void sayHello() {
		System.out.println("hellos Spring！！"+name);
		userDao.save();
	}




}
