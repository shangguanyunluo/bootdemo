package bootdemo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MethodTest {

	@Test
	public void testLog() {
		Logger logger = LoggerFactory.getLogger(MethodTest.class);
		logger.info("hello world");
	}

}
