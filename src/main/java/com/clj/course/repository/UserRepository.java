package com.clj.course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clj.course.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}
