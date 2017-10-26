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
		location1.setCoordinate(0,3,4);
		assertEquals("(0.0,3.0,4.0)", location1.getCoordinate());
	}

}
