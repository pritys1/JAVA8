package Data;

import java.util.Comparator;
import java.util.List;

public class Student  {
	private String name;
	private int gradelevel;
	private double gpa;
	private String gender;
	private List<String> activities;
	private int noteBooks;
	
	public Student(String name, int gradelevel, double gpa, String gender, List<String> activities, int noteBooks) {
		super();
		this.name = name;
		this.gradelevel = gradelevel;
		this.gpa = gpa;
		this.gender = gender;
		this.activities = activities;
		this.noteBooks = noteBooks;
	}





	public int getNoteBooks() {
		return noteBooks;
	}





	public void setNoteBooks(int noteBooks) {
		this.noteBooks = noteBooks;
	}





	public Student(String name, int gradelevel, double gpa, String gender, List<String> activities) {
		super();
		this.name = name;
		this.gradelevel = gradelevel;
		this.gpa = gpa;
		this.gender = gender;
		this.activities = activities;
	}
	
	



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGradelevel() {
		return gradelevel;
	}
	public void setGradelevel(int gradelevel) {
		this.gradelevel = gradelevel;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getActivities() {
		return activities;
	}
	public void setActivities(List<String> activities) {
		this.activities = activities;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gradelevel=" + gradelevel + ", gpa=" + gpa + ", gender=" + gender
				+ ", activities=" + activities + "]";
	}





	







}
