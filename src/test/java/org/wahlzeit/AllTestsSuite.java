package org.wahlzeit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	org.wahlzeit.handlers.HandlerSuite.class,
	org.wahlzeit.model.ModelSuite.class,
	org.wahlzeit.model.persistence.ModelPersistenceSuite.class,
	org.wahlzeit.services.ServiceSuite.class,
	org.wahlzeit.services.mailing.EmailServiceTestSuite.class,
	org.wahlzeit.utils.UtilSuite.class
})

public class AllTestsSuite {

}
