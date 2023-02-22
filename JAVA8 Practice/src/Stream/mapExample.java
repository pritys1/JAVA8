package Stream;

import java.util.List;
import java.util.stream.*;

import Data.Student;
import Data.StudentDatabase;

public class mapExample {
public static List<String> namesList()
{
	return StudentDatabase.getAllStudents().stream().map(Student::getName).collect(Collectors.toList());
}
	public static void main(String[] args) {
		// TODO Auto-generated method st
System.out.println(namesList());
	}

}
