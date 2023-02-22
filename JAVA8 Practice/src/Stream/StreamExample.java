package Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDatabase;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,List<String>> studentmap=StudentDatabase.getAllStudents().stream().collect(Collectors.toMap(Student::getName, Student::getActivities));
StudentDatabase.getAllStudents().stream().forEach(student->System.out.println(student.getName()+" "+student.getActivities()));
	System.out.println(studentmap);
	}
	
	

}
