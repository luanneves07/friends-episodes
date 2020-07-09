package com.github.luanneves07;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/friends")
public class HelloResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "{'message': 'INF335 – Ambientes para Concepção de Software TB06'}";
	}
}