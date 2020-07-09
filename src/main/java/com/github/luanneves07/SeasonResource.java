package com.github.luanneves07;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("season")
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
