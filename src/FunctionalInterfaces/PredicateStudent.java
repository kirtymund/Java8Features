package FunctionalInterfaces;
import java.util.List;
import java.util.function.Predicate;

import StudentData.Student;
import StudentData.StudentDataBase;

public class PredicateStudent {

	public static Predicate<Student> p1 = student -> student.getGradeLevel() >=3;
	public static Predicate<Student> p2 = student -> student.getGpa() >=3.9;
	public static List<Student> allStudents = StudentDataBase.getAllStudents();
	
	public static void getStudentList() {
		//List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(student -> {
			if(p1.and(p2).test(student)) {
				System.out.println(student.getName() +" : "+ student.getGpa() +" : "+student.getGradeLevel());
			}
		});
		
	}
	public static void getStudentListwithnegate() {
		//List<Student> allStudents = StudentDataBase.getAllStudents();
		System.out.println("getStudentListwithnegate ------------");
		allStudents.forEach(student -> {
			if(p1.and(p2).negate().test(student)) {
				System.out.println(student.getName() +" : "+ student.getGpa() +" : "+student.getGradeLevel());
			}
		});
		
	}
	public static void getStudentListwithor() {
		//List<Student> allStudents = StudentDataBase.getAllStudents();
		System.out.println("getStudentListwithor ------------");
		allStudents.forEach(student -> {
			if(p1.or(p2).test(student)) {
				System.out.println(student.getName() +" : "+ student.getGpa() +" : "+student.getGradeLevel());
			}
		});
		
	}
	public static void main(String[] args) {
		getStudentList();
		getStudentListwithnegate();
		getStudentListwithor();
	}

}
