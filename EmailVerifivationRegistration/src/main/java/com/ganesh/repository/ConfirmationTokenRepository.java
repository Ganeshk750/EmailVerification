package com.ganesh.repository;

import org.springframework.data.repository.CrudRepository;

import com.ganesh.model.ConfirmationToken;

public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, String> {
	
	 ConfirmationToken findByConfirmationToken(String confirmationToken);

}
