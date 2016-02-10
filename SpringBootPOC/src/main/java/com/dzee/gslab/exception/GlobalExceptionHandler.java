package com.dzee.gslab.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.dzee.gslab.model.ErrorMessage;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = GenericException.class)
	public ResponseEntity<ErrorMessage> genericExceptionHander(
			GenericException exception) {
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setStatus("unknown");
		errorMessage.setErrormsg("Unknown error occured at server");
		return new ResponseEntity<ErrorMessage>(errorMessage,
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
