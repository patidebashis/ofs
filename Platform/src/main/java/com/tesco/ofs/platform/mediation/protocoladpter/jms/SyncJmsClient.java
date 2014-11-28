package com.tesco.ofs.platform.mediation.protocoladpter.jms;

import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;


public class SyncJmsClient implements ISyncJmsClient {

	ApplicationContext context = new ClassPathXmlApplicationContext("Mediation_Async_Context.xml");
	
    // send JMS message to the configured default URI
    public void jmsSendMessageToQueue(String destinationQueue, String message) {
    	JmsTemplate jmsTemplate = context.getBean("jmsQueueServiceTemplate", JmsTemplate.class);
    	Destination destination = context.getBean("receiveDestination", Destination.class);
    	jmsTemplate.setDefaultDestination(destination);
    	jmsTemplate.convertAndSend(message);
    }
    

    // send JMS message to the configured default URI
    public void jmsSendMessageToTopic(String destinationQueue, String message) {
    	JmsTemplate jmsTemplate = context.getBean("jmsTopicServiceTemplate", JmsTemplate.class);
    	Destination destination = context.getBean("destinationTopic", Destination.class);
    	jmsTemplate.setDefaultDestination(destination);
    	jmsTemplate.convertAndSend(message);
    }

    
    // send JMS message to the configured default URI
    public Message jmsSyncReceiveMessage(String destinationQueue) {
    	JmsTemplate jmsTemplate = context.getBean("jmsQueueServiceTemplate", JmsTemplate.class);
    	Destination destination = context.getBean(destinationQueue, Destination.class);
    	return jmsTemplate.receive(destination);
    }

    
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
    	//for(int i=0; i<10; i++)
    	//new SyncJmsClient().jmsSendMessageToQueue("receiveDestination", "<Order EnterpriseCode='DEFAULT' OrderNo='Pradeep9778' xmlns='http://www.sterlingcommerce.com/documentation/YFS/createOrder/input'><OrderLines><OrderLine OrderedQty='10'><Item ItemDesc='Product 1' ItemID='P1'/></OrderLine></OrderLines><PersonInfoBillTo AddressID='12345'/></Order>");
    	System.out.println(((TextMessage)new SyncJmsClient().jmsSyncReceiveMessage("receiveDestination")).getText());
     }
    
}
