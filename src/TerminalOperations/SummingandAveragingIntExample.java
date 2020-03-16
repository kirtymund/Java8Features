package TerminalOperations;

import java.util.stream.Collectors;

import StudentData.Student;
import StudentData.StudentDataBase;


public class SummingandAveragingIntExample {

	public static Integer sum() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNotebooks));
	}
	public static Double average() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNotebooks));
	}
	public static void main(String[] args) {
		System.out.println(sum() +" ---- "+average());
	}

}
