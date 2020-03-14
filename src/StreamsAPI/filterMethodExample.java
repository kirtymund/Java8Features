package StreamsAPI;

import StudentData.Student;
import StudentData.StudentDataBase; 
import static java.util.stream.Collectors.toList;

import java.util.List;

public class filterMethodExample {
	public static List<Student> filtermethod(){
	return StudentDataBase.getAllStudents().stream().filter(student -> student.getGender().equals("female")).collect(toList());
	}
	public static void main(String[] args) {

		filtermethod().forEach(System.out::println);
	
	}

}
