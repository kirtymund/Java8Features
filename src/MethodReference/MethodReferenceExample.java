package MethodReference;

import java.util.function.Function;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Function<String,String> example = s -> s.toUpperCase();
		System.out.println(example.apply("java8"));
		Function<String,String> example1 = String :: toUpperCase;
		System.out.println(example1.apply("java8"));
	}

}
