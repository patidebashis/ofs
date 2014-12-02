package com.tesco.ofs.order.resource;



import javax.validation.Valid;

import com.tesco.ofs.order.representation.FulfillmentOrderBean;
import com.tesco.ofs.platform.mediation.protocoladpter.jms.ISyncJmsClient;
import com.tesco.ofs.platform.mediation.protocoladpter.jms.SyncJmsClient;
import com.tesco.ofs.platform.mediation.transformation.OFSPlatformTransformationUtil;




public class FulfillmentOrder implements IFulfillmentOrder {
	
    public String createFulfillmentOrder(@Valid FulfillmentOrderBean fulfillmentOrderBean) throws Exception {
       
    	//transformation
    	String createOrderInputXML = OFSPlatformTransformationUtil.objectToXml(fulfillmentOrderBean, FulfillmentOrderBean.class);
    	
    	//Publish to JMS Queue
    	ISyncJmsClient syncJmsClient = new SyncJmsClient();
    	syncJmsClient.jmsSendMessageToQueue("receiveDestination", createOrderInputXML);
    	
    	System.out.println(createOrderInputXML);
    	return createOrderInputXML;
    	
    }
    
    
}
