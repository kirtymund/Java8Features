package TerminalOperations;

import java.util.stream.Collectors;

import StudentData.Student;
import StudentData.StudentDataBase;

public class CountingMethodExamaple {

	static public long counting_1() {
		return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.9).count();
			//	.collect(Collectors.counting());
	}

	public static void main(String[] args) {
		System.out.println(counting_1());
	}

}
