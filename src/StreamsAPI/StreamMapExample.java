package StreamsAPI;

import StudentData.Student;
import StudentData.StudentDataBase;
import static java.util.stream.Collectors.toList;

import java.util.List;
//map()
//flatMap()
//distinct()
//sorted()
//count()
public class StreamMapExample {

	public static void main(String[] args) {
		// As student activities is a list of elements map() is applying a function to
		// get list of list of Student Activities so the variable used is
		// List<List<String>>
		List<List<String>> listofStudentActivities = StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities).collect(toList());
		System.out.println(listofStudentActivities);
		//flatMap() is used to covert List<List<Activities>> into flat map i.e, List<Activities>
		List<String> listofActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).collect(toList());
		System.out.println(listofActivities);
		//to get unique no. list of activities we use distinct() 
		List<String> listofDistictActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).distinct().collect(toList());
		System.out.println(listofDistictActivities);
		//to sort the list into default natural sorting order we use sorted()
		List<String> listofsortedDistictActivities = StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities).flatMap(List::stream).distinct().sorted().collect(toList());
		System.out.println(listofsortedDistictActivities);
		//to get the total count of Activities
		long countofActivities =  StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities).flatMap(List::stream).distinct().sorted().count();
		System.out.println(countofActivities);
	}

}
