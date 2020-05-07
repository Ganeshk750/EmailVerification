package com.ganesh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ganesh.model.User;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, String> {
	
	 User findByEmailIdIgnoreCase(String emailId);

}
