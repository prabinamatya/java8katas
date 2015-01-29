package com.prabin.streams.parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class ParallelStreams {

	public void parallelSort() {
		List<String> elementList = createElement();
		long t0 = System.nanoTime();

		long count = elementList.parallelStream().sorted().count();
		System.out.println("count = " + count);

		long t1 = System.nanoTime();

		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);

		System.out.println(String.format("parallel sort took: %d ms", millis));
	}

	private List<String> createElement() {
		int max = 1000000;
		List<String> values = new ArrayList<String>();
		for (int i = 0; i < max; i++) {
			UUID uuid = UUID.randomUUID();
			values.add(String.valueOf(uuid));
		}
		return values;
	}

	public void sequentialSort() {
		List<String> elementList = createElement();
		long t0 = System.nanoTime();

		long count = elementList.stream().sorted().count();
		System.out.println("count = " + count);

		long t1 = System.nanoTime();

		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out
				.println(String.format("sequential sort took: %d ms", millis));

	}

}
