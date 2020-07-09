package com.github.luanneves07;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("name")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EpisodeResource {

	@Inject
	EpisodeRepository episodeRepository;

	@GET
	@Path("/{name}")
	public Episode findByName(@PathParam(value = "name") String name) {
		return episodeRepository.findByName(name);
	}
}
