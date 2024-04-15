package com.shimigui.WebServices.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.shimigui.WebServices.services.exceptions.DatabaseException;
import com.shimigui.WebServices.services.exceptions.NotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class HandlerException {

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<StandardError> notFound(NotFoundException e, HttpServletRequest request) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = generateStandardError(status, "Not found", e.getMessage(), request);

		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request) {
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = generateStandardError(status, "Database error", e.getMessage(), request);

		return ResponseEntity.status(status).body(err);
	}

	public StandardError generateStandardError(HttpStatus status, String error, String msg, HttpServletRequest request) {
		StandardError err = new StandardError();
		err.setPath(request.getRequestURI());
		err.setTimestamp(Instant.now());
		err.setStatus(status);
		err.setError(error);
		err.setMessage(msg);
		return err;
	}
}
