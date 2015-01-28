package com.prabin.lamda.scope;

import org.junit.Test;

public class LamdaScopeTest {

	@Test
	public void testReadFinalLocalVariables() {
		LamdaScope testObject = new LamdaScope();
		testObject.readFinalLocalVariables();
	}

}
