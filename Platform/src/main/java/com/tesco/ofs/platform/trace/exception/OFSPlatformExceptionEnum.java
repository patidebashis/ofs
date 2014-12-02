package com.tesco.ofs.platform.trace.exception;

public enum OFSPlatformExceptionEnum implements TescoExceptionType {
	
	UNAUTHORIZED("AuthenticationError", "401"), 
	MISSING_AUTH_TOKEN("AuthenticationError", "402"),
	DATA_VALIDATION_ERROR("ValidationError","400"),
	MISSING_INPUT_ERROR("ValidationError", "400");
	
	private final String errorType;
	private final String errorCode;
	 
	  private OFSPlatformExceptionEnum(String errorType, String errorCode) {
	    this.errorType = errorType;
	    this.errorCode = errorCode;
	  }


	@Override
	public String getErrorCode() {
		// TODO Auto-generated method stub
		return this.errorCode;
	}

	@Override
	public String getErrorType() {
		// TODO Auto-generated method stub
		return this.errorType;
	}

}
