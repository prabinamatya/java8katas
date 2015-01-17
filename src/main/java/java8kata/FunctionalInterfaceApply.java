package java8kata;

public class FunctionalInterfaceApply implements
		FunctionalInterfaceConverter<String, Integer> {
	/*
	 * What's the point of this overridden method then?
	 */
	@Override
	public Integer convert(String from) {
		return null;
	}

	public void apply() {
		FunctionalInterfaceConverter<String, Integer> converter = (from) -> Integer
				.valueOf(from);
		Integer converted = converter.convert("123");
		System.out.println(converted);
	}

	public void furtherSimplify() {
		FunctionalInterfaceConverter<String, Integer> converter = Integer::valueOf;
		Integer converted = converter.convert("456");
		System.out.println(converted);
	}
}
