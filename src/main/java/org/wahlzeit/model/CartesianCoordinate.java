package org.wahlzeit.model;

public class CartesianCoordinate extends AbstractCoordinate{

	private double x;
	private double y;
	private double z;
	private static final double DELTA = 0.00001;
	
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
	public boolean isEqual(Coordinate other) {
		if (other == null)
			return false;
		else if (Math.abs(x - other.asCartesianCoordinate().x) >= DELTA)
			return false;
		else if (Math.abs(y - other.asCartesianCoordinate().y) >= DELTA)
			return false;
		else if (Math.abs(z - other.asCartesianCoordinate().z) >= DELTA)
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
		double longitude = Math.atan2(y, x);
		
		SphericCoordinate SpheCoordinate = new SphericCoordinate(latitude, longitude, radius);
		return SpheCoordinate;
	}
}
