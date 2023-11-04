package com.qsp.HospitalMangment.exception;

public class HospitalIDNotFound extends RuntimeException 
{
	String message="Hospital with given id is not Found";
	
	public String getMessage () 
	{
		return message;
		
	}

}
