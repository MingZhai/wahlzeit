package org.wahlzeit.model;

import static org.junit.Assert.*;

import org.junit.Test;

import com.googlecode.objectify.ObjectifyService;

public class RiverPhotoTest {

	@Test
	public void testRiverPhotoStringIntInt() {
		
		RiverPhotoFactory factory = new RiverPhotoFactory();
		
//		RiverPhoto ph1 = new RiverPhoto("test", 1, 2);
		RiverPhoto ph1 = factory.createPhoto();
		assertNotNull(ph1.getId());
		assertEquals("test", ph1.getName());
		assertEquals(1, ph1.getLength());
		assertEquals(2, ph1.getFlow());
	}

	@Test
	public void testRiverPhotoPhotoIdStringIntInt() {
		
		PhotoId id = new PhotoId(100);
		
		RiverPhotoFactory factory = new RiverPhotoFactory();
		RiverPhoto ph1 = factory.createPhoto(id, "test", 1, 2);
		
//		RiverPhoto ph1 = new RiverPhoto(id,"test", 1, 2);
		assertEquals("100",ph1.getIdAsString());
		assertEquals("test", ph1.getName());
		assertEquals(1, ph1.getLength());
		assertEquals(2, ph1.getFlow());
	}

}
