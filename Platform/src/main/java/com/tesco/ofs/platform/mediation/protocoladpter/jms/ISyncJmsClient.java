package com.tesco.ofs.platform.mediation.protocoladpter.jms;

import javax.jms.Message;

public interface ISyncJmsClient {
	
	 public Message jmsSyncReceiveMessage(String destinationQueue);
	 
	 public void jmsSendMessageToQueue(String destinationQueue, String message);
	 
	 public void jmsSendMessageToTopic(String destinationQueue, String message);

}
