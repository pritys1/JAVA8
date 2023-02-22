package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;
import Data.Student;
import Data.StudentDatabase;

public class ReduceExample {
	public static int performMultiplication(List<Integer> integerlist)
	{
		return integerlist.stream().reduce(1, (a,b)->a*b);
	}
	public static Optional<Integer> performAddLimit(List<Integer> integerlist)
	{
		return integerlist.stream().limit(2).reduce((a,b)->a+b);
	}
	
	
	public static Optional<Student> getHighestGPAStudent()
	{
		return StudentDatabase.getAllStudents().stream().reduce((s1,s2)->(s1.getGpa()>s2.getGpa())?s1:s2);
			
		
	}
	
	public static int numOfBooks()
	{
		return StudentDatabase.getAllStudents()
				.stream()
				.filter(student->student.getGradelevel()>=3).filter(student->student.getGender().contentEquals("female"))
				.map(Student::getNoteBooks)
				//.reduce(0,(a,b)->a+b);
				.reduce(0,Integer::sum);
	}
	public static Optional<Integer> findMax(List<Integer> integerlist)
	{
		return  integerlist.stream().reduce((x,y)->x>y?x:y);
	}
	public static Optional<Integer> findMin(List<Integer> integerlist)
	{
		return  integerlist.stream().reduce((x,y)->x<y?x:y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integer=Arrays.asList(1,3,5,7,6,8,10);
		List<Integer> inte=new ArrayList<>();
		System.out.println(performMultiplication(integer));
		System.out.println(getHighestGPAStudent());
		System.out.println(numOfBooks());
		System.out.println(findMax(integer));
		System.out.println(findMax(inte).isPresent());
		System.out.println(performAddLimit(integer));

	}

}
