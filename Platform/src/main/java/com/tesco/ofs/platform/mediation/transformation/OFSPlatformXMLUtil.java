package com.tesco.ofs.platform.mediation.transformation;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.bind.util.JAXBSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;
import com.tesco.ofs.platform.trace.exception.handler.ExceptionHandlerFactory;
import com.tesco.ofs.platform.trace.exception.handler.IThrowableExceptionHandler;
import com.tesco.ofs.platform.trace.exception.handler.ThrowableExceptionHandler;

public class OFSPlatformXMLUtil {
	
	public static  void validateJAXBObjectModelAgainstXSD(JAXBSource source, String xsd) 
	{		
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);			
	        Schema schema = null;
			try {
				schema = factory.newSchema(new StreamSource(new ByteArrayInputStream(xsd.getBytes())));
			} catch (SAXException e) {
				/*// TODO Auto-generated catch block
				e.printStackTrace();*/
				IThrowableExceptionHandler eh =ExceptionHandlerFactory.getThrowableExceptionHandler(ThrowableExceptionHandler.class);
				eh.throwRunTimeException(e);
			}
	        Validator validator = schema.newValidator();
	        //validator.setErrorHandler(new XMLValidationErrorHandler());
	        try {
				validator.validate(source);
			} catch (SAXException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}									 
	 }
	
	public static  void validateJAXBObjectModelAgainstXSD(JAXBSource source, File  xsdFile)
	 {
		
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = null;
			try {
				schema = factory.newSchema(xsdFile);
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Validator validator = schema.newValidator();
			//validator.setErrorHandler(new XMLValidationErrorHandler());
			try {
				validator.validate(source);
			} catch (SAXException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	 }

}
