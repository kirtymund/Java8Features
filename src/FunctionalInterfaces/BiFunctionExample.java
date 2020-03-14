package FunctionalInterfaces;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import StudentData.Student;
import StudentData.StudentDataBase;

public class BiFunctionExample {
	
	static BiFunction<List<Student>,Predicate<Student>,Map<String,Double>> biFunction = (studentlist, predicate) -> {
		Map<String,Double> mapofStudent = new HashMap<>();
		studentlist.forEach(student -> {
			if(predicate.test(student)) {
				mapofStudent.put(student.getName(),student.getGpa());
			}
		});
		return mapofStudent;
	};

    public static void main(String[] args) {
    	PredicateAndConsumerExample f = new PredicateAndConsumerExample();
    	
    	Map<String, Double> map = biFunction.apply(StudentDataBase.getAllStudents(),f.p1);
    	System.out.println(map);

   }
}
