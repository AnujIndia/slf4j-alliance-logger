package com.product.logging.slf4j.impl;


import org.slf4j.helpers.NOPMDCAdapter;
import org.slf4j.spi.MDCAdapter;

/**
 * This implementation is bound to {@link AllianceMDCAdapter}.
 * Note: We have not implemented AllianceMDCAdapter yet.
 *
 * @author Anuj Kumar;
 */
public class AllianceStaticMDCBinder {
	/**
	 * The unique instance of this class.
	 */
	public static final AllianceStaticMDCBinder SINGLETON = new AllianceStaticMDCBinder();

	private AllianceStaticMDCBinder() {
	}

	/**
	 * Return the singleton of this class.
	 * 
	 * @return the StaticMDCBinder singleton
	 * @since 1.7.14
	 */
	public static final AllianceStaticMDCBinder getSingleton() {
		return SINGLETON;
	}

	/**
	 * Currently this method always returns an instance of
	 * {@link AllianceStaticMDCBinder}.
	 */
	public MDCAdapter getMDCA() {
		return new NOPMDCAdapter();
	}

	/**
	 * @return
	 */
	public String getMDCAdapterClassStr() {
		return NOPMDCAdapter.class.getName();
	}


}
