package com.prabin.lamda.scope;

@FunctionalInterface
public interface Converter<F, T> {
	T convert(F from);
}
