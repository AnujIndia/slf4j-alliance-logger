package com.product.logging.slf4j.impl;

import org.apache.log4j.Logger;
import org.slf4j.helpers.MarkerIgnoringBase;

/**
 * A wrapper over {@link org.apache.log4j.Logger org.apache.log4j.Logger} in
 * conforming to the {@link Logger} interface.
 * 
 * @author Anuj Kumar;
 */
public class AllianceLoggerAdapter extends MarkerIgnoringBase{

	private static final long serialVersionUID = 1L;
	
	private static Logger SINGLETONLOG4J = Logger.getLogger("");
	
	
	public AllianceLoggerAdapter(String name) {
		this.name = SINGLETONLOG4J.getName();
	}

	public boolean isTraceEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public void trace(String msg) {
		
	}

	public void trace(String format, Object arg) {
		// TODO Auto-generated method stub
		
	}

	public void trace(String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	public void trace(String format, Object... arguments) {
		// TODO Auto-generated method stub
		
	}

	public void trace(String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	public boolean isDebugEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public void debug(String msg) {
		// TODO Auto-generated method stub
		
	}

	public void debug(String format, Object arg) {
		// TODO Auto-generated method stub
		
	}

	public void debug(String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	public void debug(String format, Object... arguments) {
		// TODO Auto-generated method stub
		
	}

	public void debug(String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	public boolean isInfoEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public void info(String msg) {
		SINGLETONLOG4J.info(msg);
		
	}

	public void info(String format, Object arg) {
		// TODO Auto-generated method stub
		
	}

	public void info(String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	public void info(String format, Object... arguments) {
		// TODO Auto-generated method stub
		
	}

	public void info(String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	public boolean isWarnEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public void warn(String msg) {
		// TODO Auto-generated method stub
		
	}

	public void warn(String format, Object arg) {
		// TODO Auto-generated method stub
		
	}

	public void warn(String format, Object... arguments) {
		// TODO Auto-generated method stub
		
	}

	public void warn(String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	public void warn(String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	public boolean isErrorEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public void error(String msg) {
		// TODO Auto-generated method stub
		
	}

	public void error(String format, Object arg) {
		// TODO Auto-generated method stub
		
	}

	public void error(String format, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

	public void error(String format, Object... arguments) {
		// TODO Auto-generated method stub
		
	}

	public void error(String msg, Throwable t) {
		// TODO Auto-generated method stub
		
	}

}
