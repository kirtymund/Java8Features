package FunctionalInterfaces;
import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> compare = (a,b) -> a.compareTo(b);
	
	public static void main(String[] args) {
		
		BinaryOperator<Integer> binary = (a,b) -> a*b;
		System.out.println(binary.apply(4, 5));
		BinaryOperator<Integer> binarycompare = BinaryOperator.maxBy(compare);
		System.out.println(binarycompare.apply(66, 77));
		BinaryOperator<Integer> binarycomparemin = BinaryOperator.minBy(compare);
		System.out.println(binarycomparemin.apply(66, 77));
	}

}
