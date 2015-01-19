package java8kata;

import org.junit.Test;

public class FunctionalInterfaceApplyTest {

	FunctionalInterfaceApply testObject = new FunctionalInterfaceApply();

	@Test
	public void testApply() {
		testObject.apply();
	}

	@Test
	public void testreferObjectMethods() throws Exception {
		testObject.referObjectMethods();
	}
}
