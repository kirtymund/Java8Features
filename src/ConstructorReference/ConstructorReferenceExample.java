package ConstructorReference;

import java.util.function.Function;
import java.util.function.Supplier;

import StudentData.Student;
import StudentData.StudentDataBase;

public class ConstructorReferenceExample {

	static Supplier<Student> spplierstudent = Student::new;
	static Function<String,Student> functionStudent = Student::new;
	public static void main(String[] args) {
		System.out.println(spplierstudent.get());
		System.out.println(functionStudent.apply("Aman"));
	}

}
