package com.spring.advertisement.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.spring.advertisement.collection.SessionCollection;
import com.spring.advertisement.collection.UserCollection;

public interface SessionRepository extends MongoRepository<SessionCollection, String>{
	
}