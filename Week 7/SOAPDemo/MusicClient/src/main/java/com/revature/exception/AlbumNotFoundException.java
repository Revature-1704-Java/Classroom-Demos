package com.revature.exception;

public class AlbumNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;

	public AlbumNotFoundException() {};
	
	public AlbumNotFoundException(String message) {
		super(message);
	}
}
