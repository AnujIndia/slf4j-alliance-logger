package com.product.logging.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/**
 * AllianceLoggerFactory is an implementation of {@link ILoggerFactory} returning
 * the appropriate named {@link AllianceLoggerAdapter} instance.
 * 
 * @author Anuj Kumar;
 */

public class AllianceLoggerFactory implements ILoggerFactory{

	/* 
	 * This method will return appropriate named {@link AllianceLoggerAdapter} instance.
	 * @see org.slf4j.ILoggerFactory#getLogger(java.lang.String)
	 */
	public Logger getLogger(String name) {
		return new AllianceLoggerAdapter(name);
	}

}
