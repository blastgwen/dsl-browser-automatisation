/*
* generated by Xtext
*/
package com.selenium.gram.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SlnDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/selenium/gram/xtext/parser/antlr/internal/InternalSlnDsl.tokens");
	}
}
