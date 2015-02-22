package com.selenium.gram.xtext.interpreter.exceptions;

public class InterpretationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8530419590220335861L;

	public InterpretationException(String message) {
		super("Erreur d'interprétation : "+message);
	}

	
}
