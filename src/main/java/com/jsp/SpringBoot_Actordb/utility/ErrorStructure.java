package com.jsp.SpringBoot_Actordb.utility;

import org.springframework.web.bind.annotation.RestControllerAdvice;


public class ErrorStructure<T>
{
	private int statuscode;
	private String errorMessage;
	private T errorData;
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public T getErrorData() {
		return errorData;
	}
	public void setErrorData(T errorData) {
		this.errorData = errorData;
	}
	
}
