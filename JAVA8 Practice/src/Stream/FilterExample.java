package Stream;

import java.util.List;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDatabase;

public class FilterExample {
public static List<Student> filterStudents()
{
	return  StudentDatabase.getAllStudents().stream().filter(student->student.getGender().equals("female")).collect(Collectors.toList());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(filterStudents());

	}

}
