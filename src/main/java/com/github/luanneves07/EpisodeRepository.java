package com.github.luanneves07;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.mongodb.panache.PanacheMongoRepository;

@ApplicationScoped
public class EpisodeRepository implements PanacheMongoRepository<Episode> {

	public List<Episode> findBySeason(Integer season) {
		return list("season", season);
	}

	public Episode findByName(String name) {
		return find("name", name).firstResult();
	}
}
