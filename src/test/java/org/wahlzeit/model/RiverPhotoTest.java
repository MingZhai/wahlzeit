package org.wahlzeit.model;

import static org.junit.Assert.*;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.wahlzeit.testEnvironmentProvider.LocalDatastoreServiceTestConfigProvider;
import org.wahlzeit.testEnvironmentProvider.RegisteredOfyEnvironmentProvider;
import org.wahlzeit.testEnvironmentProvider.SysConfigProvider;
import org.wahlzeit.testEnvironmentProvider.UserServiceProvider;
import org.wahlzeit.testEnvironmentProvider.UserSessionProvider;

public class RiverPhotoTest {

	@ClassRule
	public static RuleChain ruleChain = RuleChain.
			outerRule(new LocalDatastoreServiceTestConfigProvider()).
			around(new RegisteredOfyEnvironmentProvider()).
			around(new SysConfigProvider()).
			around(new UserServiceProvider()).
			around(new UserSessionProvider());
	
	@Test
	public void testRiverPhotoStringIntInt() {
		
		RiverPhotoFactory factory = new RiverPhotoFactory();
		PhotoId id = new PhotoId(100);
		RiverPhoto ph1 = factory.createPhoto(id);
		assertNotNull(ph1.getId());
//		assertEquals("test", ph1.getName());
//		assertEquals(1, ph1.getLength());
//		assertEquals(2, ph1.getFlow());
	}

	@Test
	public void testRiverPhotoPhotoIdStringIntInt() {
		
		PhotoId id = new PhotoId(100);
		
		RiverPhotoFactory factory = new RiverPhotoFactory();
		RiverPhoto ph1 = factory.createPhoto(id);
		
		assertNotNull(ph1.getId());
//		assertEquals("test", ph1.getName());
//		assertEquals(1, ph1.getLength());
//		assertEquals(2, ph1.getFlow());
	}

}
