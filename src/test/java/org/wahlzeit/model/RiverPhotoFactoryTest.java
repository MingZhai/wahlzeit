package org.wahlzeit.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class RiverPhotoFactoryTest {


	@Test
	public void testGetInstance() {
		assertNotNull(RiverPhotoFactory.getInstance());
	}

}
