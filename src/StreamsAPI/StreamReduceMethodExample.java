package StreamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import StudentData.Student;
import StudentData.StudentDataBase;

public class StreamReduceMethodExample {

	public static int multiplylistelement(List<Integer> arraylist) {
		return arraylist.stream().reduce(1, (a, b) -> a * b);
	}

	public static Optional<Integer> multiplylistelementoptional(List<Integer> arraylist) {
		return arraylist.stream().reduce((a, b) -> a * b);
	}

	private static int mapfilterreducemethod() {
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGradeLevel() >= 3 && student.getGender().equals("female"))
				.map(Student::getNotebooks).reduce(0,Integer::sum);
	}
	private static Optional<Integer> mapfilterreducemethod1() {
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGradeLevel() >= 3 && student.getGender().equals("female"))
				.map(Student::getNotebooks).
				max(Integer::sum);
	}

	public static void main(String[] args) {
		List<Integer> interarray = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> interarray1 = new ArrayList<>();
		System.out.println(multiplylistelement(interarray));

		Optional<Integer> optionalvalue = multiplylistelementoptional(interarray);
		Optional<Integer> optionalvalue1 = multiplylistelementoptional(interarray1);
		System.out.println(optionalvalue.isPresent()); // 720
		if (optionalvalue.isPresent()) {
			System.out.println(optionalvalue.get());
		} // true
		System.out.println(optionalvalue1.isPresent());// 720
		if (optionalvalue1.isPresent()) {
			System.out.println(optionalvalue1.get());
		} // false
	//	System.out.println(optionalvalue1.get());// Exception in thread "main" java.util.NoSuchElementException: No
													// value present
													// at java.util.Optional.get(Optional.java:135)
													// at
													// StreamsAPI.StreamReduceExample.main(StreamReduceExample.java:28)
		
		System.out.println(mapfilterreducemethod());
		System.out.println(mapfilterreducemethod1().get());
	}

}
