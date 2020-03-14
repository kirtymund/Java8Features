package StreamsAPI;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class factoryMethodsExample {

	public static void main(String[] args) {
		Stream<String> streamof = Stream.of("adam","julie","dan");
		streamof.forEach(System.out::println);
		
		Stream.iterate(1, x->x*2).limit(10).forEach(System.out::println);
		Supplier<Integer> suplier = new Random()::nextInt;
		Stream.generate(suplier).limit(5).forEach(System.out::println);
	}

}
