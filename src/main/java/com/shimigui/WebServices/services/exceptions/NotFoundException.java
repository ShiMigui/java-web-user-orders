package com.shimigui.WebServices.services.exceptions;

public class NotFoundException  extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public NotFoundException(Object id) {
		super("Resource not found! id: " + id);
	}
}
