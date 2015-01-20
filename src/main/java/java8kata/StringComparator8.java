package java8kata;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringComparator8 {

	/*
	 * Stream implementation, and descending sort using lambda
	 */
	public void compareStringsJava8() {
		List<String> asList = Arrays.asList("a1", "a2", "b3", "c2", "c4");
		System.out.println("-----------lambda-----");

		asList.stream().filter(s -> s.startsWith("c"))
				.sorted((String s1, String s2) -> s2.compareTo(s1))
				.forEach(System.out::println);
	}

	/*
	 * 
	 */
	public void compareStringAnonymousClass() {
		System.out.println("-----------Anonymous Inner Class----");
		List<String> list = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		list.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase)
				.sorted(new Comparator<String>() {

					@Override
					public int compare(String o1, String o2) {
						return o2.compareTo(o1);
					}
				}).forEach(System.out::println);
	}

	public void mappingInJava8() {
		System.out.println("-----------HashMap implementation----");
		Map<String, String> map = Stream
				.of("A,1", "B,2", "C,3", "D,4", "E,5", "F,6", "G,7")
				.map(line -> line.split(","))
				.collect(Collectors.toMap(
						array -> array[0], 
						array -> array[1]
								));

		map.forEach((k, v) -> System.out.println("key = " + k + " /Value = "
				+ v));
	}

}
