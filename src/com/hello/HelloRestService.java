package com.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class HelloRestService {
	
	@GET
	@Path("/verify")
	@Produces(MediaType.APPLICATION_JSON)
	public Response verifyRESTService() {
		
		return Response.status(200).entity("Success").build();
	}

}
