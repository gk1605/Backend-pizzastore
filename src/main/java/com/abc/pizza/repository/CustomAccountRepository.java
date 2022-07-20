package com.abc. pizza.repository;

import com.abc. pizza.exceptions.InvalidUserException;

public interface CustomAccountRepository {
	
	public String verifyUser(String username,String password)/*throws InvalidUserException*/;
	public boolean verifyEntries(String username, String password) ;

}
