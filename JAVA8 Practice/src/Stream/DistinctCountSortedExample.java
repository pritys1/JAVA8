package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import Data.Student;
import Data.StudentDatabase;

public class DistinctCountSortedExample {
	public static List<String> printDistinctactivities()
	{
		return StudentDatabase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().collect(Collectors.toList());
	}
	public static Long printNumOfactivities()
	{
		return StudentDatabase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().count();
	}
	public static List<String> printSortedactivities()
	{
		return StudentDatabase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
	}
	public static List<Student> printCustomSortedactivities()
	{
		return   StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(printDistinctactivities());
		//System.out.println(printNumOfactivities());
		//System.out.println(printSortedactivities());
		System.out.println(printCustomSortedactivities());

	}

}
