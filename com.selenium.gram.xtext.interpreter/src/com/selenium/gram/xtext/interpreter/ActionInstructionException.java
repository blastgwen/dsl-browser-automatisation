package com.selenium.gram.xtext.interpreter;

public class ActionInstructionException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ActionInstructionException(String message) {
		super("Erreur lors de l'ActionInstruction : "+message);
	}

}
