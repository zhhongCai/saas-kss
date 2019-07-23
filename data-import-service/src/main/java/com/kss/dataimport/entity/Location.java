
package com.kss.dataimport.entity;

import com.arangodb.springframework.annotation.Document;
import com.arangodb.springframework.annotation.GeoIndexed;
import org.springframework.data.annotation.Id;

import java.util.Arrays;

@Document("locations")
public class Location {

	@Id
	private String id;
	private final String name;
	@GeoIndexed
	private final double[] location;

	public Location(final String name, final double[] location) {
		super();
		this.name = name;
		this.location = location;
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public double[] getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", name=" + name + ", location=" + Arrays.toString(location) + "]";
	}

}
