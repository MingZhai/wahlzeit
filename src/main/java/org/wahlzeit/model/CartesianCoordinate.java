package org.wahlzeit.model;

public class CartesianCoordinate implements Coordinate{

	private double x;
	private double y;
	private double z;
	
	
	public CartesianCoordinate(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public CartesianCoordinate asCartesianCoordinate() {
		return this;
		
	}
	
	@Override
	public double getCartesianDistance(Coordinate coord) {
		CartesianCoordinate carCoordinate = coord.asCartesianCoordinate();

		double distanceSquare = Math.pow((x - carCoordinate.x),2) +
		Math.pow((y - carCoordinate.y),2) + 
		Math.pow((z - carCoordinate.z),2);
		
		return Math.sqrt(distanceSquare);
	}
	
	@Override
	public double getDistance(Coordinate coord) {
		return getCartesianDistance(coord);
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
		CartesianCoordinate other = (CartesianCoordinate) obj;

		return isEqual(other);
	}
	
	@Override
	public boolean isEqual(Coordinate other) {
		if (other == null)
			return false;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.asCartesianCoordinate().x) )
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.asCartesianCoordinate().y) )
			return false;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.asCartesianCoordinate().z) )
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

	@Override
	public SphericCoordinate asSphericCoordinate() {
		double radius = Math.sqrt(Math.pow(x, 2) + 
								  Math.pow(y, 2) + 
								  Math.pow(z, 2)
								 );
		
		double latitude = Math.acos(x/radius);
		double longitude = Math.atan(y/x);
		
		SphericCoordinate SpheCoordinate = new SphericCoordinate(latitude, longitude, radius);
		return SpheCoordinate;
	}

	@Override
	public double getSphericDistance(Coordinate coord) {
		SphericCoordinate SpheCoordinate = asSphericCoordinate();
		return SpheCoordinate.getSphericDistance(coord);
	}

}
