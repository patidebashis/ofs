package com.tesco.ofs.platform.trace.exception.handler;

import java.util.Map;

import com.tesco.ofs.platform.trace.exception.OFSPlatformException;
import com.tesco.ofs.platform.trace.exception.OFSPlatformRunTimeException;
import com.tesco.ofs.platform.trace.exception.TescoExceptionType;

public class ThrowableExceptionHandler implements IThrowableExceptionHandler {
	
	static
	{
		ExceptionHandlerFactory.registerExceptionHandler(ThrowableExceptionHandler.class);
	}

	@Override
	public void throwRunTimeException(String message, String errorDescription, TescoExceptionType exceptionType, String additionalInformation, Map params, String jsonInput, Throwable cause) {
		// TODO Auto-generated method stub			
		
		OFSPlatformRunTimeException ofsRunTimeEx = new OFSPlatformRunTimeException(message, errorDescription, exceptionType, additionalInformation, params, jsonInput, cause);
		throw ofsRunTimeEx;
				
	}

	@Override
	public void throwCheckedException(String message, String errorDescription, TescoExceptionType exceptionType, String additionalInformation, Map params, String jsonInput, Throwable cause) throws OFSPlatformException {
		// TODO Auto-generated method stub
		
		OFSPlatformException ofsEx = new OFSPlatformException(message, errorDescription, exceptionType, additionalInformation, params, jsonInput, cause);
		throw ofsEx;
	}
	
}
