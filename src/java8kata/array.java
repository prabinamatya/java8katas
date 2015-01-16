package java8kata;

import java.util.Arrays;
import java.util.List;

public class array {

	public static void main(String[] args) {

		System.out.println("testing java 8");

		List<String> list = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		list.stream()
				// .filter(s->s.startsWith("c"))
				// .map(String::toUpperCase).sorted(new Comparator<String>() {
				//
				// @Override
				// public int compare(String o1, String o2) {
				// return o2.compareTo(o1);
				// }
				// })
				.sorted((String s1, String s2) -> s1.compareTo(s2))
				.forEach(System.out::println);

	}
}
