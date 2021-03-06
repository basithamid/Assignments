package com.spring.advertisement.dao;

import java.util.List;

//import com.spring.advertisement.collection.ItemCollection;
import com.spring.advertisement.collection.SessionCollection;
import com.spring.advertisement.entity.Categories;
import com.spring.advertisement.entity.PostAd;
import com.spring.advertisement.entity.User;
import com.spring.advertisement.entity.UserLogin;
import com.spring.advertisement.table.UserSession;
import com.spring.advertisement.entity.Actions;

public interface UserDao {
	public User createUser(User user);

	public List<Categories> getCategories();

	public UserSession login(UserLogin user);

	public void logout(String authToken);

	public List<Actions> getActions(String authToken);

	public User getUser(String authToken, String userName);

	public PostAd postAdvertisement(String authToken, PostAd ad);

	public void deleteAd(String authToken, String postId);

	public PostAd getAd(String authToken, String postId);

	public PostAd getAnyAd(String postId);

	public List<PostAd> getAllAds(String authToken);

	public void editAd(String authToken, PostAd ad, String postId);

	public List<PostAd> searchByText(String searchText);
	
	
}
