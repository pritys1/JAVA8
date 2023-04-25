package Stream;

import java.util.List;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDatabase;

public class flatMapExample {
	public static List<String> printactivities()
	{
		return StudentDatabase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(printactivities());
		int i=10;
		int j=10;
		System.out.println(i==j);

	}

}
