/**
 * 
 */
package com.haih.utils.generic;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 * @author haih
 *
 */
public class ResponseUtil {
	/**
	 * build a response with nocache
	 * @param builder
	 * @return
	 */
	public static Response buildNoCacheResponse(ResponseBuilder builder){
		return builder
				.header("Cache-control", "no-cache")
				.header("Cache-control", "no-store")
				.header("Pragma", "no-cache")
				.header("Expires", "0")
				.build();
	}
	
	/**
	 * response add no cache header
	 * @param builder
	 * @return
	 */
	public static ResponseBuilder addNoCacheHeader(ResponseBuilder builder) {
		return builder
				.header("Cache-control", "no-cache")
				.header("Cache-control", "no-store")
				.header("Pragma", "no-cache")
				.header("Expires", "0");
	}
	 
}
