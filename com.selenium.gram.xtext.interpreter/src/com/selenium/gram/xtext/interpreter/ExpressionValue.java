package com.selenium.gram.xtext.interpreter;

public class ExpressionValue {

	private Object value;
	
	private ExpressionValueType type;

	public ExpressionValue(Object value, ExpressionValueType type) {
		super();
		this.value = value;
		this.type = type;
	}

	public Object getValue() {
		return value;
	}

	public ExpressionValueType getType() {
		return type;
	}
	
	
}
