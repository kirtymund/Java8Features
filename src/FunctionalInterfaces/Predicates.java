package FunctionalInterfaces;
import java.util.function.*;
public class Predicates {

	public static int[] testmethod(Predicate<Integer> p, int[] x) {
		int j=0;
		int[] y = new int[6];
		for(int i =0; i<x.length;i++) {
			if(p.test(x[i])) {
				y[j]= x[i];
				j++;
			}
		}
		return x;
	}
	public static void main(String[] args) {
		int[] x = {0, 5, 10, 15, 20, 25, 30};
		Predicate<Integer> p1 = i -> i>10;
		Predicate<Integer> p2 = i -> i%2 == 0;
		System.out.println("Numbers greater than 10 and divisible by 2 ");
		 int[] y = testmethod(p1.and(p2),x);
		 for(int y1:y) {  System.out.println(y1); }
		testmethod(p1.or(p2),x);
		testmethod(p1.negate(),x);
	}

}
