package Stream;

import java.util.ArrayList;
import java.util.Collections;
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
//		System.out.println(printCustomSortedactivities());
		Integer in=new Integer(11);
		Integer in1=in;
		Integer in2=new Integer(14);
		Integer in3=new Integer(13);
		Integer in4=new Integer(10);
		List<Integer> list=new ArrayList<Integer>();
		list.add(in);
		list.add(in1);
		list.add(in2);
		list.add(in3);
		list.add(in4);
		/*System.out.println(list);
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);*/
		System.out.println(in==in1);
		
		

	}

}
