package com.tesco.ofs.order.appconfig;

import com.google.inject.AbstractModule;
import com.tesco.ofs.order.resource.FulfillmentOrder;
import com.tesco.ofs.order.resource.IFulfillmentOrder;

public class FulfillmentOrderGuiceModule extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		
		bind(IFulfillmentOrder.class).to(FulfillmentOrder.class);
		
	}

}
