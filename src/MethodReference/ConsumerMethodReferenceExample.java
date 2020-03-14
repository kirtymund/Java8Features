package MethodReference;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import FunctionalInterfaces.*;

import StudentData.Student;
import StudentData.StudentDataBase;

public class ConsumerMethodReferenceExample {
	
	static Consumer<Student> printStudent = System.out::println;
	static Consumer<Student> printactivities = student -> System.out.println(student.getActivities());
	static Consumer<Student> printactivities1 = Student::printListOfActivities;
	public static void main(String[] args) {
		
		StudentDataBase.getAllStudents().forEach(printStudent);
		StudentDataBase.getAllStudents().forEach(printactivities);
		System.out.println(" ------------------------ ");
		StudentDataBase.getAllStudents().forEach(printactivities1);
	}

}
