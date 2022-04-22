package com.project.payment.exception;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ResourceExceptionsHandler {
  
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<standerErro> ObjectNotFound(ObjectNotFoundException ex, HttpServletRequest request) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
				new standerErro(LocalDateTime.now(),
				ex.getMessage(),
				HttpStatus.NOT_FOUND.value(),
				request.getRequestURI())
				);
		
		
	}
}
