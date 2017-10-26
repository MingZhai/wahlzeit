package org.wahlzeit.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoordinateTest {

	private static Coordinate coordinate1 = new Coordinate(0,3,4);
	private static Coordinate coordinate2 = new Coordinate(0,6,8);
	private static Coordinate coordinate3 = new Coordinate(0,3,4);
	
	@Test
	public void testGetDistance() {
		assertEquals(5, coordinate1.getDistance(coordinate2), 0.0001);
	}

	@Test
	public void testIsEqual() {
		assertEquals(true, coordinate1.isEqual(coordinate1));
		assertEquals(false, coordinate1.isEqual(coordinate2));
	}

	@Test
	public void testGetXCoordinate() {
		assertEquals(0, coordinate1.getXCoordinate(), 0.0001);
	}

	@Test
	public void testGetYCoordinate() {
		assertEquals(3, coordinate1.getYCoordinate(), 0.0001);
	}

	@Test
	public void testGetZCoordinate() {
		assertEquals(4, coordinate1.getZCoordinate(), 0.0001);
	}

}

