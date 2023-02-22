package Stream;

import Data.StudentDatabase;

//takes in s predicate as an input and returns a Boolean as an output allMatch(),anyMatch() noneMatch()
public class MatchExample {
	public static Boolean  allMatch()
	{
		return StudentDatabase.getAllStudents().stream().allMatch(student->student.getGpa()>3.9);
	}
	public static Boolean  anyMatch()
	{
		return StudentDatabase.getAllStudents().stream().anyMatch(student->student.getGpa()>=3.9);
	}
	public static Boolean  noneMatch()
	{
		return StudentDatabase.getAllStudents().stream().noneMatch(student->student.getGpa()>=4.9);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(allMatch());
		System.out.println(anyMatch());
		System.out.println(noneMatch());

	}

}
