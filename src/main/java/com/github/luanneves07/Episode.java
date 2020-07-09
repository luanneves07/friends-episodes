package com.github.luanneves07;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import io.quarkus.mongodb.panache.MongoEntity;

@MongoEntity(collection = "samples_friends")
public class Episode {

	public ObjectId id;

	public String name;

	public Integer number;

	public Integer runtime;

	public Integer season;

	public String url;

	public String airdate;

	public String airtime;

	public String airstamp;

	public String summary;
	
	public Document image;
	
	@BsonProperty("_links")
	public Document links;
}
