/*
 * generated by Xtext
 */
package com.selenium.gram.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.selenium.gram.xtext.ui.internal.SlnDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SlnDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SlnDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SlnDslActivator.getInstance().getInjector(SlnDslActivator.COM_SELENIUM_GRAM_XTEXT_SLNDSL);
	}
	
}
