package com.spring.advertisement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.advertisement.collection.SessionCollection;
import com.spring.advertisement.dao.UserDao;
import com.spring.advertisement.entity.User;
import com.spring.advertisement.entity.UserLogin;

public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	
	public User createUser(User user){
		return userDao.createUser(user);
	}

//	public List<ItemCollection> getCategories() {
//		return userDao.getCategoires();
//	}
//
	public void login(UserLogin user) {
		System.out.println("in login service");
		userDao.login(user);
		
	}
//
//	public void logout(String authToken) {
//		userDao.logout(authToken);
//		
//	}
	
	
}
