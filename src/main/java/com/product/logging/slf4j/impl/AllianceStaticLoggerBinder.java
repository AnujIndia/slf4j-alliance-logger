package com.product.logging.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

/**
 * The binding of {@link AllianceLoggerFactory} class with an actual instance of
 * {@link ILoggerFactory} is performed using information returned by this class.
 * 
 * @author Anuj Kumar;
 */
public class AllianceStaticLoggerBinder implements LoggerFactoryBinder{
	
	/**
     * The unique instance of this class.
     * 
     */
    private static final AllianceStaticLoggerBinder SINGLETON = new AllianceStaticLoggerBinder();
    
    private static final String loggerFactoryClassStr = AllianceLoggerFactory.class.getName();

    /**
     * Return the singleton of this class.
     * 
     * @return the StaticLoggerBinder singleton
     */
    public static final AllianceStaticLoggerBinder getSingleton() {
        return SINGLETON;
    }
    
    /**
     * The ILoggerFactory instance returned by the {@link #getLoggerFactory}
     * method should always be the same object
     */
    private final ILoggerFactory loggerFactory;

    private AllianceStaticLoggerBinder() {
        loggerFactory = new AllianceLoggerFactory();
    }
    


	/* (non-Javadoc)
	 * @see org.slf4j.spi.LoggerFactoryBinder#getLoggerFactory()
	 */
	public ILoggerFactory getLoggerFactory() {
		return loggerFactory;
	}

	/* (non-Javadoc)
	 * @see org.slf4j.spi.LoggerFactoryBinder#getLoggerFactoryClassStr()
	 */
	public String getLoggerFactoryClassStr() {
		return loggerFactoryClassStr;
	}

}
