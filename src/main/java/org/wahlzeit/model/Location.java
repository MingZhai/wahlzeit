package org.wahlzeit.model;

public class Location {

	public Coordinate coordinate;
	protected String name;

	
	public Location(String name) {
		this.name = new String(name);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
	public Coordinate getCoordinate() {
		return this.coordinate;
	}
}
