package StreamsAPI;

import java.util.List;

import StudentData.Student;
import StudentData.StudentDataBase;
import java.util.Comparator;
import static java.util.stream.Collectors.toList;

public class ComparatorSortedMethodExamples {

	public static void main(String[] args) {
		
		Comparator compare = (a,b) -> {
			return ((String) a).compareTo((String) b);
			};
		List<Student> studentssortedbyNames = StudentDataBase.getAllStudents()
				.stream().sorted(Comparator.comparing(Student::getName)).collect(toList());
		//System.out.println(studentssortedbyNames);
		
		studentssortedbyNames.forEach(System.out::println);
		
		List<Student> studentssortedbyNamesDesc = StudentDataBase.getAllStudents()
				.stream().sorted(Comparator.comparing(Student::getGpa).reversed()).collect(toList());
		System.out.println("studentssortedbyNamesDesc ============");
		
		studentssortedbyNamesDesc.forEach(System.out::println);
				
	}

}
