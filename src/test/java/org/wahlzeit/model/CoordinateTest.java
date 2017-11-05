package org.wahlzeit.model;

import static org.junit.Assert.*;


import org.junit.Test;

public class CoordinateTest {

	private static Coordinate coordinate1 = new Coordinate(0,3,4);
	private static Coordinate coordinate2 = new Coordinate(1,3,4);
	private static Coordinate coordinate3 = new Coordinate(0,6,8);
	private static Coordinate coordinate4 = new Coordinate(0,3,5);
	private static Coordinate coordinate5 = new Coordinate(0,3,4);

	private static Coordinate coordinate6 = null;
	
	
	@Test
	public void testGetDistance() {
		assertEquals(5, coordinate1.getDistance(coordinate3), 0.0001);
	}
	
	//Test all branches of isEqual()
	@Test
	public void testIsEqual() {
		assertFalse(coordinate1.isEqual(coordinate6));
		
		assertFalse(coordinate1.isEqual(coordinate2));
		assertFalse(coordinate1.isEqual(coordinate3));
		assertFalse(coordinate1.isEqual(coordinate4));
		
		assertTrue(coordinate1.isEqual(coordinate5));
	}
	
	//Test all branches of equals()
	@Test
	public void testEquals () {
		
		assertTrue(coordinate1.isEqual(coordinate1));
		assertFalse(coordinate1.equals(coordinate6));
		
		assertFalse(coordinate1.equals(coordinate2));
		assertFalse(coordinate1.equals(coordinate3));
		assertFalse(coordinate1.equals(coordinate4));
		
		assertTrue(coordinate1.isEqual(coordinate5));
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

