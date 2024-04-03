package com.jsp.SpringBoot_Actordb.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;


public class ActorNotFoundException extends RuntimeException 
{
	private String message;

	public String getMessage() {
		return message;
	}

	public ActorNotFoundException(String message) {
		
		this.message = message;
	}
   
	
	
	

}
