package org.wahlzeit.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SphericCoordinateTest {

	CartesianCoordinate caCoordinate;
	SphericCoordinate spheCoordinate;
	SphericCoordinate spheCoordinate_b;
	SphericCoordinate spheCoordinate_new;
	
	@Before
	public void setUp() throws Exception {
		caCoordinate = new CartesianCoordinate(1.0, 2.0, 3.0);
		spheCoordinate = new SphericCoordinate(1.0, 2.0, 3.0);
		spheCoordinate_b = new SphericCoordinate(1.0, 2.0, 3.0);
		spheCoordinate_new = new SphericCoordinate(1.0, 5.0, 7.0);
	}

	@Test
	public void testAsSphericCoordinate() {
		assertTrue(caCoordinate.asSphericCoordinate() instanceof SphericCoordinate);
	}

	@Test
	public void testGetSphericDistance() {
		assertEquals(spheCoordinate.getDistance(spheCoordinate_new), 6.35603, 0.00001);
	}
	
	@Test
	public void testGetDistance() {
		assertEquals(spheCoordinate.getDistance(spheCoordinate_b), 0, 0.000000001);
	}

	@Test
	public void testAsCartesianCoordinate() {
		spheCoordinate.asCartesianCoordinate();
	}

	@Test
	public void testGetCartesianDistance() {
		assertNotNull(spheCoordinate.getCartesianDistance(caCoordinate));
	}

	@Test
	public void testIsEqual() {
		spheCoordinate.isEqual(spheCoordinate_b);
	}

	@Test
	public void testGetLatitude() {
		assertEquals(spheCoordinate.getLatitude(), 1.0, 0.001);
	}

	@Test
	public void testGetLongitude() {
		assertEquals(spheCoordinate.getLongitude(), 2.0, 0.001);
	}

	@Test
	public void testGetRadius() {
		assertEquals(spheCoordinate.getRadius(), 3.0, 0.001);
	}

}
