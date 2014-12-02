package com.tesco.ofs.platform.security.authentication;

import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("deprecation")
public class IdentityServiceAuthenticator implements Authenticator{
	
	private String identityServiceHost;
	private String identityServiceName;
	
	
	public IdentityServiceAuthenticator(String url, String serviceName)
	{
		this.identityServiceHost = url;
		this.identityServiceName = serviceName;
		
	}

	@Override
	public ServiceToken getServiceToken(String key) throws Exception 
	{
		
		String resourceurl = identityServiceHost + "/" + identityServiceName + "?access_token=" + key;
		//String status="";
	
		System.out.println("Calling identity service to validate the token:::::" + resourceurl);
	    @SuppressWarnings({"resource", "deprecation" })
		HttpClient client = new DefaultHttpClient();		                      
	    HttpGet get = new HttpGet(resourceurl); 		        		              
	    HttpResponse response = client.execute(get);        
	    
	    System.out.println("Cache -> response:::::::" + response.getEntity().getContent().toString());		        		      
	    
	    //JSON response to object mapping start
	    ObjectMapper mapper = new ObjectMapper();
	    ServiceToken stoken = mapper.readValue(new InputStreamReader(response.getEntity().getContent()), ServiceToken.class);	
	   
	    //TODO : Proper Exception Handling
	    if(stoken == null)
	    {
	    	throw new Exception("Service Token Absent");
	    }
	  		     	
		return stoken;
		
	}

}
