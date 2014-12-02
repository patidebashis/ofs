package com.tesco.ofs.order.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tesco.ofs.order.representation.FulfillmentOrderBean;

@Path(value = "v1/api/FulfillmentOrder")
public interface IFulfillmentOrder {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String createFulfillmentOrder(FulfillmentOrderBean fulfillmentOrderBean) throws Exception;
	
}
