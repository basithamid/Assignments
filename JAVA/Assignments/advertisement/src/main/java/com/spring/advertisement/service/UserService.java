package com.spring.advertisement.service;

import java.util.List;
import com.spring.advertisement.collection.SessionCollection;
import com.spring.advertisement.entity.Actions;
import com.spring.advertisement.entity.Categories;
import com.spring.advertisement.entity.PostAd;
import com.spring.advertisement.entity.User;
import com.spring.advertisement.entity.UserLogin;

public interface UserService {
	public User createUser(User user);

	public List<Categories> getCategories();

	public String login(UserLogin user);

	public void logout(String authToken);

	public List<Actions> getActions(String authToken);

	public User getUser(String authToken, String userName);

	public PostAd postAdvertisement(String authToken, PostAd ad);

	public void deleteAd(String authToken, String postId);

	public PostAd getAd(String authToken, String postId);

	public PostAd getAnyAd(String postId);

	
}
