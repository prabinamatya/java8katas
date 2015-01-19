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

	/*
	 * :: keyword -- pass references of methods or constructors. Below referring
	 * to static methods
	 */
	public void furtherSimplify() {
		FunctionalInterfaceConverter<String, Integer> converter = Integer::valueOf;
		Integer converted = converter.convert("456");
		System.out.println(converted);
	}

	// :: referring to object methods
	public void referObjectMethods() {
		Something something = new Something();
		FunctionalInterfaceConverter<String, String> converter = something::startsWith;
		String converted = converter.convert("Prabin");
		System.out.println(converted);
	}
}
