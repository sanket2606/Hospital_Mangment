package com.qsp.HospitalMangment.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.qsp.HospitalMangment.util.ResponseStructure;
@RestController
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler  
{
	//It is handling an exceptions
	@ExceptionHandler
	public ResponseEntity<ResponseStructure<String>> idNotFoundExceptionHandler(HospitalIDNotFound exception)
	{
		ResponseStructure<String> s = new ResponseStructure<String>();
		
		s.setMessage("ID Not Found Exception");
		s.setStatus(HttpStatus.BAD_REQUEST.value());
		s.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(s,HttpStatus.BAD_REQUEST);
		
	}
	// All Filde Validation at one short  
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		    List<ObjectError> list =ex.getAllErrors();
		    Map<String, String> m=new HashMap<String, String>();
		    for (ObjectError objectError : list) 
		    {
		    	FieldError fe= (FieldError) objectError ;
		    	String name = fe.getField();
		    	String message = fe.getDefaultMessage();
		    	m.put(name, message);	
			}
		    return new ResponseEntity<Object>(m,HttpStatus.BAD_REQUEST);
	}

}
