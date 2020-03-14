package Lambdas;

import java.util.function.Consumer;

public class LocalVariables {

	static int i = 20;
	public static void main(String[] args) {
		Consumer<Integer> consume = value ->{
			value++;
			System.out.println(value+i);
		};
		consume.accept(5);
	}

}
