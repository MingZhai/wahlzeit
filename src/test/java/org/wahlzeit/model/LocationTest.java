package org.wahlzeit.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocationTest {

	private static Location location1 = new Location("location1");
	
	@Test
	public void testGetName() {
		assertEquals("location1", location1.getName());
	}

	@Test
	public void testGetCoordinate() {
		CartesianCoordinate carCoordinate = new CartesianCoordinate(0, 3, 4);
		location1.setCoordinate(carCoordinate);
		assertEquals(location1.getCoordinate().asCartesianCoordinate().getXCoordinate(), 0.0, 0.00001);
		assertEquals(location1.getCoordinate().asCartesianCoordinate().getYCoordinate(), 3.0, 0.00001);
		assertEquals(location1.getCoordinate().asCartesianCoordinate().getZCoordinate(), 4.0, 0.00001);
	}

}
