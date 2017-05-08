package com.product.logging.slf4j.impl;

import org.slf4j.IMarkerFactory;
import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.spi.MarkerFactoryBinder;

/**
 * 
 * The binding of {@link MarkerFactory} class with an actual instance of 
 * {@link IMarkerFactory} is performed using information returned by this class. 
 * 
 * @author Anuj Kumar;
 */
public class AllianceStaticMarkerBinder implements MarkerFactoryBinder{
	public static final AllianceStaticMarkerBinder SINGLETON = new AllianceStaticMarkerBinder();

    final IMarkerFactory markerFactory = new BasicMarkerFactory();

    private AllianceStaticMarkerBinder() {
    }

    /**
     * Return the singleton of this class.
     * 
     * @return the StaticMarkerBinder singleton
     * @since 1.7.14
     */
    public static AllianceStaticMarkerBinder getSingleton() {
        return SINGLETON;
    }

    /**
     * Currently this method always returns an instance of 
     * {@link BasicMarkerFactory}.
     */
    public IMarkerFactory getMarkerFactory() {
        return markerFactory;
    }

    /**
     * Currently, this method returns the class name of
     * {@link BasicMarkerFactory}.
     */
    public String getMarkerFactoryClassStr() {
        return BasicMarkerFactory.class.getName();
    }


}
