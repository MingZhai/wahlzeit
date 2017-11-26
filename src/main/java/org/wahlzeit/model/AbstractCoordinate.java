package org.wahlzeit.model;

public abstract class AbstractCoordinate implements Coordinate{

	@Override
	public double getDistance(Coordinate coord) {
		return getCartesianDistance(coord);
	}
	
	@Override
	public double getSphericDistance(Coordinate coord) {
		SphericCoordinate SpheCoordinate = asSphericCoordinate();
		return SpheCoordinate.getSphericDistance(coord);
	}
	
//	@Override
	public double getCartesianDistance(Coordinate coord) {
		CartesianCoordinate carCoordinate = asCartesianCoordinate(); 
		return carCoordinate.getCartesianDistance(coord);
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
	
	public abstract boolean isEqual(Coordinate coordinate);
	
}
