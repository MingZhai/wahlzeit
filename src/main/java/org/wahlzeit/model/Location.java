package org.wahlzeit.model;

public class Location {

	protected Coordinate coordinate;
	protected String name;
	
	public Location() {
	}
	public Location(String name) {
		this.name = new String(name);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setCoordinate(double x, double y, double z) {
		this.coordinate = new Coordinate(x, y, z);
	}
	
	public String getCoordinate() {
		String tmp = new String("(" 
									+ this.coordinate.getXCoordinate().toString() + "," 
									+ this.coordinate.getYCoordinate().toString() + ","
									+ this.coordinate.getZCoordinate().toString() + 
									")");
		return tmp;
	}
	
	
}
