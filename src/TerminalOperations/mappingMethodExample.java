package TerminalOperations;

import StudentData.Student;
import StudentData.StudentDataBase;
import static java.util.stream.Collectors.toList;

import java.util.List;

import static java.util.stream.Collectors.mapping;

public class mappingMethodExample {

	public static void main(String[] args) {
		List<String> names = StudentDataBase.getAllStudents().stream().collect(mapping(Student::getName,toList()));
		
		System.out.println(names);
	}

}
