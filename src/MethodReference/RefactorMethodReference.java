package MethodReference;

import java.util.function.Predicate;

import StudentData.Student;
import StudentData.StudentDataBase;

public class RefactorMethodReference {

	static Predicate<Student> p1 = RefactorMethodReference::staticmethod ;
	static boolean staticmethod(Student student) {
		return student.getGradeLevel() >= 3;
	}
	public static void main(String[] args) {
		
		System.out.println(p1.test(StudentDataBase.student.get())); 
	}

}
