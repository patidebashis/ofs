package com.tesco.ofs.platform.trace.exception.handler;
import java.util.Map;

import com.tesco.ofs.platform.trace.exception.OFSPlatformException;
import com.tesco.ofs.platform.trace.exception.TescoExceptionType;


public interface IThrowableExceptionHandler {
	
	public void throwCheckedException(String message, String errorDescription, TescoExceptionType exceptionType, String additionalInformation, Map params, String jsonInput, Throwable cause) throws OFSPlatformException;

	public void throwRunTimeException(String message, String errorDescription, TescoExceptionType exceptionType, String additionalInformation, Map params, String jsonInput, Throwable cause);

}
