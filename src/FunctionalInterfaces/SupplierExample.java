package FunctionalInterfaces;
import java.util.List;
import java.util.function.Supplier;

import StudentData.Student;
import StudentData.StudentDataBase;

public class SupplierExample {
	static Supplier<List<Student>> stdentList = () -> StudentDataBase.getAllStudents();
	
	public static void main(String[] args) {
		System.out.print(stdentList.get());
	}

}
