package com.spring.advertisement.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.spring.advertisement.collection.UserCollection;
import com.spring.advertisement.entity.UserLogin;

public interface UserRepository extends MongoRepository<UserCollection, String>{
	
	@Query(value="{uname: ?0, pwd: ?1 }")
	public List<UserCollection> validate(String uname, String pwd);

}