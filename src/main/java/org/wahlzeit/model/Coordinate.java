package org.wahlzeit.model;

public class Coordinate {

	private double x;
	private double y;
	private double z;
	
	
	public Coordinate(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getDistance(Coordinate otherCdnt) {
		double distanceSquare = Math.pow((x - otherCdnt.x),2) +
								Math.pow((y - otherCdnt.y),2) + 
								Math.pow((z - otherCdnt.z),2);
		return Math.sqrt(distanceSquare);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(z);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Coordinate))
			return false;
		Coordinate other = (Coordinate) obj;

		return isEqual(other);
	}
	
	
	public boolean isEqual(Coordinate other) {
		if (other == null)
			return false;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
			return false;
		else 
			return true;
	}
	
	public double getXCoordinate() {
		return this.x;
	}
	
	public double getYCoordinate() {
		return this.y;
	}
	
	public double getZCoordinate() {
		return this.z;
	}
}
