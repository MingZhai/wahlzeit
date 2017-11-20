package org.wahlzeit.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CartesianCoordinateTest {

	CartesianCoordinate caCoordinate;
	CartesianCoordinate caCoordinate_b;
	SphericCoordinate spheCoordinate;
	
	@Before
	public void setUp() throws Exception {
		caCoordinate = new CartesianCoordinate(1.0, 2.0, 3.0);
		spheCoordinate = new SphericCoordinate(1.0, 2.0, 3.0);
		caCoordinate_b = new CartesianCoordinate(1.0, 2.0, 3.0);
	}

	@Test
	public void testAsCartesianCoordinate() {
		assertTrue(spheCoordinate.asCartesianCoordinate() instanceof CartesianCoordinate);
	}

	@Test
	public void testGetCartesianDistance() {
		assertNotNull(caCoordinate.getCartesianDistance(spheCoordinate));
	}

	@Test
	public void testGetDistance() {
		assertEquals(caCoordinate.getDistance(caCoordinate_b), 0, 0.000000001);
	}

	@Test
	public void testIsEqual() {
		caCoordinate.isEqual(caCoordinate_b);
	}

	@Test
	public void testGetXCoordinate() {
		assertEquals(caCoordinate.getXCoordinate(), 1.0, 0.001);
	}

	@Test
	public void testGetYCoordinate() {
		assertEquals(caCoordinate.getYCoordinate(), 2.0, 0.001);
	}

	@Test
	public void testGetZCoordinate() {
		assertEquals(caCoordinate.getZCoordinate(), 3.0, 0.001);
	}

	@Test
	public void testAsSphericCoordinate() {
		assertTrue(caCoordinate.asSphericCoordinate() instanceof SphericCoordinate);
	}

	@Test
	public void testGetSphericDistance() {
		assertNotNull(caCoordinate.getSphericDistance(spheCoordinate));
	}

}
