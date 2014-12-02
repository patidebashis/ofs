package com.tesco.ofs.platform.trace.logger;


import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import com.tesco.ofs.platform.trace.exception.OFSPlatformRunTimeException;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.ContextInitializer;
import ch.qos.logback.core.joran.spi.JoranException;


public class OFSPlatformLogger {
	
	private Logger logger ;
	
	public final static Marker INFO = MarkerFactory.getMarker("INFO");
	public final static Marker ERROR = MarkerFactory.getMarker("ERROR");
	public final static Marker DEBUG = MarkerFactory.getMarker("DEBUG");
	public final static Marker TRACE = MarkerFactory.getMarker("TRACE");
	public final static Marker WARN = MarkerFactory.getMarker("WARN");
	public final static Marker METRIC = MarkerFactory.getMarker("METRIC");
		
	private OFSPlatformLogger(Class clazz)
	{
		this.logger =  LoggerFactory.getLogger(clazz);

	}
	
	public static OFSPlatformLogger getLogger(Class clazz)
	{		
		return new OFSPlatformLogger(clazz);
		
	}
		
	public void debug(String msg)
	{
		logger.debug(msg);		
	}
	
	public void debug(Marker marker, String msg)
	{		
		logger.debug(marker, msg);
	}
	public void error(String msg)
	{
		logger.error(msg);
		
	}
	
	public void error(Marker marker, String msg)
	{
		logger.error(marker, msg);
	}
	
	public void error(String msg, Throwable t)
	{
		logger.error(msg, t);
	}
	
	public void info(String msg)
	{
		logger.info(msg);
	}
	
	public void info(Marker marker, String msg)
	{
		logger.info(marker, msg);
	}
	
	public void warn(String msg)
	{
		logger.warn(msg);	
	}
	
	public void warn(Marker marker, String msg)
	{
		logger.warn(marker, msg);
	}	
	
	public void trace(String msg)
	{
		logger.trace(msg);	
	}	
	
	public void trace(Marker marker, String msg)
	{
		logger.trace(marker, msg);
	}
	
	public void beginTimer(String methodName)
	{
		
		
	}
	
	public void endTimer(String methodName)
	{
		
	}
			
	public void setLogbackLogger()  {

		LoggerContext context = getCurrentLogContext();
		context.reset();
		ContextInitializer initializer = new ContextInitializer(context);

		try {	
			initializer.autoConfig();
		} catch(JoranException e) {			
			throw new OFSPlatformRunTimeException(e.getMessage(), e);
		}
	}
	
	public static LoggerContext getCurrentLogContext() {

		return (LoggerContext)LoggerFactory.getILoggerFactory();
	}


}
