package org.wahlzeit.model;

public class Coordinate {

	protected Double x;
	protected Double y;
	protected Double z;
	
	
	public Coordinate(double x, double y, double z) {
		this.x = new Double(x);
		this.y = new Double(y);
		this.z = new Double(z);
	}
	
	public double getDistance(Coordinate otherCdnt) {
		double distanceSquare = Math.pow((x - otherCdnt.x),2) +
								Math.pow((y - otherCdnt.y),2) + 
								Math.pow((z - otherCdnt.z),2);
		return Math.sqrt(distanceSquare);
	}
	
	public boolean isEqual(Coordinate otherCdnt) {
		if(x.equals(otherCdnt.x) && y.equals(otherCdnt.y) && z.equals(otherCdnt.z))
			return true;
		else 
			return false;
	}
	
	public Double getXCoordinate() {
		return this.x;
	}
	
	public Double getYCoordinate() {
		return this.y;
	}
	
	public Double getZCoordinate() {
		return this.z;
	}
}
