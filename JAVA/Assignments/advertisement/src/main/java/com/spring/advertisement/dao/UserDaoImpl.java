package com.spring.advertisement.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.advertisement.collection.ItemCollection;
import com.spring.advertisement.collection.SessionCollection;
import com.spring.advertisement.collection.UserCollection;
import com.spring.advertisement.entity.User;
import com.spring.advertisement.entity.UserLogin;
import com.spring.advertisement.repository.ItemRepository;
import com.spring.advertisement.repository.SessionRepository;
import com.spring.advertisement.repository.UserRepository;

public class UserDaoImpl implements UserDao {

	@Autowired
	SessionRepository sessionRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ItemRepository itemRepository;
	public User createUser(User user) {
		UserCollection userCollection = new UserCollection();
		userCollection.setFname(user.getFname());
		userCollection.setLname(user.getlname());
		userCollection.setId(user.getId());
		userCollection.setUname(user.getUname());
		userCollection.setPwd(user.getPwd());
		System.out.println("Inside DAO");
		userRepository.save(userCollection);
		
		return user;
	}
	public List<ItemCollection> getCategoires() {
		List<ItemCollection> categories = itemRepository.findAll();
		System.out.println(categories);
		return categories;
	}
	
	public SessionCollection login(UserLogin user){
		
		List<UserCollection> users = userRepository.validate(user.getUname(), user.getPwd());
		System.out.println("User details:"+user);
		if(users!=null){
			SessionCollection session = new SessionCollection();
			session.setUname(user.getUname());
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			session.setLastUpdatedDate(dateFormat.format(date));
			sessionRepository.save(session);
			
			return session;
		}
		return null;
		
	}
	public void logout(String authToken) {
		
			sessionRepository.delete(authToken);
		
	}
	

}