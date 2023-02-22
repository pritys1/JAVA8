package lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import Data.Student;
import Data.StudentDatabase;

public class BiFunctionExample {
	static BiFunction<List<Student>,Predicate<Student>,Map<String,Double>> bifunc=(students,studentpredicate)->{
		Map<String ,Double> studentGradeMap=new HashMap<>();
		students.forEach(student->{
			if(studentpredicate.test(student))
			{
				studentGradeMap.put(student.getName(),student.getGpa());
			}
		});
		return studentGradeMap;
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bifunc.apply(StudentDatabase.getAllStudents(),PredicateandConsumerExample.p2));

	}

}
