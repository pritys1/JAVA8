package Stream;

import Data.StudentDatabase;

import java.util.Optional;

import Data.Student;

public class FindAnyFindFirstExample {
	public static Optional<Student> findAny()
	{
		return StudentDatabase.getAllStudents().stream().filter(student->student.getGpa()>=3.9).findAny();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findAny());

	}

}
