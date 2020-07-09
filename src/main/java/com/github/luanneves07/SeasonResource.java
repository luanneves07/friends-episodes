package com.github.luanneves07;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("season")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SeasonResource {

	@Inject
	EpisodeRepository episodeRepository;

	@GET
	public List<Episode> findAll() {
		return episodeRepository.listAll();
	}

	@GET
	@Path("/{season}")
	public List<Episode> findBySeason(@PathParam(value = "season") Integer season) {
		return episodeRepository.findBySeason(season);
	}
}
