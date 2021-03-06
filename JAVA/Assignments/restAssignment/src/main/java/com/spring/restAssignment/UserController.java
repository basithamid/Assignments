package com.spring.restAssignment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xornet")
public class UserController {
	
	@RequestMapping(value="/path/{city}", method=RequestMethod.GET)
	public @ResponseBody String city(@PathVariable(value="city") String myCity){
		System.out.println(myCity);
		return myCity;
	}
	
	@RequestMapping(value="/req", method=RequestMethod.GET)
	public @ResponseBody String getSomething(@RequestHeader(value="auth-token") String authToken){
		System.out.println("auth-token : "+authToken);
		return authToken;
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public @ResponseBody String hello(@RequestParam(name="uname") String name){
		System.out.println(name);
		return name;
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<User> getAllUsers(){
		List<User> users = new ArrayList<User>();
		users.add(new User(1,"Basit","Srinagar"));
		users.add(new User(2,"Anusha","Bangalore"));
		return users;
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User createUser(@RequestBody User user){
		System.out.println("User:"+user);
		return user;
	}
	
	
	
}
