package NumericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamExample {
public static List<Integer> maptoObjectMethod(){
	return IntStream.rangeClosed(1, 5).mapToObj(i -> new Integer(i)).collect(Collectors.toList());
	
}
public static long maptoLongMethod(){
	return IntStream.rangeClosed(1, 5).mapToLong(i->i).sum();
}
	
public static double maptoDoubleMethod(){
	return IntStream.rangeClosed(1, 5).mapToDouble(i->i).sum();
}
	
	public static void main(String[] args) {
		System.out.println(maptoObjectMethod());
		System.out.println(maptoLongMethod());
		System.out.println(maptoDoubleMethod());
	}

}
