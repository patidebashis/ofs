package com.tesco.ofs.platform.security.authentication;

public interface Authenticator{
	
	public Object getServiceToken(String key) throws Exception;

}
