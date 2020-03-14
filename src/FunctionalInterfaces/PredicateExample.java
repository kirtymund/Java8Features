package FunctionalInterfaces;
import java.util.function.Predicate;

public class PredicateExample {
	static Predicate<Integer> p1= i -> i%2 ==0;
	static Predicate<Integer> p2= i -> i%5 ==0;
	public static void predicateAnd() {
		System.out.println("Predicate And :"+ p1.and(p2).test(10)); //true
		System.out.println("Predicate And :"+ p1.and(p2).test(8)); //false
	}
	public static void predicateOr() {
		System.out.println("Predicate Or :"+ p1.or(p2).test(10)); //true
		System.out.println("Predicate Or :"+ p1.or(p2).test(8)); //true
	}
	public static void predicateNegate() {
		System.out.println("Predicate Negate :"+ p1.and(p2).negate().test(10)); //false 
	
	}
	public static void main(String[] args) {
		
		System.out.println(p1.test(99));
		
		predicateAnd();
		predicateOr();
		predicateNegate();
		
}}
