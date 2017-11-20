package org.wahlzeit.model;

public class SphericCoordinate implements Coordinate{

	private double latitude;
	private double longitude;
	private double radius;
	
	public SphericCoordinate(double latitude, double longitude, double radius) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.radius = radius;
	}
	
	@Override
	public SphericCoordinate asSphericCoordinate() {
		return this;
	}
	
	@Override
	public double getSphericDistance(Coordinate coord) {
		
		SphericCoordinate SpheCoordinate = coord.asSphericCoordinate();
		double tmp = Math.pow(radius, 2) + Math.pow(SpheCoordinate.radius, 2) - 2 * radius * SpheCoordinate.radius *
					(Math.cos(latitude) * Math.cos(SpheCoordinate.latitude) + 
					 Math.cos(Math.abs(longitude - SpheCoordinate.longitude)) *
					 Math.sin(latitude) * Math.sin(SpheCoordinate.latitude)
					);
		return Math.sqrt(tmp);
	}

	@Override
	public CartesianCoordinate asCartesianCoordinate() {
		double z = radius * Math.sin(latitude);
		double x = radius * Math.cos(latitude) * Math.cos(longitude);
		double y = radius * Math.cos(latitude) * Math.sin(longitude);
		
		CartesianCoordinate carCoordinate = new CartesianCoordinate(x, y, z);
		return carCoordinate;
	}

	@Override
	public double getCartesianDistance(Coordinate coord) {
		CartesianCoordinate carCoordinate = asCartesianCoordinate(); 
		return carCoordinate.getCartesianDistance(coord);
	}

	@Override
	public double getDistance(Coordinate coord) {
		return getSphericDistance(coord);
	}

	@Override
	public boolean isEqual(Coordinate coord) {
		if (coord == null)
			return false;
		if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(coord.asSphericCoordinate().latitude) )
			return false;
		if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(coord.asSphericCoordinate().longitude) )
			return false;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(coord.asSphericCoordinate().radius) )
			return false;
		else 
			return true;
	}
	
	public double getLatitude() {
		return this.latitude;
	}
	
	public double getLongitude() {
		return this.longitude;
	}
	
	public double getRadius() {
		return this.radius;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(latitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitude);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SphericCoordinate))
			return false;
		SphericCoordinate other = (SphericCoordinate) obj;
		if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(other.latitude))
			return false;
		if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(other.longitude))
			return false;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}
}
