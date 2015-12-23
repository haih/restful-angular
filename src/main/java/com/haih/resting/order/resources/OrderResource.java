/**
 * 
 */
package com.haih.resting.order.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author haih
 *
 */

@Path("/v1/orders/")
public class OrderResource {

	public static final Logger logger = LoggerFactory.getLogger(OrderResource.class);
	
	@GET
	@Path("getTestinfo")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTestinfo(){
		System.out.println("getTestInfo begin~");
		logger.info("getTestInfo begin~");
		
		return Response.status(200).entity("sdf").build();
	}
	
}
