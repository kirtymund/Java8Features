package TerminalOperations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import StudentData.StudentDataBase;
import StudentData.Student;

public class GroupingByExample1 {

	public static void groupingBymethod1() {
		Map<String, List<Student>> collect = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
		System.out.println(collect);

	}

	public static void groupingBymethod2() {
		Map<Integer, Map<Object, List<Student>>> collect = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
		System.out.println(collect);

	}
	public static void groupingBymethod3() {
		Map<String, Integer> collect = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName,Collectors.summingInt(Student::getNotebooks)				
						));
		System.out.println(collect);

	}
	


	public static void main(String[] args) {
		groupingBymethod1();
		groupingBymethod2();
		groupingBymethod3();
	}

}
