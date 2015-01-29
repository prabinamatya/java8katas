package com.prabin.streams.parallel;

import org.junit.Test;

public class ParallelStreamsTest {
	ParallelStreams testObject = new ParallelStreams();

	@Test
	public void testParallelSort() {
		testObject.parallelSort();
	}

	@Test
	public void testSequentialSort() throws Exception {
		testObject.sequentialSort();
	}

}
