package FunctionalInterfaces;
import java.util.List;
import java.util.function.*;

import StudentData.Student;
import StudentData.StudentDataBase;

public class PredicateAndConsumerExample {

	Predicate<Student> p1 = student -> student.getGpa() >= 3.9;
	Predicate<Student> p2 = student -> student.getGradeLevel() >= 3;
	BiPredicate<Integer,Double> p3 = (gradelevel,gpa)-> gpa>=3.9 && gradelevel >=3;
	BiConsumer<String,List<String>> c2 = (name,activities) -> System.out.println(name+" : "+ activities);
	Consumer<Student> c1 = student ->{
		if(p3.test(student.getGradeLevel(),student.getGpa())) {
			c2.accept(student.getName(), student.getActivities());
		}
	};
	
	public void listofallStudent(List<Student> listofstudents) {
		listofstudents.forEach(c1);
	}
	public static void main(String[] args) {
		List<Student> listofstudents = StudentDataBase.getAllStudents();
		new PredicateAndConsumerExample().listofallStudent(listofstudents);
	}

}
