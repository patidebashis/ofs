package com.tesco.ofs.order.application;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.tesco.ofs.order.appconfig.FulfillmentOrderGuiceModule;
import com.tesco.ofs.order.resource.IFulfillmentOrder;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class FulfillmentOrderApplication extends Application<Configuration> {

	Injector injector = null;
	
    public static void main(String[] args) throws Exception {
        new FulfillmentOrderApplication().run(args);
    }

	@Override
	public void initialize(Bootstrap<Configuration> arg0) {
		// TODO Auto-generated method stub
		 injector = Guice.createInjector(new FulfillmentOrderGuiceModule());
		
	}

	@Override
	public void run(Configuration config, Environment env) throws Exception {
		env.jersey().register(injector.getInstance(IFulfillmentOrder.class));
	}

}