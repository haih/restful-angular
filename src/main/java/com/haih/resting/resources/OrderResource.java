/**
 * 
 */
package com.haih.resting.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haih.utils.generic.ResponseUtil;


/**
 * @author haih
 *
 */

@Path("/v1/orders/")
public class OrderResource {

	public static final Logger logger = LoggerFactory.getLogger(OrderResource.class);
	
	@Path("/testinfo")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTestinfo(){
		logger.info("testInfo begin~");
		
		return ResponseUtil.buildNoCacheResponse(Response.status(200).entity("sdfsdf"));
	}
	
}
