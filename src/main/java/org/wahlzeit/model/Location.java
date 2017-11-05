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
	
	public void setCoordinate(double x, double y, double z) {
		this.coordinate = new Coordinate(x, y, z);
	}
	
	public String getCoordinate() {
		String tmp = new String("(" 
									+ String.valueOf(this.coordinate.getXCoordinate()) + "," 
									+ String.valueOf(this.coordinate.getYCoordinate()) + ","
									+ String.valueOf(this.coordinate.getZCoordinate()) + 
									")");
		return tmp;
	}
}
