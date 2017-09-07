package com.spring.advertisement.controller;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import com.spring.advertisement.collection.ItemCollection;
import com.spring.advertisement.collection.SessionCollection;
import com.spring.advertisement.entity.Actions;
import com.spring.advertisement.entity.Categories;
import com.spring.advertisement.entity.PostAd;
import com.spring.advertisement.entity.User;
import com.spring.advertisement.entity.UserLogin;
import com.spring.advertisement.service.UserService;
import com.spring.advertisement.table.UserSession;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/advertisement")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/register", method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User createUser(@RequestBody User user) {
		System.out.println("user = " + user);
		return userService.createUser(user);
	}
	
	@RequestMapping(value="/categories", method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Categories> getCategories(){
		List<Categories> categories = userService.getCategories();
		System.out.println("Categories : "+categories);
		return categories;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST,
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody UserSession login(@RequestBody UserLogin user) {
		System.out.println("User login:" +user);
		return userService.login(user);
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.DELETE)
	public @ResponseBody void logout(@RequestHeader(value="auth_token") String authToken){
		userService.logout(authToken);
		
	}
	
	@RequestMapping(value="/actions", method=RequestMethod.GET)
	public @ResponseBody List<Actions> getActions(@RequestHeader(value="auth_token") String authToken){
		return userService.getActions(authToken);
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public @ResponseBody User getUser(@RequestHeader(value="auth_token") String authToken,
									  @RequestParam(name="userId") String userName){
		return userService.getUser(authToken, userName);
	}
	
	@RequestMapping(value="/postAd", method=RequestMethod.POST,
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody PostAd postAdvertise(@RequestHeader(value="auth_token") String authToken,
											  @RequestBody PostAd ad){
		return userService.postAdvertisement(authToken, ad);
	}
	
	@RequestMapping(value="/post", method=RequestMethod.DELETE)
	public @ResponseBody void deleteAd(@RequestHeader(value="auth_token") String authToken,
									   @RequestParam(name="postId") String postId){
		userService.deleteAd(authToken,postId);
	}
	
	@RequestMapping(value="/post", method=RequestMethod.GET)
	public @ResponseBody PostAd getAd(@RequestHeader(value="auth_token") String authToken,
									   @RequestParam(name="postId") String postId){
		return userService.getAd(authToken,postId);
	}
	
	@RequestMapping(value="/viewAd", method=RequestMethod.GET)
	public @ResponseBody PostAd getAnyAd(@RequestParam(name="postId") String postId){
		return userService.getAnyAd(postId);
	}
	
	@RequestMapping(value="/posts", method=RequestMethod.GET)
	public @ResponseBody List<PostAd> getAllAdsByLoggedInUser(@RequestHeader(value="auth_token") String authToken){
		return userService.getAllAds(authToken);
	}
	
	@RequestMapping(value="/postAd", method=RequestMethod.PUT)
	public @ResponseBody void editAd(@RequestHeader(value="auth_token") String authToken,
									 @RequestBody PostAd ad,
									 @RequestParam(name="postId") String postId){
		userService.editAd(authToken, ad, postId);
	}
	
	@RequestMapping(value="/posts/search/text", method=RequestMethod.GET)
	public @ResponseBody List<PostAd> searchByText(@RequestParam(name="searchText") String searchText){
		return userService.searchByText(searchText);
	}
}
