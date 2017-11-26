package org.wahlzeit.model;

public class SphericCoordinate extends AbstractCoordinate{

	private double latitude;
	private double longitude;
	private double radius;
	private static final double DELTA = 0.00001;
	
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
	
	@Override
	public boolean isEqual(Coordinate coord) {
		if (coord == null)
			return false;
		else if (Math.abs(latitude - coord.asSphericCoordinate().latitude) >= DELTA )
			return false;
		else if (Math.abs(longitude - coord.asSphericCoordinate().longitude) >= DELTA)
			return false;
		else if (Math.abs(radius - coord.asSphericCoordinate().radius) >= DELTA)
			return false;
		else 
			return true;
	}
}
