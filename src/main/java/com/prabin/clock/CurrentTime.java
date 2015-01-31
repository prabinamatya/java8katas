package com.prabin.clock;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

public class CurrentTime {
	public void showTime() {
		Clock clock = Clock.systemDefaultZone();
		System.out.println("clock = " + clock);
		long millis = clock.millis();
		System.out.println("millis = " + millis);

		Instant instant = clock.instant();
		System.out.println("instant = " + instant);
		Date legacyDate = Date.from(instant);
		System.out.println("legacyDate = " + legacyDate);
	}
}
