package StreamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxOptionalreduceMethodExample {

	public static int maxValue(List<Integer> maxvalue) {
		int max = maxvalue.stream().reduce(0, ((a,b) -> a>b ?a:b));
		return max;
	}
	public static Optional<Integer> maxValueOptional(List<Integer> maxvalue) {
		Optional<Integer> max = maxvalue.stream().reduce(((a,b) -> a>b ?a:b));
		return max;
	}
	public static Optional<Integer> minValueOptional(List<Integer> minvalue) {
		Optional<Integer> min = minvalue.stream().reduce( ((a,b) -> a<b ?a:b));
		return min;
	}
	
	public static void main(String[] args) {
		List<Integer> value = Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(maxValue(value));
		System.out.println(minValueOptional(value).get());
		List<Integer> maxvalue1 = new ArrayList<Integer>();
		//System.out.println(maxValue(maxvalue1));
		if(maxValueOptional(maxvalue1).isPresent())
		{
			System.out.println(maxValueOptional(maxvalue1).get());
		}
		else {
			System.out.println("Empty List");
		}
		if(minValueOptional(maxvalue1).isPresent())
		{
			System.out.println(maxValueOptional(maxvalue1).get());
		}
		else {
			System.out.println("Empty List");
		}
	}

}
