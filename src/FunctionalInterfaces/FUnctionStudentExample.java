package FunctionalInterfaces;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

import StudentData.Student;
import StudentData.StudentDataBase;
public class FUnctionStudentExample {
	static Predicate<Student> p2 = student -> student.getGradeLevel() >= 3;
	
	static Function<List<Student>,Map<String,Double>> studentfunction = studentlist ->{
		Map<String,Double> studentmap = new HashMap<>();
		
		studentlist.forEach(student -> {
			if(p2.test(student)) {
		studentmap.put(student.getName(), student.getGpa());
		}});
		return studentmap;
		
	};
	public static void main(String[] args) {
		System.out.println(studentfunction.apply(StudentDataBase.getAllStudents()));
	}

}
