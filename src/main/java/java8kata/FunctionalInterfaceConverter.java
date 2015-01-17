package java8kata;

@FunctionalInterface
public interface FunctionalInterfaceConverter<F, T> {
	T convert(F from);
}
