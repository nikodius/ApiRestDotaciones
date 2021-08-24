package com.dotaciones.service.exception;

/**
 * custom exception for project
 * @author NicolasRG
 *
 */
public class LogicException extends Exception {

	private static final long serialVersionUID = 1L;

	public LogicException(String message, Throwable cause) {
		super(message, cause);
	}

	public LogicException(String message) {
		super(message);
	}

	public LogicException(Throwable cause) {
		super(cause);
	}
}
