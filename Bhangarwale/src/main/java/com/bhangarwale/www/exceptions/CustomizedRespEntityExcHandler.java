package com.bhangarwale.www.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@RestController
@ControllerAdvice
public class CustomizedRespEntityExcHandler extends ResponseEntityExceptionHandler{

	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception e,WebRequest wr)	
	{
		ExceptionResponseBean bean=
				new ExceptionResponseBean(new Date(), e.getMessage(), "Hello this is erro");
		
		
		return new ResponseEntity<Object>(bean, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@ExceptionHandler(UserNotFounfException.class)
	public final ResponseEntity<Object> userNotFoundException(Exception e,WebRequest wr)	
	{
		ExceptionResponseBean bean=
				new ExceptionResponseBean(new Date(), e.getMessage(), "This user Not Found exception");
		
		
		return new ResponseEntity<Object>(bean, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	 
}
