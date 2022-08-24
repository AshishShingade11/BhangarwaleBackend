package com.bhangarwale.www.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFounfException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFounfException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	public UserNotFounfException() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
