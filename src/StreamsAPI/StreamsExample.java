package StreamsAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import FunctionalInterfaces.PredicateStudent;
import StudentData.Student;
import StudentData.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {
		Map<String, List<String>> map = StudentDataBase.getAllStudents().parallelStream()
				.filter((PredicateStudent.p1).and(PredicateStudent.p2))
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(map);
	}

}
