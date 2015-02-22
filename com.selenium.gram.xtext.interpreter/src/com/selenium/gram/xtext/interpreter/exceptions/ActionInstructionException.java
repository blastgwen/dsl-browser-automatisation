package com.selenium.gram.xtext.interpreter.exceptions;

public class ActionInstructionException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ActionInstructionException(String message) {
		super("Erreur lors de l'ActionInstruction : "+message);
	}

}
