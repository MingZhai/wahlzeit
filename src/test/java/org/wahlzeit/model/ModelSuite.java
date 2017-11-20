package org.wahlzeit.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AccessRightsTest.class, FlagReasonTest.class, GenderTest.class, GuestTest.class,
		LocationTest.class, PhotoFilterTest.class, RiverPhotoFactoryTest.class, RiverPhotoManagerTest.class,
		RiverPhotoTest.class, TagsTest.class, UserStatusTest.class, ValueTest.class, CartesianCoordinateTest.class, SphericCoordinateTest.class })
public class ModelSuite {

}
