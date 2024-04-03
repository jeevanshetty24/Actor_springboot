package com.jsp.SpringBoot_Actordb.utility;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.SpringBoot_Actordb.exception.ActorNotFoundException;

@RestControllerAdvice
public class ApplicationHandler 
{
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>>actorNotFoundByIdException(ActorNotFoundException exc)
	{
		ErrorStructure<String>errorStructure=new ErrorStructure<>();
		errorStructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorStructure.setErrorMessage(exc.getMessage());
		errorStructure.setErrorData("Actor Object with the given id doesn't exist");
		
		return new  ResponseEntity<ErrorStructure<String>>(errorStructure,HttpStatus.NOT_FOUND);
	}

}
